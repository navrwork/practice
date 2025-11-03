# Java 5 Features

Java 5 introduced several significant features, including generics, enhanced for-loops, variable arguments, and annotations, which greatly improved the language's usability and type safety.

# Key Features of Java 5

## Generics
Generics allow developers to define classes, interfaces, and methods with a placeholder for types, enabling compile-time type checking and eliminating the need for most type casts. This feature enhances type safety and code reusability by allowing collections to be defined with specific types. 

### WildCard
| Wildcard Type | Adding Elements | Reading Elements | Use Case | 
|-----:|---------------|-----|---------------|
| List<?> | Not allowed (except null) | Read as Object | Read-only for unknown types |
| List<? extends T> | Not allowed (except null) | Read as T | Read-only for subtypes of T |
| List<? super T> | Can add T and subtypes | Read as Object | Write data of type T or its subtypes |


## Enhanced For-Loop
Also known as the "for-each" loop, this feature simplifies the syntax for iterating over arrays and collections. It provides a cleaner and more readable way to traverse elements without the need for an explicit iterator. 


## Variable Arguments (Varargs)
This feature allows methods to accept a variable number of arguments, making it easier to create methods that can handle different numbers of parameters. It is declared using three dots (...) after the parameter type. 


## Annotations
Annotations provide a way to add metadata to Java code. They can be used to give information to the compiler or to be processed at runtime by frameworks and libraries. This feature supports better code documentation and can be used for various purposes, such as configuration and validation. 

## Static Imports
This feature allows the use of static members of a class without needing to qualify them with the class name. It simplifies code and improves readability, especially when using constants or utility methods. 

These features collectively enhance Java's capabilities, making it more powerful and easier to use for developers. They also align with modern programming practices, promoting cleaner and more maintainable code.
