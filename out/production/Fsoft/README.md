## Immutable vs mutable

+ Value can not/ can be change after intitialization
+ Use for class and object
+ String is immutable, StringBuffer and StringBuilder is mutable

## Intilialize String

+ Using String Literal
+ Using New Keyword

## Why is String Immutable in Java

 **The main benefits of keeping this class immutable are cache, security, synchronization and performance.**

+ saves a lot of the same heap 's resources
+ Security: Java applications to store sensitive pieces of information like usernames,
+ Synchronization: Immutable makes String safe because they will not be changed when accessed from many different threads
+ HashCode: String object use hash implementation many time, So hashCode method is overridden in String class to facilitate caching. hashCode() is caculated only once and the latter method return the same value

## StringBuilder and StringBuffer

+ Same: They are both mutable objects
+ Different:  StringBuffer provides synchronous mechanism for multithreading
+ Cons: StringBuffer causes significant performance loss
