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
	
	

	
	
	
	
	
	
	
	
	
// Player Record Problem

	
public class PlayerRecord {
    // private data members
    private String name;
    private int age;
    private double salary;

    // constructor to initialize data members
    public PlayerRecord(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }

    // getter method
    public String getName() {
        return name;
    }

    // setter method
    public void setAge(int age) {
        this.age = age;
    }

    // getter method
    public int getAge() {
        return age;
    }

    // setter method
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // getter method
    public double getSalary() {
        return salary;
    }

    // toString() method to display data members
    public String toString() {
        return "Name: " + name + "Age: " + age + "Salary: " + salary;
    }
}
