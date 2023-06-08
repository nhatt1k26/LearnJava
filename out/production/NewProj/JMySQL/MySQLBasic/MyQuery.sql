create database dbbasics; -- Create new database

create table dbbasics.students (
studentId int,
HoTen varchar(20),
NgaySinh varchar(20),
SoDiem tinyint(1)
);

create table dbbasics.teachers (
teacherId int,
HoTen varchar(20),
NgaySinh varchar(20),
NgayCongTac tinyint(200)
);



insert into dbbasics.students values (12,"Nguyen Dinh Nhat", 2001-08-22,10);
delete from dbbasics.students where studentId=12; 
alter table dbbasics.students modify NgaySinh date;
insert into dbbasics.students values (12,"Nguyen Dinh Nhat", "2001-08-22",10);
insert into dbbasics.students values (1,"Nguyen Dinh Nhat", "2001-08-22",50);

create table dbbasics.LuongGiaoVien(
teacherId int,
TienLuong decimal(6,4)
);

insert into dbbasics.LuongGiaoVien values (123,6.5);
insert into dbbasics.LuongGiaoVien values (2,23.5);
insert into dbbasics.LuongGiaoVien values (123,6.52384723847234);

alter table dbbasics.luonggiaovien add hesoluong float(7,4);

insert into dbbasics.LuongGiaoVien values (14,6.52384723847234,999.00009);

create table dbbasics.xeploai(
studentId int,
XepHang ENUM('tot','kha','trungbinh','yeu','kem')
);


insert into dbbasics.xeploai values (123,'tot'),(2,'kha'),(5,'trungbinh');

insert into dbbasics.xeploai values (52,'yeu'),(21,'kha'),(5,'kha');

select studentID,XepHang from dbbasics.xeploai where XepHang='kha';

update dbbasics.xeploai set XepHang='trungbinh' where XepHang='kha';

create table dbbasics.myset (col set('a','b','c','d','e','f'));
use dbbasics;
insert into dbbasics.myset(col) values ('a,b'),('c,b,e'),('f,a,c');

select * from myset where col > 'a'; 


drop table myset; -- delete object from table
-- ------------------------------------------------------------------------------------------------------------------------
-- DDL commands
-- add, delete, rename and modify datatype column

-- add table
alter table students 
add SDT int;

alter table students
drop SDT;

alter table students
drop column SoDiem;

alter table students
rename column HoTen to HoVaTen;

alter table students
modify column HoVaTen varchar(30);

-- truncate 
truncate table xeploai;

-- select distinct still work with multiple field in mySQL	
insert into dbbasics.students values (12,"Nguyen Dinh Nhat","1997-08-22"),(2,"Nguyen Dinh Nhat","1997-08-2");
select studentId,HoVaTen from students;

CREATE USER gfguser1@localhost IDENTIFIED BY 'abcd';

SHOW GRANTS FOR gfguser1@localhost;

create table country(
CountryName varchar(20),
MuiGio int);

alter table country add column CountryId int;

create table school (
SchoolName varchar(20) not null unique,
SchoolId varchar(10) primary key,
Province varchar(10) not null,
Country int references country.CountryId
);

alter table school alter Province set default 'Ha Noi';

-- alter table school 
-- add constraint df_City 
-- default 123 for Country;

create table staff(
staffId int not null auto_increment,
lastName varchar(20) not null,
firstName varchar(20),
age int,
primary key(staffId)
);

create table staff1(
staffId float(4,2) not null auto_increment,
lastName varchar(20) not null,
firstName varchar(20),
age int,
primary key(staffId)
);

	
DELIMITER $$
CREATE FUNCTION custom_compare
(
 Num INT
)
RETURNS INT 
DETERMINISTIC
BEGIN
    DECLARE TotalCube INT;
    SET TotalCube = Num * Num * Num;
    RETURN TotalCube; 
END$$
DELIMITER ;

SELECT *
FROM luonggiaovien
WHERE custom_compare(hesoluong, teacherId) = 1;

select count(StudentId)
from xeploai 
where XepHang<>'gioi'
group by XepHang;


create table Customers (
CustomersID int,
Country varchar(20)
);

insert into Customers values (123,"VietNam"),(1123,"HanQuoc"),(3237,"NhatBan"),(12,"VietNam"),(1323,"VietNam"),(2,"VietNam");

SELECT count(*) as TongKhachHang,Country
FROM Customers
GROUP BY Country 
ORDER BY COUNT(CustomersId) DESC;

SELECT COUNT(CustomersId), Country
FROM Customers
GROUP BY Country
HAVING COUNT(CustomersId) > 0;


