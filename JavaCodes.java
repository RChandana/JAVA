// Print the largest number of the given three numbers.

public class Main
{
	public static void main(String[] args) {
	    int a=140;
	    int b=22;
	    int c=10;
	    if (a>b && a>c) {
	        System.out.println(a);
	    }
	    else if (b>c){
	        System.out.println(b);
	    }
	    else System.out.println(c);
	}
}




// Print the largest number out of the three using user input.

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    int a, b, c;
	    Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the first number:");  
        a = sc.nextInt();  
        System.out.println("Enter the second number:");  
        b = sc.nextInt();  
        System.out.println("Enter the third number:");  
        c = sc.nextInt();  

	        if (a>b && a>c) {
	        System.out.println("The largest number is: "+a);
	            
	        }
	        else if (b>c){
	            System.out.println("The largest number is: "+b);
	            
	        }
	        else System.out.println("The largest number is: "+c);
	}
}


// Verify if a number is a odd number or an even number.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         int a;
	     Scanner sc = new Scanner(System.in);  
         System.out.println("Enter the number:"); 
         a = sc.nextInt();  {
             if  (a%2==1) 
                 System.out.println("The given number is a odd number.");
             else System.out.println("The given number is a even number.");
             
         }
    }
}


// Verify if the given number is a prime number or not.
// Note: To make it more optimistic so that the code does not execute (a-2) times 
// we can just put the range of j from 2 to a/2 as there won't be any number divisible by a after a/2.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         int a,j;
         boolean prime=true;
	     Scanner sc = new Scanner(System.in);  
         System.out.println("Enter the number:"); 
         a = sc.nextInt();
         if (a==1)
         System.out.println("The given number is not a prime number.");
         else {
             for (j=2;j<a;j++) {
                 if (a%j==0){
                     prime=false;
                     System.out.println("The given number is not a prime number.");
                     break;
                }
                
            }
             if (prime==true)
                 System.out.println("The given number is a prime number.");
        }
    }     
}



// Create a Constructor Class for the student class. 
// The constructor should be described with Name, Registration No., Internal Marks1, Internal Marks2, Internal Marks3. 
// Write a program that overloads the constructor by initiating the objects and displaying the initial vlaues.

import java.lang.*;
class Main{
    String regNo;
    String stuName;
    int intMarks1;
    int intMarks2;
    int intMarks3;
    Main(){
        regNo = "21BCE8718";
        stuName = "R.Hari Chandana";
        intMarks1=87;
        intMarks2=44;
        intMarks3=55;
    }
    Main(String a,String b,int c,int d,int e){
        regNo = a;
        stuName = b;
        intMarks1=c;
        intMarks2=d;
        intMarks3=e;
        
    }
    void display(){
        System.out.println(regNo);
        System.out.println(stuName);
        System.out.println(intMarks1);
        System.out.println(intMarks2);
        System.out.println(intMarks3);
        
    }
    public static void main(String args[]){
        Main s1 = new Main();
        Main s2= new Main("21BCE8718" , "R.Hari Chandana " , 99 , 76 , 90);
        s1.display();
        s2.display();
       }
   }



// Write a Java program that reads 15 numbers and returns Positive Numbers, Negative Numbers and Zeroes

import java.util.Scanner;
public class Main
{
  public static void main(String[] args) 
  {
    int Size, i;
    Scanner sc = new Scanner(System.in);
    System.out.print(" Please Enter Number of elements in an array : ");
    Size =sc.nextInt();  
    int [] a = new int[Size];
    System.out.print(" Please Enter " + Size + " elements of an Array  : ");
    for (i = 0; i < Size; i++)
    {
      a[i] =sc.nextInt();
    }   
    for(i = 0; i < Size; i++)
    {
      if(a[i] > 0)
      {
        System.out.println("Positive Number:"+a[i]);
      }
      else if (a[i]<0)
      {
        System.out.println("Negative Number:"+a[i]);
      }
      else
        {
            System.out.println(a[i]+" is Zero");
        }

    }  
  }
}




// Java program to add digits in a number

import java.util.Scanner;  
public class Main{  
    public static void main(String arg[]){  
        long number, sum;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter a number: ");  
        number=sc.nextLong();  
        for(sum=0; number!=0; 
	number=number/10) {  
            sum = sum + number % 10;  
            
        } 
        System.out.println("Sum of digits: "+sum); 
    }  
}  




/*Create a class namely Student which should include the parameters name, register number and address. 
Define instance methods for setting and retrieving values after that instantiate respective object too. 
Save the application as lab2.java.*/

import java.lang.*; public class Student{
	public String name;
        public String regNo;
        public String address;
        public Student (String stuName) { 
		name = stuName;
	}
	public void setRegNo(String stuRegNo) {
		regNo = stuRegNo; 
	}
	public void setAddress(String stuAddress) {
		address = stuAddress;
	}
	public void main() {
		System.out.println("Name: " + name); 
		System.out.println("RegNo:" + regNo); 
		System.out.println("Address:" + address);
	}
	public static void main(String args[]) {
		Student StuOne = new Student("Chandana"); 
		Student StuTwo = new Student("Sanjana"); 
		Student StuThree = new Student("Shreya");
		StuOne.setRegNo("21BCEXXXX"); 
		StuTwo.setRegNo("21BCEXXXX"); 
		StuThree.setRegNo("21BCEXXXX");
		StuOne.setAddress("A"); 
		StuTwo.setAddress("B"); 
		StuThree.setAddress("C");
		StuOne.main(); 
		StuTwo.main(); 
		StuThree.main();
	}
}






