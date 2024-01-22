1. MOSTRAR EL NOMBRE DE DEPARTAMENTO A LA QUE 
   PERTENECE CADA EMPLEADO
   
SELECT
FROM

GROUP BY
HAVING
ORDER BY

-- 1. MOSTRAR EL NOMBRE DE DEPARTAMENTO A LA QUE PERTENECE CADA EMPLEADO

-- MUESTRA SOLO LOS DEPARTAMENTOS QUE TIENEN HIJOS
SELECT d.idDepartamento, e.nombre, d.nombre
FROM Departamento d
INNER JOIN Empleado e ON d.idDepartamento = e.idDepartamento;

-- MUESTRA LOS DEPARAMENTOS QUE TIENEN HIJOS Y LOS QUE NO TIENEN HIJOS
SELECT d.idDepartamento, e.nombre, d.nombre
FROM Departamento d
LEFT JOIN Empleado e ON d.idDepartamento = e.idDepartamento;

-- 2. QUE DEPARTAMENTOS AUN NO TIENEN EMPLEADOS

SELECT d.idDepartamento, COUNT(e.nombre)
FROM Departamento d
LEFT JOIN Empleado e ON d.idDepartamento = e.idDepartamento
GROUP BY d.idDepartamento
HAVING COUNT(e.nombre) = 0;

-- 3. MOSTRAR LOS DEPARTAMENTOS QUE TIENEN MAS DE 2 EMPLEADOS

SELECT d.idDepartamento, d.nombre, COUNT(e.nombre)
FROM Departamento d
LEFT JOIN Empleado e ON d.idDepartamento = e.idDepartamento 
GROUP BY  d.idDepartamento
HAVING COUNT(e.nombre) > 2; 

+----------------+--------+-----------------+
| idDepartamento | nombre | COUNT(e.nombre) |
+----------------+--------+-----------------+
|              2 | Ventas |               3 |
+----------------+--------+-----------------+

-- CUANTOS EMPLEADOS EXISTEN EN LA EMPRESA

SELECT COUNT(*) AS CANTIDAD FROM Empleado;

+----------+
| CANTIDAD |
+----------+
|        6 |
+----------+







