## Overview

JDK 5.0 introduced Java Generics with the aim of reducing bugs and adding an extra layer of abstraction over types

## What is Generics

Generics allows coder to create classes, interfaces, and methods that can operate on different types without sacrificing type safety. It provides a way to parameterize types and enables the creation of reusable code that can work with different data types.

 ( Symbolize datatype field, pass in as parameter).

## Why we need to use Generics

The core idea behind generics: It would be much easier if programmers could **express their intention to use specific types** and the **compiler ensured the correctness of such types**

+ Type Safety: Generics provide compile-time type checking, ensuring that the correct types are used.
+ Code Reusability:
+ Abstraction and Flexibility
+ Performance and Efficiency: Generics can improve performance by eliminating the need for runtime type checks and casting
+ Stronger Type Contracts: enforce specific type constraints and communicate the intended usage of the API more effectively.
+ Enhanced Readability and Maintainability
+ **t is very useful for people who write software libraries to do generic programming because it allows users to use it in many different situations.**

## Generics parameter type naming convention

Naming parameter types is important to learn generics. It is not required, but we should follow the common convention for readability, ease of maintenance. Common parameter types are as follows:

E - Element (element – commonly used in Collection Framework)

K – Key

V – Value

N - Number (numeric type: Integer, Double, Float, ...)

T – Type (Any data type of Wrapper class: String, Integer, Long, Float, ...)

S, U, V … – used to represent data types (Type) 2nd, 3rd, 4th, …

## Usecase of Generics type

+ Collection Framework: create collections that can store elements of any type, making them type-safe. For example, `ArrayList<T>` can store elements of type `T`
+ Custom Data Structures:  e creation of custom data structures that are flexible and type-safe, for example : generic binary tree (`BinaryTree<T>`) that can store elements of any type.
+ Algorithms and Utility Classes: Generics are commonly used in algorithms and utility classes that work with different types. For example, the `Collections` class provides generic algorithms like `sort()` and `binarySearch()`, which can work with various types of collections.
+ Class Abstraction and Reusability
+ Type Safety and Compile-Time Checking: Generics provide type safety by ensuring that the correct types are used at compile time
+ APIs and Libraries: Many Java APIs and libraries utilize generics to create flexible and reusable components.
+ Event Handling and Callbacks

## Typeof Generic

+ Generics Class with inheritance
+ Generics Interface
+ Generics Method

## Wildcard

Wildcards can be used:

+ as the type of a parameter, field, or local variable;
+ sometimes as a return type.
+ **Wildcards can be used: as the type of a parameter, field, or local variable; sometimes as a return type.**
+ **Wildcards are never used as an argument to a generic method call, generic class object instantiation, or supertype.**
