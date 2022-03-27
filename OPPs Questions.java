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

class PlayerRecord {
    
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
        return "\n"+"Name: " + name+ "\n" + "Age: " + age+ "\n" + "Salary: " + salary+ "\n"+ "\n";
    }
}
class Club {
    public static void main(String[] args) {
        PlayerRecord[] players = new PlayerRecord[5];

        players[0] = new PlayerRecord("Chandana", 18, 100000);
        players[1] = new PlayerRecord("Priya", 22, 75000);
        players[2] = new PlayerRecord("Deepika", 23, 80000);
        players[3] = new PlayerRecord("Shriya", 16, 76000);
        players[4] = new PlayerRecord("Sanjana", 21, 83000);
        System.out.println("Players details:"+"\n");
        for (int i = 0; i < players.length; i++)
        System.out.println(players[i]);
        int max = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getSalary() > players[max].getSalary())
                max = i;
        }
        System.out.println("Highest Paid Player : " + players[max].getName());
    }
}






// Single Inheritance Question 

import java.util.Scanner;
class StudentInfo {
    int RegNo;
    String StuName;
    void input() {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Registration Number: ");
        RegNo = sc.nextInt();  
        sc.nextLine(); 
        System.out.print("Name: ");
        StuName = sc.nextLine();
        
    }
}
class Student extends StudentInfo {
    void display() {
        System.out.println("Student Registration Number is: "+RegNo+"\n");
        System.out.println("Student Name is: "+StuName);
    }
    public static void main(String args[]) {
        Student obj = new Student();
        obj.input();
        obj.display();
    }
}









// 15 Faculty Question 

