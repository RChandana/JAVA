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






/* Create a class named College Course that includes data fields that hold
the department (for example, CSE), the course number (for example, 110), the credits (for example,4), and the fee for the course (for example, Rs 360).  
All of the fields are required as arguments to the constructor,  except  for  the  fee,  which  is  calculated  at  Rs 120  per  credit  hour.  
Include  a display()  method  that  displays  the  course  data. Create  a  subclass  named  LabCourse  that adds  $50  to  the  course  fee.  
Override the parent  class  display()  method  to  indicate  that  the course  is  a  lab  course  and  to  display  all  the  data. 
Write  an  application  named  UseCourse that  prompts  the  user  for  course  information. 
If  the  user  enters  a  class  in  any  of  the following departments,
create a LabCourse: CSE, ECE, CIVIL, or IT. If the user enters any other  department,  create  a  CollegeCourse  that  does  not  include  the  lab  fee.  
Then display the    course    data.    Save    the    files    as    CollegeCourse.java, LabCourse.java,    and UseCourse.java. */


import java.util.*;
class CollegeCourse {
    private String dept;
    private int id;
    private double credits;
    private double price;
    public CollegeCourse(String dept, int id, double credits) {
        super();
        this.dept = dept;
        this.id = id;
        this.credits = credits;
        price = 120;
    }
    void display() {
        System.out.println(dept + " - " + id + "\n" + "Non-lab Course " + credits +" credits"+ "\n" + " Total fee is Rs." + (price * credits));
    }

}
class LabCourse extends CollegeCourse {
    private String dept;
    private int id;
    private double credits;
    private double price;
    public LabCourse(String dept, int id, double credits) {
        super(dept, id, credits);
        this.dept = dept;
        this.id = id;
        this.credits = credits;
        price = 120;
    }
    void display() {
        System.out.println(dept + " - " + id + "\n" + "Lab Course " + credits + " credits" + "\n"  + "Lab fee = $50" + "\n" + "Total fee is Rs." + ((price * credits) + 50));
    }
}
class UseCourse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dept, inStr;
        String[] labCourses = { "CSE", "ECE", "CIVIL", "IT" };
        int id, credits;
        int found = 0;
        int x;
        System.out.println("Enter the Department : ");
        dept = input.nextLine();
        dept = dept.toUpperCase();
        System.out.println("Enter the id : ");
        id = input.nextInt();
        System.out.println("Enter the credits : ");
        credits = input.nextInt();
        for (x = 0; x < labCourses.length; x++) {
            if (dept.equals(labCourses[x])) {
                found = 1;
                inStr = labCourses[x];
                break;
            } 
            else{
                found = 0;
            }
        }
        if (found == 1) {
            LabCourse lab = new LabCourse(dept, id, credits);
            lab.display();
        } 
        else {
            CollegeCourse course = new CollegeCourse(dept, id, credits);
            course.display();
        }
    }
}








/* Create  a  class student  which  includes  parameters  roll_no,  name  and  address  and consider it as a super class. 
Then create a subclass test with parameters marl1, mark2, mark3 and mark4. 
Then  create  another  sub  class  result  with  parameters total_marks,  percentage  and  grade. Apply  multilevel  inheritance. 
Here  Student class  is the super  class  for  test class and  test class is super class of result class. 
Implement a java application in which you obtain the details roll_no,  name,  address,  mark1,  mark2,  mark3  and  mark4  
from the user  side  and then print total_marks, percentage and grade. Student test result */


