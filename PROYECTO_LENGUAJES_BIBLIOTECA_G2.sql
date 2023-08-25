set serveroutput on;


---EL NOMBRE DE LA CONEXION ES PROYECTO_LENGUAJES_BIBLIOTECA_G2
---EL NOMBRE DE USUARIO UTILIZADO FUE adminBibli Y LA CONTRASE�A ES 12345.

---CREACION DE LA TABLAS A UTILIZAR---
---Creacion de la tabla LIBRO
create table libro(
id_libro int primary key not null,
titulo varchar2(100) not null,
autor varchar2(100) not null,
categoria_id int not null);


---Creacion de la tabla CATEGORIA
create table categoria(
categoria_id int primary key not null,
nombre_Categoria varchar2(100));


---Creacion de la tabla SOCIO
create table socio(
id_usuario int primary key not null,
nombre varchar2(100) not null,
apellido varchar2(100) not null,
direccion varchar2(120) not null,
telefono int not null,
tipo_membresia varchar2(50) not null);


---Creacion de la tabla PRESTAMO
create table prestamo(
id_prestamo int primary key not null,
id_libro int not null,
fecha_prestamo date not null,
fecha_devolucion date not null,
id_usuario int not null);


---Creacion de la tabla EJEMPLARES
create table ejemplar(
id_ejemplar int primary key not null,
id_libro int not null,
estatus varchar2(100) not null);


alter table libro add constraint pk_libro foreign key (categoria_id) references categoria(categoria_id);
alter table ejemplar add constraint pk_ejemplar foreign key (id_libro) references libro(id_libro);

---INGRESO DE DATOS EN LAS TABLAS YA CREADAS
---Ingreso de datos en la tabla LIBRO
insert into libro values(100,'Don Quijote de la Mancha','Miguel de Cervantes',10);
insert into libro values(101,'Cr�nica del Asesino de Reyes','Patrick Rothfuss',20);


---Ingreso de datos en la tabla CATEGORIA
insert into categoria values(10,'Caballeresco');
insert into categoria values(20,'Fantas�a');
insert into categoria values(30,'Biograf�a');


select * from libro;
select * from categoria;

CREATE TABLE EMPLEADOS (
    ID_EMPLEADO NUMBER PRIMARY KEY,
    NOMBRE VARCHAR2(50),
    SALARIO NUMBER,
    FECHA_CONTRATACION DATE,
    PUESTO VARCHAR2(50)
);


INSERT INTO Socio (ID_USUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, TIPO_MEMBRESIA)
VALUES (3, 'Carlos', 'Rodr�guez', 'Heredia', '34567890', 'Est�ndar');

INSERT INTO Socio (ID_USUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, TIPO_MEMBRESIA)
VALUES (4, 'Ana', 'Mart�nez', 'Cartago', '45678901', 'Premium');

INSERT INTO Socio (ID_USUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, TIPO_MEMBRESIA)
VALUES (5, 'Luis', 'L�pez', 'San Jos�', '56789012', 'Est�ndar');

INSERT INTO Socio (ID_USUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, TIPO_MEMBRESIA)
VALUES (6, 'Laura', 'Fern�ndez', 'Heredia', '67890123', 'Premium');

INSERT INTO Socio (ID_USUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, TIPO_MEMBRESIA)
VALUES (7, 'Miguel', 'D�az', 'Alajuela', '78901234', 'Est�ndar');

INSERT INTO Socio (ID_USUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, TIPO_MEMBRESIA)
VALUES (8, 'Sof�a', 'Hern�ndez', 'Cartago', '89012345', 'Premium');

INSERT INTO Socio (ID_USUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, TIPO_MEMBRESIA)
VALUES (9, 'Jorge', 'Castro', 'San Jos�', '90123456', 'Est�ndar');

INSERT INTO Socio (ID_USUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, TIPO_MEMBRESIA)
VALUES (10, 'Isabel', 'Ram�rez', 'Heredia', '01234567', 'Premium');

INSERT INTO Socio (ID_USUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, TIPO_MEMBRESIA)
VALUES (11, 'Andr�s', 'Vargas', 'Alajuela', '12345678', 'Est�ndar');

INSERT INTO Socio (ID_USUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, TIPO_MEMBRESIA)
VALUES (12, 'Natalia', 'Chavarr�a', 'Cartago', '23456789', 'Premium');

INSERT INTO Socio (ID_USUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, TIPO_MEMBRESIA)
VALUES (13, 'Ricardo', 'Arias', 'San Jos�', '34567890', 'Est�ndar');

INSERT INTO Socio (ID_USUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, TIPO_MEMBRESIA)
VALUES (14, 'Camila', 'Fuentes', 'Heredia', '45678901', 'Premium');

INSERT INTO Socio (ID_USUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, TIPO_MEMBRESIA)
VALUES (15, 'Eduardo', 'Mora', 'Alajuela', '56789012', 'Est�ndar');

INSERT INTO Socio (ID_USUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, TIPO_MEMBRESIA)
VALUES (16, 'Valentina', 'Soto', 'Cartago', '67890123', 'Premium');

INSERT INTO Socio (ID_USUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, TIPO_MEMBRESIA)
VALUES (17, 'Felipe', 'Varela', 'San Jos�', '78901234', 'Est�ndar');

INSERT INTO Socio (ID_USUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, TIPO_MEMBRESIA)
VALUES (18, 'Luisa', 'Fern�ndez', 'Heredia', '89012345', 'Premium');

INSERT INTO Socio (ID_USUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, TIPO_MEMBRESIA)
VALUES (19, 'Javier', 'L�pez', 'Alajuela', '90123456', 'Est�ndar');

