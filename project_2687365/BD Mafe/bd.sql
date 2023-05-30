create database Mafe;

use Mafe;

create table users_tbl (
user_id int(11) auto_increment primary key,
user_firstname varchar(50) not null,
user_lastname varchar(50) not null,
user_email varchar (60) not null,
user_password varbinary (255) not null
);
insert into users_tbl
values ('', 'Mafe', 'Lozano', 'mafe11111@gmail.com', 'CafeconPan15');

select *from users_tbl;

create table Category (
Category_id int(11) auto_increment primary key,
Category_name varchar(50) not null);

create table Product (
Product_id int(11) auto_increment primary key,
Product_name varchar(50) not null,
Product_value decimal,
Category_id int references category);

