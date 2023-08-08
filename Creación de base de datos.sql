set serveroutput on;


---EL NOMBRE DE LA CONEXION ES PROYECTO_LENGUAJES_BIBLIOTECA_G2
---EL NOMBRE DE USUARIO UTILIZADO FUE adminBibli Y LA CONTRASEÑA ES 12345.

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
insert into libro values(101,'Crónica del Asesino de Reyes','Patrick Rothfuss',20);


---Ingreso de datos en la tabla CATEGORIA
insert into categoria values(10,'Caballeresco');
insert into categoria values(20,'Fantasía');
insert into categoria values(30,'Biografía');


select * from libro;
select * from categoria;













