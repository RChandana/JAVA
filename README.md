# JAVA

### Methods

 A method in Java is a block of code that, when called, performs specific actions mentioned in it.
 You can insert values or parameters into methods, and they will only be executed when called. 
 They are also referred to as functions. The primary uses of methods in Java are:

 - It allows code reusability (define once and use multiple times).
 - You can break a complex program into smaller chunks of code.
 - It increases code readability.

 The six components for declaring the methods are:
  - Access Specifiers
  - Return Type
  - Method Name
  - Parameter List
  - Method Signature
  - Method Body 


  
Example-
```java
public class Main {
    public int sumOfNumbers(int a, int b) {
        int addition=a+b;
        return addition;
    }
    public static void main (String[] args) {
        int x=100;
        int y=200;
        Main obj=new Main();
        int Sum=obj.sumOfNumbers(x,y);
        System.out.println("The sum of the given numbers is: "+Sum);
    }
}
```


1) Access Specifiers:

It is used to define the access type of the method. The above syntax sees the use of the “public” access specifier. 
However, Java provides four different specifiers, which are:

- Public: You can access it from any class.
- Private: You can access it within the class where it is defined.
- Protected: Accessible only in the same package or other subclasses in another package.
- Default: It is the default access specifier used by the Java compiler if we don’t mention any other specifiers. It is accessible only from the package where it is declared.

 
 2) Return Type: 
 
 It defines the return type of the method. Here “int” is a return type. 
 We can mention void as the return type if the method returns no value.
 


3) Method Name: 

It is used to give a unique name to the method. Here “sumOfNumbers” is the method name.



4) Parameter List:

It is a list of arguments (data type and variable name) that will be used in the method. 
In the above syntax, “int a, int b” mentioned within the parentheses is the parameter list. 
You can also keep it blank if you don’t want to use any parameters in the method.


5) Method Signature:

The method signature is just a combination of the method name and parameter list.
Here ```sumOfNumbers(int a, int b)``` is the method signature.


6) Method Body:

```java
{
int addition = a+b;
return addition;
}
```



