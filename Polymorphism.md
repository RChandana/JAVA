# Run-time VS Compile-time

 Compile-time is the time at which the source code is converted into an executable code while the run time is the time at which the executable code is started running. Both the compile-time and runtime refer to different types of error.
 
## Complie time errors

Compile-time errors are the errors that occurred when we write the wrong syntax. If we write the wrong syntax or semantics of any programming language, then the compile-time errors will be thrown by the compiler. The compiler will not allow to run the program until all the errors are removed from the program. When all the errors are removed from the program, then the compiler will generate the executable file.

The compile-time errors can be:
* Syntax errors
* Semantic errors

### Syntax errors
When the programmer does not follow the syntax of any programming language, then the compiler will throw the syntax error.

### Semantic errors
The semantic errors exist when the statements are not meaningful to the compiler.

## Run time errors

The runtime errors are the errors that occur during the execution and after compilation. The examples of runtime errors are division by zero, etc. These errors are not easy to detect as the compiler does not point to these errors.







# Overriding VS Overloading

When two or more methods in the same class have the same name but different parameters, it’s called Overloading.
When the method signature (name and parameters) are the same in the superclass and the child class, it’s called Overriding.

1) Overriding implements Runtime Polymorphism whereas Overloading implements Compile time polymorphism.
2) The method Overriding occurs between superclass and subclass. Overloading occurs between the methods in the same class.
3) Overriding methods have the same signature i.e. same name and method arguments. 
Overloaded method names are the same but the parameters are different.
4) With Overloading, the method to call is determined at the compile-time. 
With overriding, the method call is determined at the runtime based on the object type.
5) If overriding breaks, it can cause serious issues in our program because the effect will be visible at runtime.
 Whereas if overloading breaks, the compile-time error will come and it’s easy to fix.



# Polymorphism

Polymorphism refers to the fact that you can have multiple methods with the same name in the same class
 There are two kinds of polymorphism:
* Overloading/compile time polymorphism - Two or more methods with different signatures 

* Overriding/runtime time polymorphism - Replacing an inherited method with another having the same signature