INSERT INTO Socio (ID_USUARIO, NOMBRE, APELLIDO, DIRECCION, TELEFONO, TIPO_MEMBRESIA)
VALUES (20, 'Valeria', 'Morales', 'Cartago', '01234567', 'Premium');

ALTER TABLE PRESTAMO
ADD ESTADO VARCHAR2(20) DEFAULT 'Activo';

CREATE SEQUENCE SEQ_ID_PRESTAMO START WITH 1 INCREMENT BY 1;
INSERT INTO PRESTAMO (ID_LIBRO, ID_USUARIO, FECHA_PRESTAMO, FECHA_DEVOLUCION, ESTADO)
VALUES (:100, 1, 23/08/2023, 23/09/2023, 'Activo');

select * from prestamo;
SELECT * FROM LIBRO;

INSERT INTO libro VALUES
(102, 'Los Senderos del Crep�sculo', 'Elena Rodr�guez', 30);
INSERT INTO libro VALUES
(103, 'Cazadores de Sue�os', 'Alejandro P�rez', 30);
INSERT INTO libro VALUES
(104, 'El Laberinto de las Sombras', 'Sof�a Mart�nez', 10);
INSERT INTO libro VALUES
(105, 'La Eleg�a del Tiempo', 'Carlos Garc�a', 10);
INSERT INTO libro VALUES
(106, 'El Secreto de las Estrellas', 'Isabel Fern�ndez', 20);
INSERT INTO libro VALUES
(107, 'Cr�nicas Perdidas', 'Javier Ruiz', 30);
INSERT INTO libro VALUES
(108, 'El Susurro del Viento', 'Mar�a L�pez', 10);
INSERT INTO libro VALUES
(109, 'El Enigma de la Luna', 'David S�nchez', 20);
INSERT INTO libro VALUES
(110, 'El Or�culo de Cristal', 'Laura G�mez', 30);
INSERT INTO libro VALUES
(111, 'Sombras en el Abismo', 'Manuel Jim�nez', 10);
INSERT INTO libro VALUES
(112, 'Los Guardianes del Portal', 'Sara Mart�n', 20);
INSERT INTO libro VALUES
(113, 'El Legado Olvidado', 'Andr�s Vargas', 30);
INSERT INTO libro VALUES
(114, 'El Misterio de las Profundidades', 'Elena Rodr�guez', 10);
INSERT INTO libro VALUES
(115, 'La Ciudad Esmeralda', 'Alejandra P�rez', 20);
INSERT INTO libro VALUES
(116, 'El Relojero de los Sue�os', 'Sergio Mart�nez', 30);
INSERT INTO libro VALUES
(117, 'Los Hijos de la Nebulosa', 'Carla Garc�a', 10);
INSERT INTO libro VALUES
(118, 'Cuentos del Horizonte', 'Javier Fern�ndez', 20);
INSERT INTO libro VALUES
(119, 'El �ltimo Aliento', 'Luis G�mez', 30);
INSERT INTO libro VALUES
(120, 'El Laberinto de los Recuerdos', 'Ana S�nchez', 10);
INSERT INTO libro VALUES
(121, 'La Sombra del Destino', 'Marta Jim�nez', 20);
INSERT INTO libro VALUES
(122, 'El Arte de la Guerra Interior', 'Andrea Vargas', 30);
INSERT INTO libro VALUES
(123, 'Las Cr�nicas del �ter', 'Diego Rodr�guez', 10);
INSERT INTO libro VALUES
(124, 'El Vuelo del F�nix', 'Elena P�rez', 20);
INSERT INTO libro VALUES
(125, 'La Herencia del Drag�n', 'Mario Mart�nez', 30);
INSERT INTO libro VALUES
(126, 'El Enigma de la Aurora', 'Valeria Fern�ndez', 10);
INSERT INTO libro VALUES
(127, 'El Umbral de las Almas', 'Luis Garc�a', 20);
INSERT INTO libro VALUES
(128, 'El Susurro de las Hojas', 'Laura Mart�n', 30);
INSERT INTO libro VALUES
(129, 'Cazadores de Estrellas', 'Jorge S�nchez', 10);
INSERT INTO libro VALUES
(130, 'El Or�culo de las Profec�as', 'Sof�a Jim�nez', 20);
INSERT INTO libro VALUES
(131, 'Los Hijos del Cosmos', 'Carlos Vargas', 30);
INSERT INTO libro VALUES
(132, 'El Legado Ancestral', 'Elena Rodr�guez', 10);
INSERT INTO libro VALUES
(133, 'El Enigma de las Mareas', 'Alejandro P�rez', 20);
INSERT INTO libro VALUES
(134, 'La Ciudad de los Secretos', 'Sof�a Mart�nez', 30);
INSERT INTO libro VALUES
(135, 'El Despertar del Drag�n', 'Andrea Fern�ndez', 10);
INSERT INTO libro VALUES
(136, 'La Canci�n del Viento', 'Javier Garc�a', 20);
INSERT INTO libro VALUES
(137, 'Los Guardianes del Tiempo', 'Mar�a Vargas', 30);
INSERT INTO libro VALUES
(138, 'El Laberinto de las Emociones', 'Diego S�nchez', 10);
INSERT INTO libro VALUES
(139, 'El Sendero de las Estrellas', 'Carla Jim�nez', 20);
INSERT INTO libro VALUES
(140, 'Cuentos de la Luna Roja', 'Luis Mart�n', 30);
INSERT INTO libro VALUES
(141, 'El �ltimo Suspiro', 'Marta Vargas', 10);



