-- 01. MOSTRAR UNA LISTA DE LOS CLIENTES

SELECT * FROM Cliente;

+--------+-------------+---------------+
| codigo | nombre      | domicilio     |
+--------+-------------+---------------+
|      1 | Juan Lopez  | Colon 123     |
|      2 | Luis Torres | Sucre 987     |
|      3 | Ana Garcia  | Sarmiento 576 |
+--------+-------------+---------------+

-- 02. MOSTRAR EL PRECIO MAXIMO ENTRE TODOS LOS ARTICULOS

SELECT MAX(precio) FROM Detalle;

+-------------+
| MAX(precio) |
+-------------+
|        4.00 |
+-------------+

-- 03. MOSTRAR EL ARTICULO A QUIEN LE CORRESPONDE EL PRECIO MAXIMO DE LA PREGUNTA
--     ANTERIOR.

SELECT articulo
FROM Detalle
WHERE precio = (SELECT MAX(precio) FROM Detalle);

+----------+
| articulo |
+----------+
| cuaderno |
+----------+

-- 04. PRECIO MEDIO ENTRE TODOS LOS ARTICULOS

SELECT DISTINCT articulo, precio FROM Detalle;

+----------+--------+
| articulo | precio |
+----------+--------+
| lapiz    |   1.00 |
| goma     |   0.50 |
| regla    |   1.50 |
| cuaderno |   4.00 |
| escuadra |   2.00 |
| folio    |   1.00 |
+----------+--------+

SELECT AVG(precio) AS PROMEDIO_PRECIO
FROM (SELECT DISTINCT articulo, precio FROM Detalle) MiTabla;

+-----------------+
| PROMEDIO_PRECIO |
+-----------------+
|        1.666667 |
+-----------------+

-- 05. MOSTRAR TODOS LOS ARTICULOS CON SU PRECIO DE VENTA

SELECT DISTINCT articulo, precio FROM Detalle;

+----------+--------+
| articulo | precio |
+----------+--------+
| lapiz    |   1.00 |
| goma     |   0.50 |
| regla    |   1.50 |
| cuaderno |   4.00 |
| escuadra |   2.00 |
| folio    |   1.00 |
+----------+--------+

-- 06. MOSTRAR EL ARTICULO CON EL MAXIMO PRECIO Y TAMBIEN 
--     EL ARTICULO CON MINIMO PRECIO

-- 06.1

SELECT DISTINCT articulo, precio
FROM Detalle
WHERE precio = (SELECT MAX(precio) FROM Detalle)
UNION
SELECT DISTINCT articulo, precio
FROM Detalle
WHERE precio = (SELECT MIN(precio) FROM Detalle);

+----------+--------+
| articulo | precio |
+----------+--------+
| cuaderno |   4.00 |
| goma     |   0.50 |
+----------+--------+

-- 06.2

SELECT MAX(T1.precio) AS PRECIO_MAXIMO, MIN(T2.precio) AS PRECIO_MINIMMO
FROM (SELECT DISTINCT articulo, precio FROM Detalle) T1, (SELECT DISTINCT articulo, precio FROM Detalle) T2;

+---------------+----------------+
| PRECIO_MAXIMO | PRECIO_MINIMMO |
+---------------+----------------+
|          4.00 |           0.50 |
+---------------+----------------+

-- 06.3

SELECT MAX(T1.precio) AS PRECIO_MAXIMO, MIN(T2.precio) AS PRECIO_MINIMMO
FROM (SELECT DISTINCT articulo, precio FROM Detalle) T1, (SELECT DISTINCT articulo, precio FROM Detalle) T2;

-- COMPARAR EL PRECIO MEDIO VERDADERO ENTRE TODOS LOS ARTICULOS

SELECT T1.articulo, T1.precio AS PRECIO_MAXIMO, T2.articulo, T2.precio AS PRECIO_MINIMO
FROM (SELECT DISTINCT articulo, precio FROM Detalle WHERE precio = (SELECT MAX(precio) FROM Detalle)) T1, 
     (SELECT DISTINCT articulo, precio FROM Detalle WHERE precio = (SELECT MIN(precio) FROM Detalle)) T2;