import java.util.*;
class Student{
    private String rollno;
    private String name;
    private String address;
    public void storeDetails(String no, String Name, String add){
        rollno = no;
        name = Name;
        address = add;
    }
    public void showDetails(){
        System.out.println("Roll No : " + rollno);
        System.out.println("\n" + "Name : " + name);
        System.out.println("\n" +"Address : " + address);
    }
}
class Test extends Student{
    protected int marks_CSE;
    protected int marks_ECE;
    protected int marks_Maths;
    protected int marks_English;
    public void storeMarks(int ml, int m2, int m3, int m4){
        marks_CSE = ml;
        marks_ECE = m2;
        marks_Maths = m3;
        marks_English = m4;
    }
    public void showMarks(){
        System.out.println("Marks in CSE : " + marks_CSE);
        System.out.println("Marks in ECE : " + marks_ECE);
        System.out.println("Marks in Maths : " + marks_Maths);
        System.out.println("Marks in English : " + marks_English);
    }
}
class Result extends Test{
    private int totalMarks;
    private float percentage;
    private char grade;
    public void evaluateResult(){
        totalMarks = marks_CSE + marks_ECE + marks_Maths + marks_English;
        percentage = (totalMarks*100.00F/600.00F);
        if (percentage >= 50.00F)
        grade = 'D';
        else
        if(percentage >= 55.00F && percentage <= 60.00F)
        grade = 'C';
        else
        if (percentage >= 61.00F && percentage <= 70.00F)
        grade = 'B';
        else
        if (percentage >= 71.00F && percentage <= 75.00F)
        grade = 'A';
        else
        if (percentage >= 76.00F && percentage <= 85.00F)
        grade = 'H';
        else
        grade = 'S';
    }
    public void showResult(){
        showDetails();
        showMarks();
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("percentage : " + percentage);
        System.out.println("Grade : " + grade);
    }
}
class Multilevellnheritance{
    public static void main(String ar[]){
        Result ob = new Result();
        ob.storeDetails("21BCE8718", "Hari Chandana", "Amaravati");
        ob.storeMarks(99,78,88,92);
        ob.evaluateResult();
        ob.showResult();
    }
}









/* Create a  class in the  name of  ComputeInterest.  Use  scanner  class to  get  principal, rate and time as inputs  from the user  side. 
Compute  simple  interest  and compound  interest  by  using  respective formulas. Save the implemented java program as interest.java. */


import java.util.*;
class ComputeInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter the rate: ");
        double rate = input.nextDouble();

        System.out.print("Enter the time: ");
        double time = input.nextDouble();
        double simpleInterest = (principal * time * rate) / 100;

        System.out.println("Principal: " + principal);
        System.out.println("Interest Rate: " + rate);
        System.out.println("Time Duration: " + time);
        System.out.println("Simple Interest: " + simpleInterest);
        
        System.out.print("Enter number of times interest is compounded: ");
        int number = input.nextInt();

        double compoundInterest = principal * (Math.pow((1 + rate/100), (time * number))) - principal;

        System.out.println("Principal: " + principal);
        System.out.println("Interest Rate: " + rate);
        System.out.println("Time Duration: " + time);
        System.out.println("Number of times interest Compounded: " + number);
        System.out.println("Compound Interest: " + compoundInterest);

        input.close();
  }
}




/*Consider that, a lab in charge maintains lab instruments. PhD scholars help students. 
Professor conducts labs. Consider LabInCharge as an interface and PHDscholar as an abstract class.
LabInCharge has a method named install() and PHDscholar has a help() method respectively which are abstract in nature. 
However, PHDscholar has a concrete method named labsAssigned(). 
LabInCharge has attributes such as labName, roomNo, and PHDscholar has attributes like scholarName, labConducted. 
Professor class  has  a  concrete  method  named teaches(), and  fields  like subject  and  emp_id and define the above said abstract methods also.
HOD class is the main() containing class.
Write a java code  to display  the attributes  from  each  of the  classes and interface  creating  proper  instances and invoking the methods from the HOD class with proper implementation. */


public class HOD {
    public static void main(String[] args) {
        Prof p1 = new Prof("CSE",11);
        p1.teaches();
        p1.install();
        PHD_Scholar s1 = new Prof("Mr.Mahesh","LAB-234");
        s1.LabsAssigned();
        s1.help();
    }
}

