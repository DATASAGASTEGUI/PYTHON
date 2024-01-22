USE ventaentrada ;

-- -----------------------------------------------------
-- Table Usuario
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Usuario (
  idUsuario VARCHAR(4)   NOT NULL,
  nombre    VARCHAR(45)  NOT NULL,
  edad      INT          NOT NULL,
  direccion VARCHAR(45)  NOT NULL,
            PRIMARY KEY (idUsuario)
) ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table Entrada
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Entrada (
  idEntrada VARCHAR(4) NOT NULL,
  idUsuario VARCHAR(4) NOT NULL,
            PRIMARY KEY (idEntrada),
            FOREIGN KEY (idUsuario) REFERENCES Usuario (idUsuario)
) ENGINE = InnoDB;





