1. MOSTRAR TODOS LOS CAMIONEROS CON PAQUETES O SIN PAQUETES

SELECT c.idCamionero, c.nombre
FROM Camionero c
LEFT JOIN Paquete p ON c.idCamionero = p.idCamionero;

+-------------+-----------------+
| idCamionero | nombre          |
+-------------+-----------------+
|           1 | Juan Pérez      |
|           1 | Juan Pérez      |
|           2 | María Gómez     |
|           2 | María Gómez     |
|           3 | Luis Rodríguez  |
|           3 | Luis Rodríguez  |
|           4 | Ana García      |
|           5 | Pedro Sánchez   |
+-------------+-----------------+

2. MOSTRAR LOS CAMIONEROS QUE NO TIENE PAQUETES (HIJOS)

SELECT c.idCamionero, c.nombre, COUNT(p.descripcion)
FROM Camionero c
LEFT JOIN Paquete p ON c.idCamionero = p.idCamionero
GROUP BY c.idCamionero
HAVING COUNT(p.descripcion) = 0;

+-------------+-----------------+----------------------+
| idCamionero | nombre          | COUNT(p.descripcion) |
+-------------+-----------------+----------------------+
|           1 | Juan Pérez      |                    2 |
|           2 | María Gómez     |                    2 |
|           3 | Luis Rodríguez  |                    2 |
|           4 | Ana García      |                    0 |
|           5 | Pedro Sánchez   |                    0 |
+-------------+-----------------+----------------------+

+-------------+----------------+----------------------+
| idCamionero | nombre         | COUNT(p.descripcion) |
+-------------+----------------+----------------------+
|           4 | Ana García     |                    0 |
|           5 | Pedro Sánchez  |                    0 |
+-------------+----------------+----------------------+

3. MOSTRAR CANTIDAD DE PAQUETES POR PROVINCIA

SELECT v.idProvincia, v.nombre, COUNT(p.idPaquete)
FROM Provincia v
INNER JOIN Paquete p ON v.idProvincia = p.idProvincia
GROUP BY v.idProvincia;

+-------------+-----------+--------------------+
| idProvincia | nombre    | COUNT(p.idPaquete) |
+-------------+-----------+--------------------+
|           1 | Madrid    |                  2 |
|           2 | Barcelona |                  2 |
|           3 | Valencia  |                  2 |
+-------------+-----------+--------------------+

SELECT v.idProvincia, v.nombre, COUNT(p.idPaquete)
FROM Provincia v
LEFT JOIN Paquete p ON v.idProvincia = p.idProvincia
GROUP BY v.idProvincia;

+-------------+-----------+--------------------+
| idProvincia | nombre    | COUNT(p.idPaquete) |
+-------------+-----------+--------------------+
|           1 | Madrid    |                  2 |
|           2 | Barcelona |                  2 |
|           3 | Valencia  |                  2 |
|           4 | Sevilla   |                  0 |
|           5 | Málaga    |                  0 |
|           6 | Bilbao    |                  0 |
+-------------+-----------+--------------------+

SELECT v.idProvincia, v.nombre, COUNT(p.idPaquete)
FROM Provincia v
LEFT JOIN Paquete p ON v.idProvincia = p.idProvincia
GROUP BY v.idProvincia
HAVING COUNT(p.idPaquete) = 0;

+-------------+---------+--------------------+
| idProvincia | nombre  | COUNT(p.idPaquete) |
+-------------+---------+--------------------+
|           4 | Sevilla |                  0 |
|           5 | Málaga  |                  0 |
|           6 | Bilbao  |                  0 |
+-------------+---------+--------------------+

SELECT v.idProvincia, v.nombre, COUNT(p.idPaquete)
FROM Provincia v
RIGHT JOIN Paquete p ON v.idProvincia = p.idProvincia
GROUP BY v.idProvincia;

4. MOSTAR LA CANTIDAD DE CAMIONES CONDUCIDOS POR CADA CAMIONERO 

SELECT c.idCamionero, c.nombre, COUNT(cc.idCamion) 
FROM Camionero c
INNER JOIN Camioneros_x_Camion cc ON c.idCamionero = cc.idCamionero
GROUP BY c.idCamionero;

+-------------+-----------------+--------------------+
| idCamionero | nombre          | COUNT(cc.idCamion) |
+-------------+-----------------+--------------------+
|           1 | Juan Pérez      |                  2 |
|           2 | María Gómez     |                  2 |
|           3 | Luis Rodríguez  |                  2 |
+-------------+-----------------+--------------------+

SELECT c.idCamionero, c.nombre, COUNT(cc.idCamion) 
FROM Camionero c
LEFT JOIN Camioneros_x_Camion cc ON c.idCamionero = cc.idCamionero
GROUP BY c.idCamionero;

+-------------+-----------------+--------------------+
| idCamionero | nombre          | COUNT(cc.idCamion) |
+-------------+-----------------+--------------------+
|           1 | Juan Pérez      |                  2 |
|           2 | María Gómez     |                  2 |
|           3 | Luis Rodríguez  |                  2 |
|           4 | Ana García      |                  0 |
|           5 | Pedro Sánchez   |                  0 |
+-------------+-----------------+--------------------+


