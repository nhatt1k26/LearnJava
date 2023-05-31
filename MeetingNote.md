## Meeting note 22/5/2023

Issue 1:

- Install JDK 11
- Why should we use JDK 11 rather than newer version?
  - Stability and Long-Term Support:
    - These older version is a LTS release, means that it receives update and bug extended period  for a long period.
    - JDK have stability and have more mature and proven JDK version
    - When deploy some application, require the availability and compatibility of third party libraries, framework and tools that project relies one. With lower JDK version will ensure that they are compatible with the JDK version that we choose.
    - JDK 11 have stronger community support and documentation available.
  - Ecosystem and Community Support

**Meeting note 24/5/2023**

### AutoBoxing and  Unboxing:

### 2 Type of  AutoBoxing and Unboxing:

+ Implicit:

```java
  int val = 1;
  Integer wrapVal = new Interger();
  wrapVal = new wrapVal 
   
```

+) Explicit

### Reasons why we use `this` in the first line of a constructor:

The parent class' constructor needs to be called before the subclass' constructor. This will ensure that if you call any methods on the parent class in your constructor, the parent class has already been set up correctly.

## Meeting note 25/5

+ Naming Conventions:

  + Class Names:

    + Start with an uppercase letter.
    + Use nouns or noun phrases that describe the class's purpose.
    + Avoid using underscores; instead, use camel case (e.g., `MyClass`).
  + Constant Names:

    + Use uppercase letters for the entire name
    + Separate words with under scores: Max Values
  + Method Name:

    + Start with lowercase letter
    + Use verb or verb phrase decribe the method's action
    + Use camel case instead of using under score
  + Pakage Name: Use lowercase letter

    + Use a reversed domain name to ensure uniqueness
  + Acronyms and Abbreviations:

    + Acronyms should be treated as words (e.g., `XMLParser`).
    + Abbreviations should be avoided or used sparingly.
+ Upcasting, downcasting

  + Assign subclass variable for supperclass reference variable
  + Downcasting: assign object of supperclass for subclass reference variable

+ Static Method - Static void Main

+ Static vs Dynamic Binding in Java
In Java static binding refers to the execution of a program where type of object is determined/known at compile time i.e when compiler executes the code it know the type of object or class to which object belongs.While in case of dynamic binding the type of object is determined at runtime.
  + When type of the object is determined at run-time, it is known as dynamic binding.
  + When type of the object is determined at compile-time, it is known as static binding.