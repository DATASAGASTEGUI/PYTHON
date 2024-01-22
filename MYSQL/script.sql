-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema VentaDeProductos
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema VentaDeProductos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `VentaDeProductos` DEFAULT CHARACTER SET utf8 ;
USE `VentaDeProductos` ;

-- -----------------------------------------------------
-- Table `VentaDeProductos`.`Proveedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `VentaDeProductos`.`Proveedor` (
  `idProveedor` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(20) NOT NULL,
  `nif` VARCHAR(15) NOT NULL,
  `direccion` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`idProveedor`),
  UNIQUE INDEX `nif_UNIQUE` (`nif` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `VentaDeProductos`.`Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `VentaDeProductos`.`Producto` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `precio_unitario` DOUBLE NOT NULL,
  `idProveedor` INT NOT NULL,
  PRIMARY KEY (`codigo`),
  INDEX `fk_Producto_Proveedor1_idx` (`idProveedor` ASC) VISIBLE,
  CONSTRAINT `fk_Producto_Proveedor1`
    FOREIGN KEY (`idProveedor`)
    REFERENCES `VentaDeProductos`.`Proveedor` (`idProveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `VentaDeProductos`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `VentaDeProductos`.`Cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellidos` VARCHAR(45) NOT NULL,
  `dni` CHAR(10) NOT NULL,
  `direccion` VARCHAR(50) NOT NULL,
  `fecha_nacimiento` DATE NOT NULL,
  PRIMARY KEY (`idCliente`),
  UNIQUE INDEX `dni_UNIQUE` (`dni` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `VentaDeProductos`.`Clientes_x_Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `VentaDeProductos`.`Clientes_x_Producto` (
  `codigo` INT NOT NULL,
  `idCliente` INT NOT NULL,
  PRIMARY KEY (`codigo`, `idCliente`),
  INDEX `fk_Producto_has_Cliente_Cliente1_idx` (`idCliente` ASC) VISIBLE,
  INDEX `fk_Producto_has_Cliente_Producto_idx` (`codigo` ASC) VISIBLE,
  CONSTRAINT `fk_Producto_has_Cliente_Producto`
    FOREIGN KEY (`codigo`)
    REFERENCES `VentaDeProductos`.`Producto` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Producto_has_Cliente_Cliente1`
    FOREIGN KEY (`idCliente`)
    REFERENCES `VentaDeProductos`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