/* Write a Java application that uses the Math class to determine the answers for each of the following: (Use java.lang.Math class)
a. The square root of 37
b. The sine and cosine of 300
c. The value of the floor, ceiling, and round of 22.8
d. The larger and the smaller of the character ‘D’ and the integer 71
e. A random number between 0 and 20
(Hint: The random() method returns a value between 0 and 1; you want a number that is 20 times larger.) Save the application as MathTest.java.*/

public class MathTest {
	public static void main(String[] args) {
        System.out.println("The square root of 37 = " + Math.sqrt(37)); 
	System.out.println("The sine of 300 =" + Math.sin(300)); 
	System.out.println("The cosine of 300 =" + Math.cos(300)); 
	System.out.println("The value of the floor 22.8 =" + Math.floor(22.8)); 
	System.out.println("The value of the ceiling 22.8 =" + Math.ceil(22.8));
	System.out.println("The value of the round 22.8 =" + Math.round(22.8)); int number = 'D';
        System.out.println("The larger of the character ‘D’ and the integer 71 =" + Math.max(number, 71));
        System.out.println("The Smaller of the character ‘D’ and the integer 71 =" + Math.min(number, 71));
        System.out.println("A random number between 0 and 20 = "+(int)(Math.random()* 20 + 1));
	} 
}











/*Get two string inputs Object Orientedand Programming lab from user. 
Then find the length of  those  two  inputs. 
Further  do  perform  concatenation  and  comparison.  
Finally  apply  at  least  5 more java string methods for the inputs.*/




/*Create  a  class  named Poem that  contains  fields  for  the  name  of  the  poem  and  the  number  of lines in it. 
Include a constructor that requires values for both fields. Also include get methods to retrieve  field  values.  
Create  three  subclasses: Couplet,  Limerick,  and  Haiku. 
The  constructor for each subclass requires only a title; the lines field is set using a constant value.
A couplet has two  lines,  a  limerick  has  five  lines,  and  a  haiku  has  three  lines.  
Create  an  application  that demonstrates  usage  of  an  objectof  each  type. 
Save  the  files  as  Poem.java,  Couplet.java, Limerick.java, Haiku.java, and DemoPoems.java.*/


package demopoems;
public class Poem {
    private String name;
    private int number_of_lines;
    Poem(){
    }
    Poem(String s, int n){
        name = s;
        number_of_lines = n;
    }
    String getName(){
        return name;
    }
    int getNumber(){
        return number_of_lines;
    }
}
public class Couplet extends Poem {
    private String title; 
    private int lines;
    Couplet(String t){
        super(t,2);
  }
  
  void display(){
      System.out.printf("Name:  %s\nNumber of lines: %d\n",getName(), getNumber());
  }
}
public class Limerick extends Poem{
    private String title; 
    private int lines;
    Limerick(String t){
        super(t, 5);
    } 
    void display(){
      System.out.printf("Name:  %s\nNumber of lines: %d\n",getName(), getNumber());
  }
}
public class DemoPoems {
    public static void main(String[] args) {
        Haiku h = new Haiku("Testing Haiku");
        Couplet c = new Couplet("Testing Couplet");
        Limerick l = new Limerick("Testing Limeric");
        
        h.display();
        c.display();
        l.display();
    }
}







/*Write  an  application  named BookArray in  which  you  create  an  array  that  holds  10  Books, some Fiction and some NonFiction. 
Using a for loop, display details about all 10 books. Save the file as BookArray.java.*/

public class BookArray{
    public static void main(String[] args){
        Book books[] = new Book[10];
        books[0] = new Fiction("Hamlet");
        books[1] = new Fiction("Harry Potter");
        books[2] = new Fiction("Twilight");
        books[3] = new Fiction("Heirs of Fire");
        books[4] = new Fiction("Assasin's Blade");
        books[5] = new Fiction("One night at the Call Center");
        books[6] = new NonFiction("Thomas Calculus");
        books[7] = new NonFiction("A Brief History of Time");
        books[8] = new NonFiction("Into Thin Air");
        books[9] = new NonFiction("The Dairy of a Young Girl");
        System.out.println("Details of all the books:");
        for(int i = 0; i < books.length; i++){
            System.out.println();
            System.out.println((i + 1) + ") Name : " +books[i].getBookTitle());
            System.out.println("Price : Rs. "+ books[i].getBookPrice());
        }
    }
}
class Book{
    private String bookTitle;
    private double bookPrice;
    public Book(String title){
        this.bookTitle = title;
        bookPrice = 1000;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public double getBookPrice() {
        return bookPrice;
    }
}
class Fiction extends Book{
    public Fiction(String title) {
        super(title);
   }
}
class NonFiction extends Book{
    public NonFiction(String title) {
        super(title);
   }
}
