-- ELIMINAR LA BASE DE DATOS SI EXISTE
DROP DATABASE IF EXISTS TRANSPORTEDEPAQUETES;
-- CREAR LA BASE DE DATOS SI NO EXISTE
CREATE DATABASE IF NOT EXISTS TRANSPORTEDEPAQUETES;
-- SELECCIONAR LA BASE DE DATOS PARA SU USO
USE TRANSPORTEDEPAQUETES;
-- CREAR LA TABLA CAMIONERO
CREATE TABLE IF NOT EXISTS Camionero (
  idCamionero INT         NOT NULL AUTO_INCREMENT,
  dni         CHAR(10)    NOT NULL,
  nombre      VARCHAR(45) NOT NULL,
  telefono    VARCHAR(20) NOT NULL,
  direccion   VARCHAR(20) NOT NULL,
  salario     DOUBLE      NOT NULL,
  poblacion   VARCHAR(30) NOT NULL,
              PRIMARY KEY (idCamionero)
) ENGINE = InnoDB;
-- CREAR LA TABLA PROVINCIA
CREATE TABLE IF NOT EXISTS Provincia (
  idProvincia INT         NOT NULL AUTO_INCREMENT,
  nombre      VARCHAR(45) NOT NULL,
              PRIMARY KEY (idProvincia)
) ENGINE = InnoDB;
-- CREAR LA TABLA PAQUETE
CREATE TABLE IF NOT EXISTS Paquete (
  idPaquete              INT         NOT NULL AUTO_INCREMENT,
  descripcion            VARCHAR(45) NOT NULL,
  destinatario           VARCHAR(45) NOT NULL,
  direccion_destinatario VARCHAR(45) NOT NULL,
  idCamionero            INT         NOT NULL,
  idProvincia            INT         NOT NULL,
                         PRIMARY KEY (idPaquete),
  FOREIGN KEY (idCamionero) REFERENCES Camionero (idCamionero),
  FOREIGN KEY (idProvincia) REFERENCES Provincia (idProvincia)
) ENGINE = InnoDB;
-- CREAR LA TABLA CAMION
CREATE TABLE IF NOT EXISTS Camion (
  idCamion    INT NOT NULL AUTO_INCREMENT,
  matricula   VARCHAR(20) NOT NULL,
  modelo      VARCHAR(30) NOT NULL,
  tipo        VARCHAR(30) NOT NULL,
  potencia    INT NULL,
              PRIMARY KEY (idCamion)
) ENGINE = InnoDB;
-- CREAR LA TABLA CAMIONEROS_X_CAMION
CREATE TABLE IF NOT EXISTS Camioneros_x_Camion (
  idCamion         INT  NOT NULL,
  idCamionero      INT  NOT NULL,
  fecha_conduccion DATE NOT NULL,
				   PRIMARY KEY (idCamion, idCamionero),
  FOREIGN KEY (idCamion) REFERENCES Camion (idCamion),
  FOREIGN KEY (idCamionero) REFERENCES Camionero (idCamionero)
) ENGINE = InnoDB;

-- INSERTAR LOS DATOS

-- Insertar datos en la tabla Camionero
INSERT INTO Camionero (dni, nombre, telefono, direccion, salario, poblacion) VALUES
('12345678A', 'Juan Pérez', '123456789', 'Calle Principal 123', 2000.00, 'Madrid'),
('87654321B', 'María Gómez', '987654321', 'Avenida Central 456', 1800.00, 'Barcelona'),
('45678901C', 'Luis Rodríguez', '654321987', 'Plaza Mayor 789', 2200.00, 'Valencia'),
('23456789D', 'Ana García', '111222333', 'Calle Mayor 456', 1900.00, 'Sevilla'),
('34567890E', 'Pedro Sánchez', '444555666', 'Avenida Central 789', 2100.00, 'Málaga');

-- Insertar datos en la tabla Provincia
INSERT INTO Provincia (nombre) VALUES
('Madrid'),
('Barcelona'),
('Valencia'),
('Sevilla'),
('Málaga'),
('Bilbao');

-- Insertar datos en la tabla Paquete
INSERT INTO Paquete (descripcion, destinatario, direccion_destinatario, idCamionero, idProvincia) VALUES
('Paquete 1', 'Carlos Gutiérrez', 'Calle Gran Vía 321', 1, 1),
('Paquete 2', 'Ana López', 'Calle Diagonal 654', 2, 2),
('Paquete 3', 'Pedro Martínez', 'Avenida del Puerto 987', 3, 3),
('Paquete 4', 'Laura Martín', 'Calle Serrano 123', 1, 1),
('Paquete 5', 'David Ruiz', 'Calle Alcalá 456', 2, 2),
('Paquete 6', 'Sara González', 'Calle Gran Vía 789', 3, 3);

-- Insertar datos en la tabla Camion
INSERT INTO Camion (matricula, modelo, tipo, potencia) VALUES
('1234ABC', 'Volvo', 'Furgoneta', 150),
('5678DEF', 'Mercedes', 'Camión', 200),
('9012GHI', 'Scania', 'Remolque', 180),
('3456JKL', 'MAN', 'Furgoneta', 160),
('7890MNO', 'Iveco', 'Camión', 180),
('1234PQR', 'Renault', 'Remolque', 190);

-- Insertar datos en la tabla Camioneros_x_Camion
INSERT INTO Camioneros_x_Camion (idCamion, idCamionero, fecha_conduccion) VALUES
(1, 1, '2024-02-01'),
(2, 2, '2024-02-02'),
(3, 3, '2024-02-03'),
(1, 2, '2024-02-04'),
(2, 3, '2024-02-05'),
(3, 1, '2024-02-06');
