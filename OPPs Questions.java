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

















/*Imagine you are maintaining personal data of all the players in your club.
Three personal data namely name, age, and individual salary are the parameters which you are maintaining.
You have kept those data as private to a particular class named PlayerRecords.
However, you have also kept some provisions for the club owner to set and access those private data.
Write a java code fulfilling the above criteria to implement the scenario and display name, age, and their individual salary. 
Be sure to get the accessibility right.
Find the name of the player whose salary is highest. Imagine a single highest paid player is there in the team.

[Hints: “some provisions” means some methods with proper access modifiers. Club owner is accessing those data from main method of another class.]*/



public class PlayerRecord {
    
    private String name;
    private int age;
    private double salary;

    public PlayerRecord(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public String toString() {
        return "Name: " + name + "Age: " + age + "Salary: " + salary;
    }
}
public class Club {
    public static void main(String[] args) {
        
        PlayerRecord[] players = new PlayerRecord[5];

        players[0] = new PlayerRecord("Chandana", 18, 100000);
        players[1] = new PlayerRecord("Priya", 22, 75000);
        players[2] = new PlayerRecord("Deepika", 23, 80000);
        players[3] = new PlayerRecord("Shriya", 16, 760000);
        players[4] = new PlayerRecord("Sanjana", 21, 830000);
        System.out.println("Players details:");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < players.length; i++)
            System.out.println(players[i]);
        int max = 0;

        for (int i = 0; i < players.length; i++) {
            if (players[i].getSalary() > players[max].getSalary())
                max = i;
        }
        System.out.println("Highest Paid Player : " + players[max].getName());

    }