+----------+---------------+----------+---------------+
| articulo | PRECIO_MAXIMO | articulo | PRECIO_MINIMO |
+----------+---------------+----------+---------------+
| cuaderno |          4.00 | goma     |          0.50 |
+----------+---------------+----------+---------------+
+----------+--------+
| articulo | precio |
+----------+--------+
| lapiz    |   1.00 |
| goma     |   0.50 |
| regla    |   1.50 |
| cuaderno |   4.00 |
| escuadra |   2.00 |
| folio    |   1.00 |
+----------+--------+

+---------------------+----------------------+
| AVG(MiTabla.precio) | AVG(MiTabla2.precio) |
+---------------------+----------------------+
|            1.666667 |             1.388889 |
+---------------------+----------------------+

-- 07. MOSTRAR LOS ARTICULOS CUYO PRECIO SEA MAYOR AL PRECIO MEDIO DE TODOS LOS ARTICULOS

SELECT AVG(T1.precio)
FROM (SELECT DISTINCT articulo, precio FROM Detalle) T1;

+----------------+
| AVG(T1.precio) |
+----------------+
|       1.666667 |
+----------------+

SELECT DISTINCT articulo, precio FROM Detalle;

+----------+--------+
| articulo | precio |
+----------+--------+
| lapiz    |   1.00 |
| goma     |   0.50 |
| regla    |   1.50 |
| cuaderno |   4.00 |
| escuadra |   2.00 |
| folio    |   1.00 |
+----------+--------+

SELECT DISTINCT articulo, precio FROM Detalle WHERE precio > (SELECT AVG(T1.precio)
                                                   FROM (SELECT DISTINCT articulo, precio FROM Detalle) T1);

+----------+--------+
| articulo | precio |
+----------+--------+
| cuaderno |   4.00 |
| escuadra |   2.00 |
+----------+--------+

-- 08. MOSTRAR EN CUANTAS FACTURAS APARECE CADA ARTICULO

SELECT articulo, COUNT(numerofactura) AS CANTIDAD_FACTURAS
FROM Detalle
GROUP BY articulo;

+----------+-------------------+
| articulo | CANTIDAD_FACTURAS |
+----------+-------------------+
| lapiz    |                 3 |
| goma     |                 2 |
| regla    |                 1 |
| cuaderno |                 1 |
| escuadra |                 1 |
| folio    |                 1 |
+----------+-------------------+

-- MOSTRAR LOS PRODUCTOS CON MENOS COMPRAS O DEMANDA

SELECT COUNT(numerofactura) AS CANTIDAD_FACTURAS
FROM Detalle
GROUP BY articulo
ORDER BY CANTIDAD_FACTURAS
LIMIT 1;

+-------------------+
| CANTIDAD_FACTURAS |
+-------------------+
|                 1 |
+-------------------+

SELECT articulo, COUNT(numerofactura) AS CANTIDAD_FACTURAS
FROM Detalle
GROUP BY articulo
HAVING CANTIDAD_FACTURAS = (SELECT COUNT(numerofactura) AS CANTIDAD_FACTURAS
FROM Detalle
GROUP BY articulo
ORDER BY CANTIDAD_FACTURAS
LIMIT 1);

+----------+-------------------+
| articulo | CANTIDAD_FACTURAS |
+----------+-------------------+
| regla    |                 1 |
| cuaderno |                 1 |
| escuadra |                 1 |
| folio    |                 1 |
+----------+-------------------+

-- 09. MOSTRAR LA CANTIDAD DE ITEMS POR CADA FACTURAS.

SELECT numerofactura, COUNT(numeroitem) AS CANTIDAD_ITEMS
FROM Detalle
GROUP BY numerofactura;

+---------------+----------------+
| numerofactura | CANTIDAD_ITEMS |
+---------------+----------------+
|          1200 |              2 |
|          1201 |              3 |
|          1202 |              2 |
|          1300 |              2 |
+---------------+----------------+

-- 10. MOSTRAR LA FACTURA CON EL MAYOR NUMERO DE ITEMS.

SELECT COUNT(numeroitem) AS CANTIDAD_ITEMS
FROM Detalle
GROUP BY numerofactura
ORDER BY CANTIDAD_ITEMS DESC
LIMIT 1;

