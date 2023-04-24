DROP DATABASE IF EXISTS Tienda;
CREATE DATABASE Tienda CHARACTER SET utf8mb4;
USE Tienda;
 
CREATE TABLE productos (
    id_producto INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    precio int,
    descripcion varchar(300),
    categoria varchar(100)
);

CREATE TABLE clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(25) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    direccion VARCHAR(50) NOT NULL,
    telefono VARCHAR(9),
    correo varchar(100)
);
 
CREATE TABLE ordenes (
    id_orden INT UNSIGNED PRIMARY KEY,
    id_cliente INT,
    fecha date,
    total double,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
);
 CREATE TABLE inventario (
   id_producto INT UNSIGNED AUTO_INCREMENT,
  cantidad_stock int,
  FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
);

  CREATE TABLE detalles_ordenes (
    id_orden INT UNSIGNED,
    id_producto int UNSIGNED,
    cantidad int,
    precio_und double,
    total double,
    FOREIGN KEY (id_orden) REFERENCES ordenes(id_orden),
    FOREIGN KEY (id_producto) REFERENCES productos(id_producto)
);