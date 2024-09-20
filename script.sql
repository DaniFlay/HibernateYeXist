drop database if exists fp;
create database fp;
use fp;
create table profesor(
dni char(9) primary key,
nombre varchar(30),
apellidos varchar(50),
especialidad varchar(40));

create table alumno(
dni char(9) primary key,
nombre varchar(30),
apellidos varchar(50),
edad int);

create table ciclo(
abreviatura char(3) primary key,
nombreCompleto varchar(30),
cursos int);

create table modulo(
nombreCorto varchar(20),
ciclo char(3),
nombre varchar(50),
horasSemanales int,
dniProfesor char(9),
primary key (nombreCorto),
foreign key (ciclo) references ciclo(abreviatura)
);

create table matricula(
nombreModulo varchar(20),
nombreCiclo char(3),
dniEstudiante char(9),
cursoAcademico int,
primary key(nombreModulo,nombreCiclo,dniEstudiante,cursoAcademico),
foreign key (nombreModulo) references modulo(nombreCorto),
foreign key (nombreCiclo) references ciclo( abreviatura),
foreign key (dniEstudiante) references alumno(dni));

create table nota(
nombreModulo varchar(20),
nombreCiclo char(3),
dniEstudiante char(9),
cursoAcademico int,
evaluacion int, 
valorNumerico double,
tipoNota varchar(20),
primary key(nombreModulo,nombreCiclo,dniEstudiante,cursoAcademico,evaluacion, tipoNota),
foreign key (nombreModulo) references modulo(nombreCorto),
foreign key (nombreCiclo) references ciclo( abreviatura),
foreign key (dniEstudiante) references alumno(dni)
);