interface LabInCharge{
    String LabName = "LAB-102";
    int Room_No = 201;
    public void install();
}
abstract class PHD_Scholar{  
    String ScholarName;
    String LabConducted;
    abstract void help(); 
    void LabsAssigned(){
        System.out.println(ScholarName + " is assigned to " + LabConducted + "." + "\n");
    }
}  
class Prof extends PHD_Scholar implements LabInCharge{
    String Subject;
    int Emp_ID;
    Prof(String Subject, int Emp_ID){
        this.Subject = Subject;
        this.Emp_ID = Emp_ID;
    }
    Prof(String ScholarName, String LabConducted){
        this.ScholarName = ScholarName;
        this.LabConducted = LabConducted;
    }
    public void install(){
        System.out.println("Instrument installed in " + LabName + " and the Room Number is " + Room_No + "\n");
    }
    void help(){
        System.out.println(ScholarName + " helps students during the Lab." + "\n");
    }
    void teaches(){
        System.out.println("Professor's Employee ID is " + Emp_ID + " and he/she teaches " + Subject + "." + "\n");
    }
}









/*Implement the following.

 a) Create  an  interface  named  Turner,  with  a  single  method  named  turn().
    Create  a  class named  Leaf  that  implements  turn()  to  display  Changing  colors.  
    Create  a  class  named Page  that  implements  turn( )  to  display  Going  to  the  next  page.  
    Create  a  class  named Pancake  that  implements  turn()  to  display  Flipping.  
    Write  an  application  named DemoTurners that creates one object of each of these class types and demonstrates the turn()  method  for  each  class.  
    Save  the  files  as  Turner.java,  Leaf.java,  Page.java, Pancake.java, and DemoTurners.java.


b) Think of two more objects that use turn(), create classes for them, and then add objects to the DemoTurners application, renaming it DemoTurners2. java. 
Save the files, using the names of new objects that use turn().


c) Apply  Dynamic  method  dispatch  to  show  the  power  of  it  and  name  the  class  as DemoTurners3.java.*/

import java.util.*;
import java.lang.*;
class demoTurner1 {
    public static void main (String [] args) {
        leaf leaf = new leaf();
        pancake pancake = new pancake();
        page page = new page();
        System.out.println("Demoturner1 Running >>>");
        leaf.turn();
        page.turn();
        pancake.turn();
    }
}
class demoTurner2 {
    public static void main (String [] args) {
        leaf leaf = new leaf();
        pancake pancake = new pancake();
        page page = new page();
        life life = new life();
        person person = new person();
        System.out.println("Demoturner2 Running >>>");
        leaf.turn();
        page.turn();
        pancake.turn();
        life.turn();
        person.turn();
    }
}
class demoTurner3 {
    public static void main (String [] args) {
        leaf leaf = new leaf();
        pancake pancake = new pancake();
        page page = new page();
        life life = new life();
        person person = new person();
        System.out.println("Demoturner3 Running >>>");
        turner ref;

        ref = leaf;
        ref.turn();

        ref = page;
        ref.turn();

        ref = pancake;
        ref.turn();

        ref = life;
        ref.turn();

        ref = person;
        ref.turn();
    }
}
class leaf implements turner {
    public void turn() {
        System.out.println("Message from leaf class - The leaf has turned yellow.");
    }
}
class life implements turner {
    public void turn() {
        System.out.println("Message from life class - My life has turned up side down.");
    }
}
class page implements turner {
    public void turn() {
        System.out.println("Message from page class - The page has been flipped to the next page.");
    }
}
class page implements turner {
    public void turn() {
        System.out.println("Message from page class - The page has been flipped to the next page.");
    }
}
class page implements turner {
    public void turn() {
        System.out.println("Message from page class - The page has been flipped to the next page.");
    }
}
class pancake implements turner {
    public void turn() {
        System.out.println("Message from pancake class - The pancke has been flipped.");
    }
}
class person implements turner {
    public void turn() {
        System.out.println("Message from person class - The wanted person has turned them in.");
    }
}
interface turner {
    public void turn();
}




