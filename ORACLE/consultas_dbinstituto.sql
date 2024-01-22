- MOSTRAR LOS ALUMNOS POR DEPARTAMENTO

SELECT d.nombre, a.nombre
FROM Departamento d
INNER JOIN Alumno a ON d.id_departamento = a.id_departamento
ORDER BY d.nombre;

- MOSTRAR CUANTOS ALUMNOS TIENE CADA DEPARTAMENTO DE ESTUDIOS

SELECT d.nombre, COUNT(a.nombre) AS CANTIDAD
FROM Departamento d
INNER JOIN Alumno a ON d.id_departamento = a.id_departamento
GROUP BY d.nombre
ORDER BY d.nombre;

