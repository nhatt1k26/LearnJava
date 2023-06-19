
create database ectraining;

use ectraining;

create table employees(
employeeId int identity primary key ,
employeeName varchar(20),
department_name varchar(2),
salary decimal(10,5)
);

delete from employees;


INSERT INTO employees (employeeName, department_name, salary)
SELECT
    CONCAT('FPT ', SUBSTRING(CONVERT(varchar(255), NEWID()), 1, 8)) AS employeeName,
    SUBSTRING(CONVERT(varchar(255), NEWID()), 1, 2) AS department_name,
    (RAND() * 1000) AS salary
FROM
    (SELECT 1 AS numbers UNION ALL SELECT 2 UNION ALL SELECT 3 UNION ALL SELECT 4 UNION ALL SELECT 5) AS numbers1,
    (SELECT 1 AS numbers UNION ALL SELECT 2 UNION ALL SELECT 3 UNION ALL SELECT 4 UNION ALL SELECT 5) AS numbers2,
    (SELECT 1 AS numbers UNION ALL SELECT 2 UNION ALL SELECT 3 UNION ALL SELECT 4 UNION ALL SELECT 5) AS numbers3,
    (SELECT 1 AS numbers UNION ALL SELECT 2 UNION ALL SELECT 3 UNION ALL SELECT 4 UNION ALL SELECT 5) AS numbers4,
    (SELECT 1 AS numbers UNION ALL SELECT 2 UNION ALL SELECT 3 UNION ALL SELECT 4 UNION ALL SELECT 5) AS numbers5,
    (SELECT 1 AS numbers UNION ALL SELECT 2 UNION ALL SELECT 3 UNION ALL SELECT 4 UNION ALL SELECT 5) AS numbers6
ORDER BY NEWID()
OFFSET 0 ROWS
FETCH NEXT 2000 ROWS ONLY;

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
