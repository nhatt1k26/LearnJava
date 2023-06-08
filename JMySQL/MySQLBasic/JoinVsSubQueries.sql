CREATE TABLE members (
    member_id INT AUTO_INCREMENT,
    name VARCHAR(100),
    PRIMARY KEY (member_id)
);

CREATE TABLE committees (
    committee_id INT AUTO_INCREMENT,
    name VARCHAR(100),
    PRIMARY KEY (committee_id)
);

insert into members values(1,'John'),(2,'Jane'),(3,'Mary'),(4,'David'),(5,'Amelia');

insert into committees  values(1,'John'),(2,'Mary'),(3,'Amelia'),(4,'Joe');

SELECT 
    member_id, 
    name as member,
    c.name AS committee
FROM
    members m
INNER JOIN committees c ON c.name = m.name;
