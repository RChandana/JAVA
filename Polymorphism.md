<img width="800" alt="Screenshot 2022-03-31 at 8 14 04 PM" src="https://user-images.githubusercontent.com/89007620/161082874-8468bea7-7fc7-49b5-ac4f-1c9b549c5c4c.png">

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
