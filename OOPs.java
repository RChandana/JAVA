/* A class is a template for an object, and an object is an instance of a class.
 The data, or variables, defined within a class are called instance variables. The code is contained within methods. 
 Collectively, the methods and variables defined within a class are called members of the class.
 Variables defined within a class are called instance variables because each instance of the class
 (that is, each object of the class) contains its own copy of these variables. 
 Thus, the data for one object is separate and unique from the data for another. 
 The dot operator links the name of the object with the name of an instance variable. */

// Finding the volume of the box.
public class Main{
    double width;
    double height;
    double depth;
    public static void main(String args[]) {
        Main mybox = new Main();
        double vol;
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
    
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume is " + vol);
  }
}


// The new operator dynamically allocates (that is, allocates at run time) memory for an object and returns a reference to it.
// This reference is, more or less, the address in memory of the object allocated by new.


/* When you assign one object reference variable to another object reference variable,
you are not creating a copy of the object, you are only making a copy of the reference.*/
Box b1 = new Box();
Box b2 = b1;
b1 = null;










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

	
	
	
	
	
	
/*•Define a class named Payment that contains a member variable of type double that stores the amount of the payment and appropriate accessor and mutator methods.
Also create a method named paymentDetails that outputs an English sentence to describe the amount of the payment.
  
•Next, define a class named CashPayment that is derived from Payment.  
This class should redefine the paymentDetails method to indicate that the payment is in cash.  Include appropriate constructor(s).
  
•Define a class named CreditCardPayment that is derived from Payment.  
This class should contain member variables for the name on the card, expiration date, and credit card number.  Include appropriate constructor(s). 
Finally, redefine the paymentDetails method to include all credit card information in the printout.
  
•Create a main method that creates at least two CashPayment and two CreditCardPayment objects with different values and calls paymentDetails for each.*/	

	
	
	
	
class Payment{
    private double amount;
    public Payment( ){
        amount = 0;
    }
    public Payment(double amount){
        this.amount = amount;
    }
    public void setPayment(double amount){
        this.amount = amount;
    }
    public double getPayment( ){
    return amount;
    }
    public void paymentDetails( ){
        System.out.println("Payment amount : " + amount);
    }
}
class CashPayment extends Payment{
    public CashPayment( ){
        super( );
    }
    public CashPayment(double amt){
        super(amt);
    }
    public void paymentDetails( ){
        System.out.println("Payment amount : "+ getPayment( ));
    }
}
class CreditCardPayment extends Payment{
    private String name;
    private String expiration;
    private String creditcard;
    public CreditCardPayment(){
        super( );
        name = " ";
        expiration = " ";
        creditcard = "";
    }
    public CreditCardPayment(double amt, String name, String expiration, String creditcard){
        super(amt);
        this.name = name;
        this.expiration = expiration;
        this.creditcard = creditcard;
    }
    public void paymentDetails( ){
        System.out.println("Credit card payment amount :  " + getPayment( ));
        System.out.println("Name on the Card : " + name);
        System.out.println("Expiration Date : " + expiration);
        System.out.println("Card Number : " + creditcard);
    }
}
class OutputPayment{
    public static void main(String[ ] args){
        CashPayment cash1 = new CashPayment(1000), cash2 = new CashPayment(200), cash3 = new CashPayment(500);
        
        CreditCardPayment credit1 = new CreditCardPayment(100, "Chandana" , "09/04/2030" , "1111111111");
        
        CreditCardPayment credit2 = new CreditCardPayment(50 , "Tina", "03/11/2025" , "999999999");
        
        CreditCardPayment credit3 = new CreditCardPayment(150 , "Cherry", "03/02/2028" , "555555555");
        
        
        System.out.println("1st User Cash Details:");
        cash1.paymentDetails( );
        System.out.println();
        
        System.out.println("2nd User Cash Details:");
        cash2.paymentDetails( );
        System.out.println();
        
        System.out.println("3rd User Cash Details:");
        cash3.paymentDetails( );
        System.out.println();
        
        System.out.println("1st User Credit Details:");
        credit1.paymentDetails( );
        System.out.println();
        
        System.out.println("2nd User Credit Details:");
        credit2.paymentDetails( );
        System.out.println();
        
        System.out.println("3rd User Credit Details:");
        credit3.paymentDetails( );
        System.out.println();
    }
}	
	

	
	
	
	
	
	
	
	
	
	
	
// Array of Objects	
	
	
import java.util.*;
class Bank
{
   String name;
   int account_no;
   String account_type;
   double amount;
   Bank(String n, int no, String t, double a)
   {
       name=n;
       account_no=no;
       account_type=t;
       amount=a;
   }
   public void display()
   {
       System.out.println("Name: "+name);
       System.out.println("Account Number: "+account_no);
       System.out.println("Account Type: "+account_type);
       System.out.println("Amount: "+amount);  
   }
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int accType,account_no;
       String name, account_type="";
       double amount;
       Bank customer[]=new Bank[4];
       for(int i=0;i<4;i++)
       {
           System.out.print("Enter name of customer "+(i+1)+": ");
           name=sc.nextLine();
           System.out.print("Enter account number of customer "+(i+1)+": ");
           account_no=sc.nextInt();
           System.out.print("Slect account_type of customer "+(i+1)+", 1 for savings and 2 for current: ");
           accType=sc.nextInt();
           if(accType==1)
               account_type="Savings";
           else if(accType==2)
               account_type="Current";
           System.out.print("Enter amount of customer "+(i+1)+": ");
           amount=sc.nextDouble();
           customer[i]=new Bank(name,account_no,account_type,amount);
       }
       for(int i=0;i<4;i++)
           customer[i].display();
   }
}	
	
	
	
