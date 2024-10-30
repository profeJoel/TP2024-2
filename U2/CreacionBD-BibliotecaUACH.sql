-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema bibliotecaUACH
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bibliotecaUACH
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bibliotecaUACH` DEFAULT CHARACTER SET utf8 ;
USE `bibliotecaUACH` ;

-- -----------------------------------------------------
-- Table `bibliotecaUACH`.`tema`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bibliotecaUACH`.`tema` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE INDEX `codigo_UNIQUE` (`codigo` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bibliotecaUACH`.`libro`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bibliotecaUACH`.`libro` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(100) NOT NULL,
  `tema_codigo` INT NOT NULL,
  PRIMARY KEY (`codigo`, `tema_codigo`),
  UNIQUE INDEX `codigo_UNIQUE` (`codigo` ASC) VISIBLE,
  INDEX `fk_libro_tema_idx` (`tema_codigo` ASC) VISIBLE,
  CONSTRAINT `fk_libro_tema`
    FOREIGN KEY (`tema_codigo`)
    REFERENCES `bibliotecaUACH`.`tema` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bibliotecaUACH`.`autor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bibliotecaUACH`.`autor` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bibliotecaUACH`.`libro_has_autor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bibliotecaUACH`.`libro_has_autor` (
  `libro_codigo` INT NOT NULL,
  `autor_id` INT NOT NULL,
  PRIMARY KEY (`libro_codigo`, `autor_id`),
  INDEX `fk_libro_has_autor_autor1_idx` (`autor_id` ASC) VISIBLE,
  INDEX `fk_libro_has_autor_libro1_idx` (`libro_codigo` ASC) VISIBLE,
  CONSTRAINT `fk_libro_has_autor_libro1`
    FOREIGN KEY (`libro_codigo`)
    REFERENCES `bibliotecaUACH`.`libro` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_libro_has_autor_autor1`
    FOREIGN KEY (`autor_id`)
    REFERENCES `bibliotecaUACH`.`autor` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
