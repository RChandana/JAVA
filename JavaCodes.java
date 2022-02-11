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
    //R.Hari Chandana 21BCE8718
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
