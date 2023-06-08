CREATE PROCEDURE `new_procedure` (a int)
BEGIN
SELECT *  FROM products LIMIT a; 
END