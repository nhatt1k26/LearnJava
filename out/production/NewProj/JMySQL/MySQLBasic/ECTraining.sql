create database ectraining;

use ectraining;

create table employees(
employeeId int primary key auto_increment,
employeeName varchar(20),
department_name varchar(2),
salary decimal(10,5)
);

delete from employees;

INSERT INTO employees (employeeName, department_name, salary)
SELECT
    CONCAT('FPT ', SUBSTRING(MD5(RAND()), 1, 8)) , SUBSTRING(MD5(RAND()),1,2) , (RAND()* 1000)
FROM
    (SELECT 1 UNION SELECT 2 UNION SELECT 3 UNION SELECT 4 UNION SELECT 5) AS numbers1,
    (SELECT 1 UNION SELECT 2 UNION SELECT 3 UNION SELECT 4 UNION SELECT 5) AS numbers2,
    (SELECT 1 UNION SELECT 2 UNION SELECT 3 UNION SELECT 4 UNION SELECT 5) AS numbers3,
    (SELECT 1 UNION SELECT 2 UNION SELECT 3 UNION SELECT 4 UNION SELECT 5) AS numbers4,
    (SELECT 1 UNION SELECT 2 UNION SELECT 3 UNION SELECT 4 UNION SELECT 5) AS numbers5,
    (SELECT 1 UNION SELECT 2 UNION SELECT 3 UNION SELECT 4 UNION SELECT 5) AS numbers6
LIMIT 2000;

select * from employees;


-- Tinh luong trung binh cua moi phong ban
select department_name, round(avg(salary),0) average_salary from 
employees
group by department_name 
order by department_name;

-- Tinh theo dau nguoi moi phong ban
select department_name, count(*) HeadCount
from 
employees
group by department_name 
order by department_name;
