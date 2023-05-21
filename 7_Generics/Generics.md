## Overview

JDK 5.0 introduced Java Generics with the aim of reducing bugs and adding an extra layer of abstraction over types

## The Need for Generics

The core idea behind generics: It would be much easier if programmers could express their intention to use specific types and the compiler ensured the correctness of such types

## Generics parameter type naming convention

Naming parameter types is important to learn generics. It is not required, but we should follow the common convention for readability, ease of maintenance. Common parameter types are as follows:

E- Element (element – commonly used in Collection Framework)

K – Key

V – Value

N - Number (numeric type: Integer, Double, Float, ...)

T – Type (Any data type of Wrapper class: String, Integer, Long, Float, ...)

S, U, V … – used to represent data types (Type) 2nd, 3rd, 4th, …
