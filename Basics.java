//JAVA

// Every Java program has a class name which must match the filename, and every program must contain the main() method.
// The curly braces {} marks the beginning and the end of a block of code.
// Each code statement must end with a semicolon.
// Normally, we use // for short comments, and /* */ for longer comments.

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
public class Variables {
    public static void main(String args[]) {
        String a= "value";
        char b='b';
        int x=10;
        System.out.println(a+"  "+b+"  "+x);
    }
}

// #2
public class Variables {
    public static void main(String args[]) {
        int Num = 100;
        Num = 200; 
        System.out.println(Num);
    }
}





// CONSTANTS
// Constants are declared with the word "final" in front.
// The specification of the intial value is compulsory.

public class Constants {
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

public class DataTypes {
    public static void main(String args[]) {
       byte a = 10;
       short b = 5;
       int c = 45;
       long d = 37247346387463L;
       float e = 61.9f;
       double f = 56.98d;
       char Grades ='A';
       
       System.out.println(a+"   "+b+"   "+c+"   "+d+"   "+e+"   "+f+"   "+Grades);
       
    }
}




// Boolean
public class Boolean {
    public static void main(String args[]) {
       boolean isTrue = true;
       boolean isFalse = false;
       System.out.println(isTrue);   
       System.out.println(isFalse); 
       
    }
}





// CASTING
// Type casting is a way of converting data from one data type to another data type.
// In Java, we can cast both reference and primitive data types. By using casting, data can not be changed but only the data type is changed. 
// Note: type casting is not possible for a Boolean data type.

/*Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte */

public class TestWide {
    public static void main(String args[]) {
        String x= "hello" + '/' + "world";
        char y='h';
        int a='a' ;
        long b=34 ;
        float c=b ;
        double d=3.458D ;
        System.out.println(x+"   "+a+"   "+b+"   "+c+"   "+d+"   "+y);
    }
}






// ARITHEMATIC OPERATORS

public class Arithmetic {
  public static void main(String[ ] args) {
    int x=12;
    int y=2*x;
    System.out.println(y);
    int z=(y-x)%5;
    System.out.println(z);
    final float pi=3.1415F;
    float f=pi/0.62F;
    System.out.println(f);
  }
}

//
public class ShortHand {
  public static void main(String[ ] args) {
    int x=12;
    x+=5;
    System.out.println(x);
    x*=2;
    System.out.println(x);
  }
}





// CONTROL STATEMENTS

// If-else statements
 public class Main {
    public static void main (String[] args) {
        char c= 'a';
        if ((c>='a' && c<='z') || (c>='A' && c<='Z')) 
            System.out.println("The letter is: "+c);
            
            else if (c>=0 && c<=9) 
            System.out.println("the digit is: "+c);
              
              else {
              System.out.println("The given input "+ c + " is not a letter");
              System.out.println("Nor it's a digit");
              }
        
    }
}




// While Loop

public class Main {
    public static void main(String[] args) {
        final float InitialValue=2.34F;
        final float step=0.11F;
        final float limit=4.69f;
        float var =InitialValue;
        
        int counter=0;
        while (var<limit){
            var+=step;
            counter++;
        }
        System.out.println("Incremented by " + counter+" times");
        
    }
}




// For Loop
// The for loop in Java is an entry controlled loop that allows a user to execute a block of a statement(s) repeatedly 
// with a fixed number of times on the basis of the test expression or test-condition.

// Statement 1 is executed (one time) before the execution of the code block.
// Statement 2 defines the condition for executing the code block.
// Statement 3 is executed (every time) after the code block has been executed.

// Example-
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}

// Code-
public class Main {
    public static void main(String[] args) {
        final float InitialValue=2.34F;
        final float step=0.11F;
        final float limit=4.69f;
        int counter=0;
        
        for (float var = InitialValue ; var < limit ; var += step)
        counter++;
        System.out.println("Incremented by " + counter + " times.");
        
    }
}





// Do-While Loop
// The do/while loop is a variant of the while loop. 
// This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.

public class Main {
    public static void main(String[] args) {
        int x = 0;
        do {
            x = 1;
           
        } while (x<0);
        System.out.println(x);
    }
}




// Arrays

// Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
//To declare an array, define the variable type with square brackets:
String[] items;

// We have now declared a variable that holds an array of strings. 
// To insert values to it, we can use an array literal - place the values in a comma-separated list, inside curly braces:

String[] items = {"Table", "Chair", "Car", "Book"};

// To access an array element refer to the index number.
System.out.println(items[2]);

// To find out how many elements an array has, use the length property:
System.out.println(items.length);

//A multidimensional array is an array of arrays.
// To create a two-dimensional array, add each array within its own set of curly braces:

int[][] Num = { {1, 2, 3, 4}, {5, 6, 7} };

// We can also use a for loop inside another for loop to get the elements of a two-dimensional array (we still have to point to the two indexes):

public class Main {
  public static void main(String[] args) {
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}
