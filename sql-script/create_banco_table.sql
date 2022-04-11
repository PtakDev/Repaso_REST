CREATE TABLE `banco`.`clientes` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellido1` VARCHAR(45) NOT NULL,
  `apellido2` VARCHAR(45) NOT NULL,
  `num_cuenta` INT NOT NULL,
  `balance` DOUBLE NOT NULL,

  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);
  
INSERT INTO banco.clientes
VALUES (1,'pedro','p','p',26,1111.11);
INSERT INTO banco.clientes
VALUES (2,'ana','a','aa',17,20000.0);