create database myprocedure;
use myprocedure;

create table products(
productCode char(8),
productName varchar(50),
productLine varchar(20),
productScale varchar(10),
productVendor varchar(50)
);

INSERT INTO products (productCode, productName, productLine, productScale, productVendor)
SELECT
    SUBSTRING(MD5(RAND()), 1, 8), -- Random productCode (8 characters)
    CONCAT('Product ', FLOOR(RAND() * 10000)), -- Random productName
    CONCAT('Product Line ', FLOOR(RAND() * 100)), -- Random productLine
    CONCAT('Scale ', FLOOR(RAND() * 10)), -- Random productScale
    CONCAT('Vendor ', FLOOR(RAND() * 10000)) -- Random productVendor
FROM
    (SELECT 1 UNION SELECT 2 UNION SELECT 3 UNION SELECT 4 UNION SELECT 5) AS numbers1,
    (SELECT 1 UNION SELECT 2 UNION SELECT 3 UNION SELECT 4 UNION SELECT 5) AS numbers2,
    (SELECT 1 UNION SELECT 2 UNION SELECT 3 UNION SELECT 4 UNION SELECT 5) AS numbers3
LIMIT 2000;

select * from products;

DELIMITER //

create PROCEDURE GetAllProducts1(a int)
BEGIN
	SELECT *  FROM products LIMIT a; 
END //

DELIMITER ;

call new_procedure(5);

SHOW PROCEDURE STATUS ;

drop procedure if exists GetAllProducts;

SET @outParam = 0;
call calPower(1,2,6,@outParam);
select @outParam;
