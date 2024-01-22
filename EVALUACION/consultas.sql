SELECT c.matricula, c.modelo, r.idrevision
FROM coche c
INNER JOIN revision r ON c.matricula = r.coche_matricula
ORDER BY c.matricula;


SELECT cl.nombre, co.matricula
FROM cliente cl
JOIN coche co ON cl.idcliente = co.cliente_idcliente;