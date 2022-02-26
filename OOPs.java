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
 
 
 
 
 
 
 
 
 
 
 
 //
