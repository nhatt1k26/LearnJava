create database TriggerAndTransaction;
use TriggerAndTransaction;

create table products(
productCode varchar(15) primary key,
productName varchar(15) not null
);

create table PriceLogs(
id int auto_increment,
productCode varchar(15) not null,
price decimal(10,2) not null,
updated_at timestamp not null default current_timestamp
	on update current_timestamp,
    primary key(id),
    foreign key (productCode)
    references products(productCode)
    on delete cascade
    on update cascade
);

alter table products add column price decimal(10,2) not null;
alter table products rename column price to msrp;

delimiter $$
create trigger before_products_update
before update on products
for each row
begin
if old.msrp <> new.msrp then
insert into pricelogs(productCode,price)
values(old.productCode,old.msrp);
end if;
end $$
delimiter ;


insert into products values
("A1","MaySayToc",20.5), ("A2","DauGoiDau",20.2), ("A3","NoiCom",1.7);

update products 
set msrp=10.5 where productCode="A1";

CREATE TABLE UserChangeLogs (
    id INT AUTO_INCREMENT,
    productCode VARCHAR(15) DEFAULT NULL,
    updatedAt TIMESTAMP NOT NULL 
	DEFAULT CURRENT_TIMESTAMP 
        ON UPDATE CURRENT_TIMESTAMP,
    updatedBy VARCHAR(30) NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (productCode)
        REFERENCES products (productCode)
        ON DELETE CASCADE 
        ON UPDATE CASCADE
);


DELIMITER $$
CREATE TRIGGER before_products_update_log_user
   BEFORE UPDATE ON products 
   FOR EACH ROW 
   FOLLOWS before_products_update                                                  -- This trigger activates after the before_products_update trigger:
BEGIN
    IF OLD.msrp <> NEW.msrp THEN
	INSERT INTO 
            UserChangeLogs(productCode, updatedBy)
        VALUES
            (OLD.productCode, USER());
    END IF;
END$$
DELIMITER ;


SELECT 
    trigger_name, 
    action_order,
    event_object_table , 
    action_timing , 
    event_manipulation
FROM
    information_schema.triggers
ORDER BY 
    event_object_table , 
    action_timing , 
    event_manipulation;


show triggers;

-- ------------------------------------------------------- Transaction -------------------------------------------------------
create table Info(
UserName varchar(10) not null,
id int primary key auto_increment,
City varchar(20)
);

insert into Info(UserName,City) values 
("Hung", "QuangNinh"),("VuAnh", "HaNoi"), ("Thanh", "Nghe An");


start transaction;
insert into Info(UserName,City) values ("Bo","Hcm");
select * from Info;

rollback;

select * from Info;

commit;

-- --------------------------Transaction with savepoint -----------------------------------

start transaction;
insert into Info(UserName, City) values ("Nguyen","HCM");
savepoint mySavepoint;
insert into Info(Username,City) values ("Hanh","Thanh Hoa");
rollback to savepoint mySavepoint;
select * from Info;
insert into Info(Username,City) values ("Nhat","Nghe An");
commit;

start transaction;
insert into Info(UserName, City) values ("Nguyen","HCM");
savepoint mySavepoint;
insert into Info(UserName, City) values ("An","HCM");
savepoint mySavepoint;
insert into Info(UserName, City) values ("Bao","HCM");
savepoint mySavepoint;
insert into Info(UserName, City) values ("Loc","HCM");
savepoint mySavepoint;
insert into Info(UserName, City) values ("Hanh","HCM");
savepoint mySavepoint;
select * from Info;
rollback to mySavepoint;





