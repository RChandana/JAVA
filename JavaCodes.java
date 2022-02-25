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




/*Create a class named Billing that includes three overloaded computeBill() methods for a
photo book store.

When computeBill() receives a single parameter, it represents the price of one photo book ordered. Add 8% tax, and return the total due.

When computeBill() receives two parameters, they represent the price of a photo book and the quantity ordered. 
Multiply the two values, add 8% tax, and return the total due.

When computeBill() receives three parameters, they represent the price of a photo book, the quantity ordered, and a coupon value. 
Multiply the quantity and price, reduce the result by the coupon value, and then add 8% tax and return the total due.

Write a main() method that tests all three overloaded methods. Save the application as Billing.java.*/


public class Billing {
	private float photobookprice=0; 
	private int photobooks = 1;
        private final int taxpercent = 8; 
	private float couponValuePercent=0; 
	private float totalDue=0;
        public Billing(float photobookprice) { 
		this.photobookprice = photobookprice; 
		totalDue = calculateOneBookPrice();
  }
	public Billing(float photobookprice, int photobooks) { 
		this(photobookprice);
                this.photobooks = photobooks;
                totalDue = calculateBooksPrice(); 
	}
        public Billing(float photobookprice, int photobooks, float couponValuePercent) {  
		this(photobookprice, photobooks);
                this.couponValuePercent = couponValuePercent;
                totalDue = calculateBooksPriceWithCoupon();
	}
	private float calculateOneBookPrice() {
		return photobookprice + (0.08f * photobookprice);
	}
	private float calculateBooksPrice() {
		return calculateOneBookPrice() * photobooks;
	}
	private float calculateBooksPriceWithCoupon() {
		return (calculateOneBookPrice() * photobooks) - couponValuePercent;
	}
	public static void main(String[] args) {
		Billing bill1 = new Billing(250);
		Billing bill2 = new Billing(250,4); 
		Billing bill3 = new Billing(250,12,2.5f);
		System.out.println(bill1.toString()); 
		System.out.println(bill2.toString()); 
		System.out.println(bill3.toString());
	}
	public float getTotalDue() { 
		return totalDue;
	}
	public float getPhotobookprice() {
		return photobookprice;
	}
	public void setPhotobookprice(float photobookprice) { 
		this.photobookprice = photobookprice;
	}
	public int getPhotobooks() { 
		return photobooks;
	}
	public void setPhotobooks(int photobooks) { 
		this.photobooks = photobooks;
	}
	public float getCouponValuePercent() { 
		return couponValuePercent;
	}
	public void setCouponValuePercent(float couponValuePercent) { 
		this.couponValuePercent = couponValuePercent;
	}
	public int getTaxpercent() {
		return taxpercent;
	}
	public String toString() {
		return "PhotoBookPrice=" + photobookprice + "\n" + " PhotoBooks="+ photobooks + "\n" + "CouponValuePercent=" + couponValuePercent + "\n" + "TotalDue="+ totalDue ;
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




/* 1. Define a class named Payment that contains an instance variable of type double that stores the amount of payment and appropriate accessor and mutator methods.
Also create a method named PaymentDetails that outputs an english sentence to describe the amount of payment.

2. Define a class named CashPayment that is derived from Payment. This class should redefine the paymentDetails method to indicate that the payment is in cash. 
Include appropriate constructor.

3. Define a class named CreditCardPayment that is derived from Payment. 
This class should contain instance variables for the name on the card, expiration date, and credit card number. 
Finally, redefine the paymentDetails method to include all credit card information in the print out.

Create a main method that creates at least two CashPayment and two CreditCardPayment objects with different values and calls paymentDetails for each.*/

class Payment

{

        private double amount;

        public Payment(){            {

               amount = 0;

        }

        public Payment(double amount){

                this.amount = amount;

        }

        public void setPayment(double amount){

                 this.amount = amount;

        }

        public double getPayment(){

                 return amount;

        }

        public void paymentDetails(){

                 System.out.println("The payment amount is " + amount);

        }

}

class CashPayment extends Payment{

        public CashPayment(){

               super();

        }

        public CashPayment(double amt){

               super(amt);

        }

          public void paymentDetails(){

               System.out.println("The cash payment amount is "

                    + getPayment());

        }

}

class CreditCardPayment extends Payment{

        private String name;

        private String expiration;

        private String creditcard;

        public CreditCardPayment(){

                        super();

                        name = "";

                        expiration = "";

                        creditcard = "";

        }

        public CreditCardPayment(double amt, String name, String expiration, String creditcard){

                        super(amt);

                        this.name = name;

                        this.expiration = expiration;

                        this.creditcard = creditcard;

        }

          public void paymentDetails(){

                        System.out.println("The credit card payment amount is " + getPayment());

                        System.out.println("The name on the card is: " + name);

                        System.out.println("The expiration date is: " + expiration);

                        System.out.println("The credit card number is: " + creditcard);

        }

}

class Question1Payment{

        public static void main(String[] args)

        {

          CashPayment cash1 = new CashPayment(50.5), cash2 = new CashPayment(20.45);

          CreditCardPayment credit1 = new CreditCardPayment(10.5, "Fred", "10/5/2010", "123456789");

          CreditCardPayment credit2 = new CreditCardPayment(100, "Barney", "11/15/2009", "987654321");

          System.out.println("Cash 1 details:");

          cash1.paymentDetails();

          System.out.println();

          System.out.println("Cash 2 details:");

          cash2.paymentDetails();

                  System.out.println();

          System.out.println("Credit 1 details:");

          credit1.paymentDetails();

          System.out.println();

          System.out.println("Credit 2 details:");

          credit2.paymentDetails();

          System.out.println();

        }

}

