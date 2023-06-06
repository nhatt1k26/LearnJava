## View in mySQL
+ Virtual table, is used for Store SELECT statement
+ advantage
  + Simplify Complex query
  + make the business logic consistent
  + Add extra security layers
  + enable backward compatibility
+ Different between view and table is view is not considered a real table existed in db
Store SELECT statement

## Index
+ indexes is used to quickly find rows with specific column values
+ An index is a data structure such as B-Tree that improves the speed of data retrieval on a table at the cost of additional writes and storage to maintain it.
+ automatically creates a special index named PRIMARY when we create table with a primary key or unique key. 