-- 1. ACTIVAR LA BASE DE DATOS PRINCIPAL DE POSTGRESQL

\c postgres

-- 2. CREAR LA BASE DE DATOS

DROP DATABASE IF EXISTS ACADEMIA;
CREATE DATABASE ACADEMIA;

-- 3. SELECCIONAR LA BASE DE DATOS

\c academia

-- 4. CREAR LA TABLA

CREATE TABLE Alumno (
    id_alumno   VARCHAR(4),
    nombre      VARCHAR(20),
                PRIMARY KEY (id_alumno)
);

-- 5. MOSTRAR LAS TABLAS DE UNA BASE DE DATOS

\dt

-- 6. MOSTRAR LA ESTRUCTURA DE LA TABLA CREADA

\d Alumno

-- 7. INSERTAR REGISTROS EN LA TABLA

INSERT INTO Alumno (id_alumno,nombre) VALUES('A1','Miguel');
INSERT INTO Alumno (id_alumno,nombre) VALUES('A2','Carlos');