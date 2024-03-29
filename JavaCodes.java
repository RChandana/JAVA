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