/*Implement a java program to check whether the given number is odious or not. Follow the steps for implementing program.
Step1: Perform binary conversion for a given number.
Step 2: Count the number of one’s available.
Step 3: Check frequency either as odd or even
Step 4: Print result 

Note:  An  odious number  is  a  non-negative  number  that  has  an  odd  number  of  1’s  in  its binary representation. 
Example - 111 is the binary representation for number 7 which is an odious number too.*/



import java.util.*;
import java.lang.*;
class Odious {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The Decimal number is : ");
        int DecimalNumber = sc.nextInt();
        BinaryCheck checker = new BinaryCheck(DecimalNumber);
        checker.BinaryOdiusChecker();
    }
}
class BinaryCheck {
    int DecimalNumber;
    BinaryCheck (int DecimalNumber) {
        this.DecimalNumber = DecimalNumber;
    }
    void BinaryOdiusChecker() {
        int count = 0;
        ArrayList<String> Binary = new ArrayList<String>();
        String BinaryString = Integer.toBinaryString(DecimalNumber);

        for (int i = 0; i < BinaryString.length(); i++) {
            Binary.add(String.valueOf(BinaryString.charAt(i)));
        }
        for (String c : Binary) {
            if (c.equals("1")) {
                count++;
            }
        }
        count = count % 2;
        if (count == 0) {
            System.out.println("It's not a odious number");
        }
        else {
            System.out.println("It's a odious number");
        }
    }
}



