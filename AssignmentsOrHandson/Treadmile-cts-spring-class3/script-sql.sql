create database cts_db;
use cts_db;
create table employee(
id integer primary key,
name varchar(15),
salary double
);

insert into employee
values
(1, "Smaranika", 45000),
(2, "Ayushi", 40000),
(3, "TruptiPatnaik", 35000);