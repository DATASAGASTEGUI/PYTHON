DROP USER DBINSTITUTO CASCADE;
CREATE USER DBINSTITUTO IDENTIFIED BY 12345678;
GRANT CONNECT,RESOURCE,DBA TO DBINSTITUTO;
GRANT UNLIMITED TABLESPACE TO DBINSTITUTO;
ALTER PROFILE DEFAULT LIMIT PASSWORD_REUSE_TIME UNLIMITED;
ALTER PROFILE DEFAULT LIMIT PASSWORD_LIFE_TIME UNLIMITED;

-- INICIAR SESION CON EL USUARIO DBINSTITUTO
CONNECT DBINSTITUTO/12345678@LOCALHOST:1521/XEPDB1

-- CONFIGURAR EL FORMATO DE LA FECHA PARA SABER COMO SE DEBE INGRESAR
-- EN LA INSERCION.

ALTER SESSION SET NLS_DATE_FORMAT = 'YYYY-MM-DD';

-- CREAR TABLA ALUMNO

CREATE TABLE Departamento (
   id_departamento      CHAR(4)     NOT NULL PRIMARY KEY,
   nombre               VARCHAR(30) NOT NULL
);

CREATE TABLE Alumno (
  id_alumno        CHAR(4)     NOT NULL PRIMARY KEY,
  nombre           VARCHAR(20) NOT NULL,
  edad             NUMBER(3)   NOT NULL,
  estatura         NUMBER(3,2) NOT NULL,
  fecha_nacimiento DATE        NOT NULL,
  sexo             CHAR(1)     NOT NULL,
  escasado         NUMBER(1,0) NOT NULL CHECK (ESCASADO IN (0,1)),
  id_departamento  CHAR(4)     NOT NULL,
                   FOREIGN KEY (id_departamento) REFERENCES Departamento(id_departamento)
);

INSERT INTO Departamento (id_departamento, nombre) VALUES ('D001','Informática');
INSERT INTO Departamento (id_departamento, nombre) VALUES ('D002','Industrial');


INSERT INTO Alumno (id_alumno,nombre,edad,estatura,fecha_nacimiento,sexo,escasado, id_departamento) VALUES ('A001','Miguel',27,1.62,'1996-02-02','M',1,'D001');

INSERT INTO Alumno (id_alumno,nombre,edad,estatura,fecha_nacimiento,sexo,escasado, id_departamento) VALUES ('A002','Carmen',23,1.72,'2000-01-01','H',0,'D002');