// Develop Number Utilities package and provide following classes with supported functionalities: 
// Develop a NumberUtilTest class to test the Number Utilities package.
package com.arssoft.numbers.util;
import java.util.Scanner;  
import java.lang.Math;  
class Armstrong { 
    public static boolean armstrong(int n){ 
        int temp, digits=0, last=0, sum=0; 
        temp = n; 
        while(temp > 0){ 
            temp = temp/10; 
            digits++; 
        } 
        temp = n; 
        while(temp > 0){ 
            last = temp % 10; 
            sum += (Math.pow(last, digits));   
            temp = temp/10;
        }
        if(n==sum)   
        return true; 
        else return false;   
    } 
    public static void main(String args[]){     
        int num;
        Scanner sc= new Scanner(System.in);  
        System.out.print("The limit is : "); 
        num=sc.nextInt();  
        System.out.println("Armstrong Number up to "+ num + " are: ");
        for(int i=0; i<=num; i++) 
        if(isArmstrong(i))
        System.out.print(i+ ", ");
    }   
}
class Palindrome{ 
    public static void main(String args[]){  
            int n = 3553, reversedNum = 0, remainder;
            int originalNum = n;
            while (n != 0) {
                remainder = n % 10;
                reversedNum = reversedNum * 10 + remainder;
                n /= 10;
    }
    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
    }
        }
}
class Factorial{  
    public static void main(String args[]){  
        int i,fact=1;  
        int number=5;   
        for(i=1;i<=number;i++){    
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}





//             OR




package com.arssoft.numbers.util;

public class Armstrong {
public static boolean armstrong(int n){
int temp, digits=0, last=0, sum=0;
temp=n;
while(temp>0){
temp = temp/10;
digits++;
}
temp = n;
while(temp>0){
last = temp % 10;
sum += (Math.pow(last, digits));
temp = temp/10;
}
if(n==sum)
return true;
else
return false;
}

}
---------------------------------------
package com.arssoft.numbers.util;

public class Factorial {
  
public static int factorial(int n){
if (n == 0)
return 1;
else
return n*factorial(n-1);
}
  
}

-------------------------------------------

package com.arssoft.numbers.util;

public class Palindrome {
public static boolean palindrome(int n )
{
  
int sum=0,r,temp;
temp=n;
while(n!=0)
{
r=n%10;
sum=(sum*10)+r;
n/=10;  
}
  
if(temp==sum)
return true;
else
return false;
}
}
------------------------------------------
import com.arssoft.numbers.util.*;
import java.util.Scanner;

public class NumberUtilTest {
  
static int n, t, s;
static boolean flag;
  
  
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the value of n: ");
n=sc.nextInt();
  
  
System.out.println("The factorial of n is: " + Factorial.factorial(n));
  
System.out.print("Enter the value of n: ");
n=sc.nextInt();
  
flag = Armstrong.armstrong(n);
if(flag)
System.out.println("Armstrong Number");
else
System.out.println("Not Armstrong Number");
  
  
System.out.print("Enter the value of n: ");
n=sc.nextInt();
  
  
flag = Palindrome.palindrome(n);
if(flag)
System.out.println("The Number is Palindrome");
else
System.out.println("The Number is not Palindrome");
  
  
}
}



/*Develop  a  ScoreGradeTest  class  to  display  a  series  of  five  Student  ID  numbers and  asks  the  user  to  enter  a  numeric  test  scores  of  three  subjects and  a  grade. 
Develop  a  checked  ScoreExceptionclass  and  throw  it  when  the  user  enters  an invalid   score   (greater   than   100   and   less   than   0).  
Develop   a   checked GradeException  class  and  throw  it  when  the  user  enters  an  invalid  grade.  
(Other than A, B, C, D, F). Also throw GradeException if the user enters wrong grade for their   average   test   score.   
Differentiate   these   two   GradeException   types   with appropriate messages.

A -> >90
B -> >80 and <89
C -> >70 and <79
D -> >60 and <69
F -> >60




*/





import java.util.Scanner;
class ScoreException extends Exception {
    ScoreException(){ 
        System.out.println("Invalid score");
    }
}
class GradeException extends Exception{
    GradeException(String t){ 
        System.out.println(t);
    }
}
class ScoreGradeTest { 
    int reg_no; 
    int[] score=new int[3]; 
    char grade;
Scanner input=new Scanner(System.in);
ScoreGradeTest(int t){ 
    this.reg_no=t;
}
void set()throws ScoreException,GradeException{
    for (int i=0;i<3;i++){ 
        score[i]=input.nextInt(); 
        if (score[i]>100 || score[i]<0) throw new ScoreException();
    } 
    grade=input.next().charAt(0);
    if (grade=='A') {} 
    else if(grade=='B'){} 
    else if (grade=='C'){} 
    else if (grade=='D'){} 
    else if (grade=='F'){} 
    else {
        throw new GradeException("Invalid Grade"); 
    }
} 
int total;
void check_grade() throws GradeException{
    total=(score[0]+score[1]+score[2])/3; 
    char calc_grade='F'; 
    if (total>=90 && total<100){
        calc_grade='A';
    }
    else if (total>=80 && total<90){
            calc_grade='B';
    }
    else if (total>=70 && total<80){
        calc_grade='C';
    }
    else if (total>=60 && total<70){
        calc_grade='D';
    }
    else if (total<60){ 
        calc_grade='F';
    }
    if (calc_grade ==grade){
        System.out.println("entered data is successfully verified and saved");
    } 
    else
    throw new GradeException("Grade entered by user is wrong");
}
void display(){
    System.out.println("Student details: /n Student id : "+ reg_no);
    System.out.println(" Marks :"+score[0]+" "+score[1]+" "+score[2]);
    System.out.println("Grade : "+ grade);
}
public static void main(String[] args) {
    try{
        ScoreGradeTest stud1=new ScoreGradeTest(7638); 
        System.out.println("Enter student1 Details : "); 
        stud1.set(); 
        stud1.check_grade();
        stud1.display();
        
        ScoreGradeTest stud2=new ScoreGradeTest(7111); 
        System.out.println("Enter student2 Details : "); 
        stud2.set(); 
        stud2.check_grade();
        stud2.display();
        
        ScoreGradeTest stud3 =new ScoreGradeTest(7030);
        System.out.println("Enter student3 Details : "); 
        stud3.set(); 
        stud3.check_grade(); 
        stud3.display();
        
        ScoreGradeTest stud4 =new ScoreGradeTest(6111); 
        System.out.println("Enter student4 Details : "); 
        stud4.set(); 
        stud4.check_grade(); 
        stud4.display();
        
        ScoreGradeTest stud5 =new ScoreGradeTest(8617); 
        System.out.println("Enter student5 Details : "); 
        stud5.set();
        stud5.check_grade();
        stud5.display();
    }
    catch(Exception e){ 
        System.out.println(e);
    }
}
}





// Unchecked 

import java.util.Scanner; 
class ScoreException extends RuntimeException{
    ScoreException(){
        System.out.println("Invalid score");
    } 
}
class GradeException extends RuntimeException {
    GradeException(String t){
        System.out.println(t);
    }
}
class ScoreGradeTest { 
    int reg_no; 
    int[] score = new int[3]; 
    char grade;
    Scanner input = new Scanner(System.in);
    ScoreGradeTest(int t){ 
        this.reg_no=t;
    }
    void set()throws ScoreException,GradeException{
        for (int i=0;i<3;i++){
            score[i]=input.nextInt(); 
            if (score[i] > 100 || score[i] < 0) throw new ScoreException();
        } 
        grade=input.next().charAt(0);
        if (grade=='A') {} 
        else if(grade=='B'){} 
        else if (grade=='C'){} 
        else if (grade=='D'){} 
        else if (grade=='F'){} 
        else {
            throw new GradeException("Invalid Grade");
        }
}
int total;
void check_grade() throws GradeException{
    total=(score[0]+score[1]+score[2])/3; 
    char calc_grade='F'; 
    if (total>=90 && total<100){
        calc_grade='A';
    }
    else if (total>=80 && total<90){
            calc_grade='B';
    }
    else if (total>=70 && total<80){
        calc_grade='C';
    }
    else if (total>=60 && total<70){
        calc_grade='D';
    }
    else if (total<60){ 
        calc_grade='F';
    }
    if (calc_grade ==grade){
        System.out.println("entered data is successfully verified and saved");
    } 
    else
    throw new GradeException("Grade entered by user is wrong");
}
void display(){
    System.out.println("Student details: /n Student id : "+ reg_no);
    System.out.println(" Marks :"+score[0]+" "+score[1]+" "+score[2]);
    System.out.println("Grade : "+ grade);
}
public static void main(String[] args) {
    try{
        ScoreGradeTest stud1=new ScoreGradeTest(500); 
        System.out.println("Enter student1 Details : "); 
        stud1.set(); 
        stud1.check_grade();
        stud1.display();
        
        ScoreGradeTest stud2=new ScoreGradeTest(501); 
        System.out.println("Enter student2 Details : "); 
        stud2.set(); 
        stud2.check_grade();
        stud2.display();
        
        ScoreGradeTest stud3 =new ScoreGradeTest(502);
        System.out.println("Enter student3 Details : "); 
        stud3.set(); 
        stud3.check_grade(); 
        stud3.display();
        
        ScoreGradeTest stud4 =new ScoreGradeTest(503); 
        System.out.println("Enter student4 Details : "); 
        stud4.set(); 
        stud4.check_grade(); 
        stud4.display();
        
        ScoreGradeTest stud5 =new ScoreGradeTest(504); 
        System.out.println("Enter student5 Details : "); 
        stud5.set();
        stud5.check_grade();
        stud5.display();
    }
    catch(Exception e){ 
        System.out.println(e);
    }
}
}
