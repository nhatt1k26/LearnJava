## Numeric data type 
Numeric data type 
+ Integer: TINYINT(M), SMALLINT(M),MEDIUMINT(M),INT(M),BIGINT(M)
+ Boolean, bool = inyint(1)
+ Float
  + DECIMAL(M, D):  
    + D is the number of digits following the decimal point.
    + Store exact numeric data values.
    + Used when it is important to preserve exact precision, for example with monetary data.
    + Decimal type can avoid rounding
    + exact representation
  + Float(M,d), double(m,d)
    + relatively approximate representation
    + is suitable for scientific and technical computations
+ Date and Time data type ( DATE , Time, datetime, timestamp, year)
+ String data type: ( char and varchar, binary and var binary)

Other Datatype:
+ BLOB: binary large object that can hold a variable amount of data
+ An ENUM is a string object with a value chosen from a list of permitted values that are enumerated explicitly in the column specification at table creation time.
    + Can have zero or more value
    + 

## SQL Commands
+ DDL: (Data Definition Language) change the table structures
  + Modify structures but not data
  + Create, drop, alter, truncate
+ DQL: (Data Query Language)  
  + Used to get data from the db, and set order on them
  + Include SELECT query to get the data from the database, return result is stored in a table
+ DML: (Data Manipulation Language)
  + Used to add, delete, or modify records in a table
  + (  INSERT ,UPDATE ,DELETE ,LOCK ,CALL ,EXPLAIN PLAN)
+ DCL:  Data Control Language 
  + DCL commands handle database system permissions and other controls.

## Constraint
+ used to specify rules for the data in a table
+ used to limit the type of data that can go into a table. This ensures the accuracy and reliability of the data in the table
+ Constraints can be column level or table level

## truncate, delete and drop
TRUNCATE, DELETE, DROP
  