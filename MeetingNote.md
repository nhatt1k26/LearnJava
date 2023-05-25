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

This ensures that the necessary initialization steps are performed before executing the specific code in the current constructor.

Need to
