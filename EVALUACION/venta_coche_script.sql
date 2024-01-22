DROP DATABASE VENTA_AUTOMOVILES;

CREATE DATABASE VENTA_AUTOMOVILES;

USE VENTA_AUTOMOVILES;

-- -----------------------------------------------------
-- Table venta_automoviles.cliente
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS venta_automoviles.cliente (
  idcliente INT NOT NULL AUTO_INCREMENT,
  nif VARCHAR(45) NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  direccion VARCHAR(45) NOT NULL,
  ciudad VARCHAR(45) NOT NULL,
  telefono INT NOT NULL,
  PRIMARY KEY (idcliente))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table venta_automoviles.coche
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS venta_automoviles.coche (
  marca VARCHAR(45) NOT NULL,
  modelo VARCHAR(45) NOT NULL,
  color VARCHAR(45) NOT NULL,
  precio VARCHAR(45) NOT NULL,
  matricula VARCHAR(45) NOT NULL,
  cliente_idcliente INT NOT NULL,
  PRIMARY KEY (matricula),

    FOREIGN KEY (cliente_idcliente)
    REFERENCES venta_automoviles.cliente (idcliente)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table venta_automoviles.revision
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS venta_automoviles.revision (
  idrevision INT NOT NULL AUTO_INCREMENT,
  cambio_filtro VARCHAR(45) NOT NULL,
  cambio_aceite VARCHAR(45) NOT NULL,
  cambio_frenos VARCHAR(45) NOT NULL,
  coche_matricula VARCHAR(45) NOT NULL,
  otros VARCHAR(45) NOT NULL,
  PRIMARY KEY (idrevision),
    FOREIGN KEY (coche_matricula)
    REFERENCES venta_automoviles.coche (matricula)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO cliente (nif, nombre, direccion, ciudad, telefono) VALUES
('12345678A', 'Juan Pérez', 'Calle Mayor 123', 'Madrid', 123456789),
('87654321B', 'María García', 'Avenida Libertad 45', 'Barcelona', 987654321),
('45678912C', 'Carlos Martínez', 'Calle Gran Vía 67', 'Sevilla', 654321987);

INSERT INTO coche (marca, modelo, color, precio, matricula, cliente_idcliente) VALUES
('Toyota', 'Corolla', 'Rojo', '20000', '1234ABC', 1),
('Ford', 'Focus', 'Azul', '18000', '5678DEF', 2),
('Honda', 'Civic', 'Blanco', '22000', '9012GHI', 3);

INSERT INTO revision (cambio_filtro, cambio_aceite, cambio_frenos, coche_matricula, otros) VALUES
('Sí', 'Sí', 'No', '1234ABC', 'Ninguno'),
('No', 'Sí', 'Sí', '5678DEF', 'Ninguno'),
('Sí', 'No', 'Sí', '9012GHI', 'Ninguno');



