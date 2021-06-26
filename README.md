# Sistema_DIF_Local

Sistema basico para registrar, consultar, editar y eliminar usuarios en una base de datos de mysql de dorma local.

# DATABASE CODE 

CREATE TABLE encargada (id_cedula varchar (15) null, usuario varchar (100)NOT null, contraseña varchar (100)NOT null, derechos_admin varchar (2) NOT null, nombre varchar(100)NOT null, apellido_pat varchar(50)NOT null, apellido_mat varchar(50), CONSTRAINT pk_encargada PRIMARY KEY(id_cedula));

CREATE TABLE beneficiario (id_ben int NOT null AUTO_INCREMENT, nombre_ben varchar(100)NOT null, ape_pat varchar(100) NOT null, ape_mat varchar(100) NOT null, edad int NOT null, telefono varchar(15) NOT null, direccion varchar (300) NOT null, comunidad varchar(80) NOT null, CONSTRAINT pk_beneficiario PRIMARY KEY (id_ben));

CREATE TABLE productos (id_producto int NOT null AUTO_INCREMENT, id_cedula varchar (15) NOT null, nombre_producto varchar (50) NOT null, cantidad int NOT null, categoria varchar(70) NOT null, fecha varchar(70) NOT null, CONSTRAINT pk_productos PRIMARY key(id_producto), CONSTRAINT fk_encargada FOREIGN KEY (id_cedula) REFERENCES encargada(id_cedula)on delete cascade
on update cascade);
  
CREATE TABLE entregas (id_entrega int not null AUTO_INCREMENT, id_ben int not null, id_cedula varchar (15) not null, fecha varchar(20) not null, id_producto int not null, hora varchar (10) NOT null, cantidad float not null, CONSTRAINT pk_id_entrega PRIMARY KEY (id_entrega), CONSTRAINT fK_id_producto FOREIGN KEY (id_producto) REFERENCES productos(id_producto) on delete CASCADE on UPDATE CASCADE, CONSTRAINT fk_id_ben FOREIGN KEY (id_ben) REFERENCES beneficiario(id_ben) on delete cascade on update cascade, CONSTRAINT fk_id_cedula FOREIGN KEY (id_cedula) REFERENCES encargada(id_cedula)on delete cascade on update cascade)
