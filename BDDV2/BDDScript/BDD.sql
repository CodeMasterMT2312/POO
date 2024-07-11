create database esfotventas;
use esfotventas;

create table cliente(
codigo int primary key auto_increment,
nombre varchar(30),
correo varchar(30),
password varchar(30)
);

create table estudiantes(
ID_Estudiante int primary key not null auto_increment,
Nombre varchar(45) not null,
edad int not null
);

insert into estudiantes(Nombre, edad) values ("Leandro",21);

insert into cliente(nombre,correo,password) values ("Fernando","f@gmail.com","123"),
("Ariel","a@gmail.com","456"),("David","d@gmail.com","789");


Alter table estudiantes add column nota1 Double;
Alter table estudiantes add column nota2 Double;
select * from estudiantes;

SELECT ID_Estudiante, (nota1 + nota2) / 2 AS promedio from estudiantes;