class Department {
    private String Dept, HOD;
    private int Students, Sections;
    public Department(String Dept, String HOD, int students, int sections) {
        this.Dept = Dept;
        this.HOD = HOD;
        this.Students = Students;
        this.Sections = Sections;
    }
    public void showDepartmentDetails() {
        System.out.println("Department Name: " + Dept + "\n");
        System.out.println("HOD Name: " + HOD + "\n");
        System.out.println("Total Students: " + Students + "\n");
        System.out.println("No of sections: " + Sections + "\n");
    }
}
interface Publication {
    public void setJournalcount(int journalcount);
    public void setProjectcount(int projectcount);
    public void setPatterncount(int patterncount);
}
class StaffMember extends Department implements Publication{
    private String name, id, qualification, designation;
    private int experience;
    int journalcount, projectcount, patterncount;
    public StaffMember(String Dept, String HOD, int Students, int Sections, String name, String id, String qualification, String designation, int experience, int journalcount, int projectcount, int patterncount) {
        super(Dept, HOD, Students, Sections);
        this.name = name;
        this.id = id;
        this.qualification = qualification;
        this.designation = designation;
        this.experience = experience;
        setJournalcount(journalcount);
        setProjectcount(projectcount);
        setPatterncount(patterncount);
    }
    public void showStaffDetails() {
        showDepartmentDetails();
        System.out.println("Staff Name: " + name + "\n");
        System.out.println("Staff id: " + id + "\n");
        System.out.println("Qualification: " + qualification + "\n");
        System.out.println("Designation: " + designation + "\n");
        System.out.println("Experience: " + experience + "\n");
        System.out.println("Journalcount: " + journalcount + "\n");
        System.out.println("Projectcount: " + projectcount + "\n");
        System.out.println("Patterncount " + patterncount + "\n");
    }
    public void setJournalcount(int journalcount) {
        this.journalcount = journalcount;
    }
    public void setProjectcount(int projectcount) {
        this.projectcount = projectcount;
    }
    public void setPatterncount(int patterncount) {
        this.patterncount = patterncount;
    }
}
class Inheritance {
    public static void main(String[] args) {
        StaffMember s = new StaffMember("CSE", "John Doe Sr", 20, 5, "Mr. James", "21E567", "Ph.D. in Computer Science", "Assistant Professor", 10, 16, 15, 13);
        s.showStaffDetails();
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









/*Get two string inputs Object Orientedand Programming lab from user. 
Then find the length of  those  two  inputs. 
Further  do  perform  concatenation  and  comparison.  
Finally  apply  at  least  5 more java string methods for the inputs.*/

// 1st

import java.util.Scanner;
class StringDemo{
    public static void main(String[] args){
        String str1, str2;
        Scanner sc=new Scanner(System.in);
        System.out.println("The two strings are :  ");
        str1=sc.next();
        str2=sc.next();
        System.out.println("Length of the 1st string :  "+str1.length());
        System.out.println("Length of the 2nd string :  "+str2.length());
        System.out.println("Concatenation of the two strings :  "+(str1+str2));
        if(str1.compareTo(str2)==0){
            System.out.println("\n"+"Both the strings are equal.");
        }
        else{
            System.out.println("\n"+"Both the strings are not equal.");
        }
    }
}

//2nd

import java.util.Scanner;
class StringDemo{
    public static void main(String[] args){
        String str1, str2;
        Scanner sc=new Scanner(System.in);
        System.out.println("The two strings are :  ");
        str1=sc.next();
        str2=sc.next();

        System.out.println("The 1st string in lowercase: "+str1.toLowerCase()+"\n");
        System.out.println("The 2nd string in uppercase: "+str2.toUpperCase()+"\n");
        System.out.println("The specific character at index 1 in the first string: "+str1.charAt(1)+"\n");
        System.out.println("The index of 'a' in the second string if present: "+str1.indexOf('a'));
        System.out.println("\n"+"Are both strings equal: "+str1.equals(str2)+"\n");
        System.out.println("\n"+"Are both strings equal by ingnoring the cases: "+str1.equalsIgnoreCase(str2)+"\n");
    }
}





/*Create  a  class  named Poem that  contains  fields  for  the  name  of  the  poem  and  the  number  of lines in it. 
Include a constructor that requires values for both fields. Also include get methods to retrieve  field  values.  
Create  three  subclasses: Couplet,  Limerick,  and  Haiku. 
The  constructor for each subclass requires only a title; the lines field is set using a constant value.
A couplet has two  lines,  a  limerick  has  five  lines,  and  a  haiku  has  three  lines.  
Create  an  application  that demonstrates  usage  of  an  objectof  each  type. 
Save  the  files  as  Poem.java,  Couplet.java, Limerick.java, Haiku.java, and DemoPoems.java.*/



import java.util.*;
class Poem {
    private String title;
    private int lines;
    public Poem(String title,int lines){
        this.title= title;
        this.lines= lines;
    }
    public String getTitle() {
        return title;
    }
    public int getLines() {
        return lines;
    }
}

class Couplet extends Poem{
    private static final int LINES=2;
    public Couplet(String title){
        super(title,LINES);
    }
}
class Limerick extends Poem{
    private static final int LINES=5;
    public Limerick(String title){
        super(title,LINES);
    }
}
class Haiku extends Poem {
    private static final int LINES=3;
    public Haiku(String title){
        super(title,LINES);
    }
}
class DemoPoems{
    public static void main(String[] args){
        Poem poem1 = new Poem("The Road not Taken",20);
        Couplet poem2 = new Couplet("The Crooning Bee");
        Limerick poem3 = new Limerick("Footprints in the Sand");
        Haiku poem4 = new Haiku("The Old Pond");
        display(poem1);
        display(poem2);
        display(poem3);
        display(poem4);
    }
    public static void display(Poem p){
        System.out.println("\n"+"Poem: " + p.getTitle() +"\n"+
                "No. of Lines: " + p.getLines()+"\n");
    }
}






//Write a java application for performing addition, subtraction and multiplication of complex numbers. Try to get input from the user side.

import java.io.*;
import java.util.*;
class Complex{
    public int real, imaginary;
    public Complex(int a, int b){
        real = a;
        imaginary = b;
    }
}
class Main{
    public static void addition(Complex c1, Complex c2) {
        int result_a = c1.real + c2.real;
        int result_b = c1.imaginary + c2.imaginary;
        if(result_b > 0){
            System.out.println("Addition : " + result_a + " + " + result_b + "i");
        }
        else{
            System.out.println("Addition : " + result_a + " - "+(result_b * - 1) + "i ");
        }
}
public static void subtraction(Complex c1, Complex c2) {
    int result_a = c1.real - c2.real;
    int result_b = c1.imaginary - c2.imaginary;
    if(result_b>0){
        System.out.println("Subtraction : " + result_a + " + " + result_b+"i" );
    }
    else{
        System.out.println("Subtraction : " + result_a + " - "+(result_b * - 1) + "i ");
    }
}
public static void multiplication(Complex c1, Complex c2){
    int result_a = ((c1.real * c2.real) - (c1.imaginary * c2.imaginary));
    int result_b = ((c1.real*c2.imaginary) + (c1.imaginary * c2.real));
    if(result_b>0){
        System.out.println("Multiplication : " + result_a + " + " + result_b + "i");
    }
    else{
        System.out.println("Multiplication : " + result_a + " - "+(result_b * - 1) + "i ");
    }
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a1, b1, a2, b2;
    
    System.out.print("Enter Real Part of Complex Number 1 : ");
   a1 = sc.nextInt();
   System.out.print("Enter Imaginary Part of Complex Number 1 : ");
   b1 = sc.nextInt();
   System.out.print("Enter Real Part of Complex Number 2 : ");
   a2 = sc.nextInt();
   System.out.print("Enter Imaginary Part of Complex Number 2 : ");
   b2 = sc.nextInt();
   
   Complex c1 = new Complex(a1, b1);
   Complex c2 = new Complex(a2, b2);
   
   addition(c1,c2);
   subtraction(c1,c2);
   multiplication(c1,c2);
}
}
