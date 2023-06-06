## What is RDBMS
A relational database management system (RDBMS) is 
+ a collection of programs and capabilities that enable IT teams and others to create, update, administer and otherwise interact with a relational database.
## Relational database is a
+ type of database
stores and provides access to data points that are related to one another. 
+ Relational databases are based on the relational model, an intuitive, straightforward way of representing data in tables. In a relational database, each row in the table is a record with a unique ID called the key. The columns of the table hold attributes of the data, and each record usually has a value for each attribute, making it easy to establish the relationships among data points.

## Four crucial properties define relational database transactions

+ **Atomicity** defines all the elements that make up a complete database transaction.
+ **Consistency** defines the rules for maintaining data points in a correct state after a transaction.
+ **Isolation** keeps the effect of a transaction invisible to others until it is committed, to avoid confusion.
+ **Durability** ensures that data changes become permanent once the transaction is committed.

## Different SQL between MySQL
+ SQL stands for Structured Query Language and is a standard language used for managing and manipulating data in relational databases
+ MySQL, is a specific relational database management system (RDBMS) that uses SQL as its language.

## MySQL Architecture
https://www.youtube.com/watch?v=aKOaQfpW7to
The Architecture of MYSQL contain following major layer’s :
+ Client
+ Server
+ Storage Layer
+ 

+ services of client layer are:
    + When client request to server -> server accept, client is connected -> client get his own thread for its connection -> with this thread all the queries from client side is excecuted
    + Authentication: is performed on server side, check username and passsword.
    + Security: After authentication, server check privileges of user when issue some certain queries.

+ Route of Simple query:
  + After connection is handled, parser breaks query into tokens and build parse tree
  + Parser: uses SQL language to interpret and validate the queries
  + preprocess check priviliges.
  + Rewriter:  will write again the query if necessary based on some rules stored in MySQL.
  + MySQL uses an optimizer that is based on calculating the cost of each path 
    + -> try to predict the cost of various execution plans and choose the least expensive, 
    + the number actually estimates based on statistics. For example: number of pages per table or index, the number of distinct values of the indexes (cardinality),
  + Output of (parsing+ optimizing): query execution plan.
  + **query execution engine** use plan to process the query
  + Many operations in the plan invoke methods implemented by the storage interface
  + Return a result set to the clients even the queries that don’t return

+ InnoDB balances, higher reliability, high performance, designed for processing  many short-lived transactions
Note: storage engine does affect how server optimize the query

## Entity Relationship
+ An entity–relationship model (or ER model) describes interrelated things of interest in a specific domain of knowledge.
+ A basic ER model is composed of entity types (which classify the things of interest) and specifies relationships that can exist between entities (instances of those entity types).
+ 4 type of relationship:
  + mandatory/optional one/many

## Convention when convert from ER to Relational Database
+ **Entities and Simple Attributes**: Entities ->  is turned into a table
+ **Multi-Valued Attributes**: Each attribute turns into a column (attribute) in the table
+ The key attribute of the entity is the primary key of the table which is usually underlined (can be composite, but can never be null)
  + avoid the use of special characters.
  + If you have a multi-valued attribute, take the attribute and turn it into a new entity or table of its own
+ **1:1 Relationships**: For instance, let us consider the case where the Person has or optionally has one wife, You can place the primary key of the wife within the table of the Persons.  vice versa to put the personid as a foreign key within the Wife table.
+ **1:N Relationships**: To represent such relationship the personid as the Parent node must be placed within the Child table as a foreign key but not the other way around
+ **N:N Relationships**: Use a separate table as shown below: