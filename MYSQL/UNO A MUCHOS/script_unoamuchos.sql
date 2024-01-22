DROP DATABASE IF EXISTS unoamuchos;

CREATE DATABASE IF NOT EXISTS unoamuchos;

USE unoamuchos;

-- -----------------------------------------------------
-- Table Departamento
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Departamento (
  idDepartamento INT NOT NULL,
  nombre         VARCHAR(45) NULL,
                 PRIMARY KEY (idDepartamento)
) ENGINE = InnoDB;
-- -----------------------------------------------------
-- Table Empleado
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Empleado (
  idEmpleado      INT NOT NULL,
  nombre          VARCHAR(20) NULL,
  idDepartamento  INT NOT NULL,
                  PRIMARY KEY (idEmpleado),
  FOREIGN KEY (idDepartamento) REFERENCES Departamento (idDepartamento)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION
) ENGINE = InnoDB;
-- -----------------------------------------------------
-- INSERTAR DATOS Table Empleado
-- -----------------------------------------------------
-- LLENAR PRIMERO EL PADRE
INSERT INTO Departamento (idDepartamento, nombre) VALUES
(1,'Marketing'),
(2,'Ventas'),
(3,'Facturación'),
(4,'Logistica'),
(5,'Reclasmos');


-- LUEGO LLENAR LOS HIJOS
INSERT INTO Empleado (idEmpleado,nombre,idDepartamento) VALUES
(1, 'Miguel', 1),
(2, 'Carlos', 1),
(3, 'Silvia', 2),
(4, 'Carla', 2),
(5, 'Arturo', 2),
(6, 'Ramon', 3);
-- -----------------------------------------------------
-- ELIMINAR A UN PADRE DE LA TABLA DEPARTAMENTO
-- -----------------------------------------------------
-- 1 FORMA MANUAL
-- DELETE FROM Departamento WHERE idDepartamento = 1;
-- DELETE FROM Empleado WHERE idDepartamento = 1;
-- 2 FORMA AUTOMATICA
-- DELETE FROM Departamento WHERE idDepartamento = 1;


