+----------------+
| CANTIDAD_ITEMS |
+----------------+
|              3 |
+----------------+

SELECT numerofactura, COUNT(numeroitem) AS CANTIDAD_ITEMS
FROM Detalle
GROUP BY numerofactura
HAVING CANTIDAD_ITEMS = (SELECT COUNT(numeroitem) AS CANTIDAD_ITEMS
FROM Detalle
GROUP BY numerofactura
ORDER BY CANTIDAD_ITEMS DESC
LIMIT 1);

+---------------+----------------+
| numerofactura | CANTIDAD_ITEMS |
+---------------+----------------+
|          1201 |              3 |
+---------------+----------------+

-- MOSTRAR LA CANTIDAD DE FACTURAS POR CLIENTE.

SELECT c.nombre, COUNT(f.numero) AS CANTIDAD_FACTURAS
FROM Cliente c
JOIN Factura f ON c.codigo = f.codigocliente
GROUP BY c.nombre
ORDER BY c.nombre;

+-------------+-------------------+
| nombre      | CANTIDAD_FACTURAS |
+-------------+-------------------+
| Ana Garcia  |                 1 |
| Juan Lopez  |                 2 |
| Luis Torres |                 1 |
+-------------+-------------------+

-- MOSTRAR POR CADA CLIENTE(NOMBRE) EL TOTAL DE LA CANTIDAD DE ARTICULOS COMPRADOS EN GENERAL

SELECT c.nombre, SUM(d.cantidad) AS CANTIDAD_TOTAL_ARTICULOS
FROM Cliente c
JOIN Factura f ON c.codigo = f.codigocliente
JOIN Detalle d ON f.numero = d.numerofactura
GROUP BY c.nombre
ORDER BY c.nombre;

+-------------+--------------------------+
| nombre      | CANTIDAD_TOTAL_ARTICULOS |
+-------------+--------------------------+
| Ana Garcia  |                      300 |
| Juan Lopez  |                      650 |
| Luis Torres |                      370 |
+-------------+--------------------------+

-- MOSTRAR TODOS LOS ARTICULOS QUE TERMINA EN A

SELECT DISTINCT articulo
FROM Detalle
WHERE articulo LIKE '%a';

+----------+
| articulo |
+----------+
| goma     |
| regla    |
| escuadra |
+----------+

-- MOSTRAR TODOS LOS ARTICULOS QUE TIENEN LA SUBCADENA LA

SELECT DISTINCT articulo
FROM Detalle
WHERE articulo LIKE '%la%';

+----------+
| articulo |
+----------+
| lapiz    |
| regla    |
+----------+

-- MMOSTRAR LOS ARTICULOS CUYO NOMBRE SOLO TIENE 5 LETRAS

SELECT DISTINCT articulo
FROM Detalle
WHERE articulo LIKE '_____';

+----------+
| articulo |
+----------+
| lapiz    |
| regla    |
| folio    |
+----------+

-- MOSTRAR LOS ARTICULOS DE 5 LETRAS QUE INICIEN
-- CON LA LETRA R

SELECT DISTINCT articulo
FROM Detalle
WHERE articulo LIKE 'R____';

-- MOSTRAR LA FACTURA CON EL MAYOR VENTA

SELECT numerofactura, SUM(precio*cantidad) AS VENTA_TOTAL
FROM Detalle
GROUP BY numerofactura
ORDER BY VENTA_TOTAL DESC
LIMIT 1;

+---------------+-------------+
| numerofactura | VENTA_TOTAL |
+---------------+-------------+
|          1201 |      580.00 |
+---------------+-------------+

-- DE LA PREGUNTA ANTERIOR MOSTRAR TAMBIEN LA FECHA
-- DE LA FACTURA

SELECT f.numero,f.fecha, SUM(d.precio*d.cantidad) AS VENTA_TOTAL
FROM Factura f
JOIN Detalle d ON f.numero = d.numerofactura
GROUP BY f.numero
ORDER BY VENTA_TOTAL DESC
LIMIT 1;

+--------+------------+-------------+
| numero | fecha      | VENTA_TOTAL |
+--------+------------+-------------+
|   1201 | 2017-01-15 |      580.00 |
+--------+------------+-------------+






