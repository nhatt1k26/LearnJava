create database sqlskills;

use sqlskills;

create table numbers
(
numbercol int not null,
charcol varchar(100) not null
);

select
ii.index_id,
ii.name,
ii.table_id,
t.name
from information_schema.innodb_indexes ii
join information_schema.innodb_tables t on ii.table_id = t.table_id
where t.name = 'sqlskills/numbers';


set session cte_max_recursion_depth = 5000;
insert into numbers(numbercol, charcol)
with recursive cte (n) AS
(
select 1
union all
select n + 1 from cte where n < 5000
)
select n, left (md5 (rand ()), 100)
from ctecommittees
order by 2;


select 1
union all
select n + 1 from cte where n < 5000;

select n, left (md5 (rand ()), 100)
from ctecommittees
order by 2;