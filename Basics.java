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

public class HelloWorld {
    public static void main(String args[]) {
        String a= "value";
        char b='b';
        int x=10;
        System.out.println(a+"  "+b+"  "+x);
    }
}



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
