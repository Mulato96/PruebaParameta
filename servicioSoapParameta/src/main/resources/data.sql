CREATE DATABASE IF NOT EXISTS `parametadb`;
USE `parametadb`;

CREATE TABLE IF NOT EXISTS empleado (
  id_empleado INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  tip_documento VARCHAR(45) NOT NULL,
  numero_documento VARCHAR(45) NOT NULL,
  fecha_nacimiento DATE NOT NULL,
  fecha_vinculacion DATE NOT NULL,
  cargo VARCHAR(45) NOT NULL,
  salario DOUBLE NOT NULL,
  PRIMARY KEY (id_empleado));