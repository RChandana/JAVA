// Every Java program has a class name which must match the filename, and every program must contain the main() method.
// The curly braces {} marks the beginning and the end of a block of code.
// Each code statement must end with a semicolon.
// Normally, we use // for short comments, and /* */ for longer.

//Hello World

public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello World");
    }
}



// VARIABLES
/* Variable in JAVA are:
String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false */

// #1
public class HelloWorld {
    public static void main(String args[]) {
        String a= "value";
        char b='b';
        int x=10;
        System.out.println(a+"  "+b+"  "+x);
    }
}

// #2
public class HelloWorld {
    public static void main(String args[]) {
        int Num = 100;
        Num = 200; 
        System.out.println(Num);
    }
}



// CONSTANTS
// Constants are declared with the word "final" in front.
// The specification of the intial value is compulsory.

public class HelloWorld {
    public static void main(String args[]) {
       final int Num = 5;
       Num = 10;
       System.out.println(Num);
    }
}

// ERROR:  HelloWorld.java:4: error: cannot assign a value to final variable Num
       //Num = 10;
       //^
//1 error



// FUNDAMENTAL DATA TYPES
// Integer: byte, short, int, and long
// Floating Point: float and doulbe
// Characters: char
// boolean, void and string

// Even though there are many numeric types in Java, the most used for numbers are int (for whole numbers) and double (for floating point numbers).


// CASTING
// Type casting is a way of converting data from one data type to another data type.
// In Java, we can cast both reference and primitive data types. By using casting, data can not be changed but only the data type is changed. 
// Note: type casting is not possible for a Boolean data type.

public class TestWide {
    public static void main(String args[]) {
        String x= "hello" + '/' + "world";
        char y='h';
        int a='a' ;
        long b=34 ;
        float c=109 ;
        double d=3.458D ;
        System.out.println(x+"   "+a+"   "+b+"   "+c+"   "+d+"   "+y);
    }
}



//
