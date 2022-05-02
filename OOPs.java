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
	
	
	
// Garbage Collection 

public class TestGarbage1{
    public void finalize(){
        System.out.println("object is garbage collected");
    } 
    public static void main(String args[]){
        TestGarbage1 s1=new TestGarbage1(); 
        TestGarbage1 s2=new TestGarbage1(); 
        s1=null;
        s2=null;
        System.gc(); 
    }
}





// Generics

class Gen<T>{
    T ob;
    Gen(T o){
        ob = o;
    }
    T getob(){
        return ob;
    }
    vois showType(){
        System.out.println("The type of T is " + ob.getClass().getName());
    }
}
Class GenDemo{
    public static viod main(Sting args[]){
        Gen<Integer> iob;
        iob = new Gen<Integer>(54);
        iob.showType();
        int a = iob.getob();
        System.out.println("Value : " + a);
        System.out.println();
        Gen<String> strob;
        strob = new Gen<String>("Chandana");
        strob.showType();
        String name = strob.getob();
        System.out.println("Name : " + name);
        System.out.println();
    }
}
