drop database caminhoneiros;
create database caminhoneiros;

use caminhoneiros;

create table Usuario (id_usuario Integer primary key AUTO_INCREMENT, nome varchar(50), id_cargo_fk int);

create table Telefone (id_telefone Integer primary key AUTO_INCREMENT, ddd Integer, numero int, id_usuario_fk int, 
FOREIGN KEY (id_usuario_fk) references Usuario(id_usuario));

create table Cargo(id_cargo Integer primary key AUTO_INCREMENT, nome varchar(50));

insert into Cargo (nome) VALUES ("Caminhoneiro");

insert into Cargo (nome) VALUES ("Caminhoneiro");

insert into Cargo (nome) VALUES ("Caminhoneiro");

insert into Cargo (nome) VALUES ("Telefonista");

insert into Cargo (nome) VALUES ("Telefonista");

insert into Cargo (nome) VALUES ("Telefonista");

insert into Cargo (nome) VALUES ("Pintor");

insert into Usuario (nome,id_cargo_fk) VALUES ("Danilo",(SELECT LAST_INSERT_ID()));

insert into Usuario (nome,id_cargo_fk) VALUES ("James",(SELECT LAST_INSERT_ID()));

insert into Usuario (nome,id_cargo_fk) VALUES ("Ricardo",(SELECT LAST_INSERT_ID()));

alter table Usuario ADD FOREIGN KEY (id_cargo_fk) references Cargo(id_cargo);

insert into Telefone (ddd,numero,id_usuario_fk) VALUES (21,12345678,(SELECT LAST_INSERT_ID()));

insert into Telefone (ddd,numero,id_usuario_fk) VALUES (41,12345678,(SELECT LAST_INSERT_ID()));

insert into Telefone (ddd,numero) VALUES (11,12345678);

show tables;

select * from Usuario;

select * from Telefone;

select * from Cargo;

select * from Usuario INNER JOIN Telefone ON Usuario.id_usuario = Telefone.id_usuario_fk;

select * from Usuario INNER JOIN Cargo ON Usuario.id_cargo_fk = Cargo.id_cargo;

/*Seleciona o nome dos usuarios que não possuem telefone*/
select nome from Usuario u WHERE NOT EXISTS (SELECT * FROM Telefone t WHERE u.id_usuario = t.id_usuario_fk);

/*Seleciona o nome dos usuario com ddd igual a 21*/
select nome,ddd from Usuario INNER JOIN Telefone On Telefone.id_usuario_fk = Usuario.id_usuario where
ddd = 21;

/*Seleciona os cargo que tenha mais de 2 funcionários e ordena em ordem decrescente*/
select nome, COUNT(nome) quant, id_cargo FROM Cargo GROUP BY nome HAVING quant > 2 ORDER BY id_cargo DESC;

