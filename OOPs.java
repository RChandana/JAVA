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

// Exceptions 

// Try-Catch Exception Example
class Exception{
    public static void main(String args[]){
        int a, b;
        try{
            b = 0;
            a = 10 / b;
            System.out.println("This will not be printed.");
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero.");
        }
        System.out.println("After catch statement.");
    }
}

// Multiple Catches
// When a = 0
class MultipleCatches{
    public static void main(String args[]){
        try{
            int a = args.length;
            System.out.println("a = " + a);
            int b = 20 / a;
            int c[] = {2};
            c[10] = 50;
        }
        catch(ArithmeticException e){
            System.out.println("Exception : " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception : " + e);
        }
        System.out.println("After try-catch blocks.");
    }
}

// When a is any other number other than 0.
class MultipleCatches{
    public static void main(String args[]){
        try{
            int a = 1;
            System.out.println("a = " + a);
            int b = 20 / a;
            int c[] = {2};
            c[10] = 50;
        }
        catch(ArithmeticException e){
            System.out.println("Exception : " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception : " + e);
        }
        System.out.println("After try-catch blocks.");
    }
}

// Executing both the exceptions using two try-catch exceptions.
class MultipleCatches{
    public static void main(String args[]){
        try{
            int a = args.length;
            System.out.println("a = " + a);
            int b = 20 / a;
        }
        catch(ArithmeticException e){
            System.out.println("Exception : " + e);
        }
        try{
           int c[] = { 1, 6, 3 };
           c[20] = 50; 
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception : " + e);
        }
        System.out.println("After try-catch blocks.");
    }
}

// Another try-catch exception within a catch.
class MultipleCatches{
    public static void main(String args[]){
        try{
            int a = args.length;
            System.out.println("a = " + a);
            int b = 20 / a;
        }
        catch(ArithmeticException e){
            System.out.println("Exception : " + e);
            try{
                int c[] = { 1, 6, 3 };
                c[20] = 50; 
            }
            catch(ArrayIndexOutOfBoundsException x){
                System.out.println("Exception : " + x);
            }
        }
        System.out.println("After try-catch blocks.");
    }
}

// Another try-catch exception within a Nested Try Statement
class MultipleCatches{
    public static void main(String args[]){
        try{
            try{
                int a = args.length;
            System.out.println("a = " + a);
            int b = 20 / a;
        }
        catch(ArithmeticException e){
            System.out.println("Exception : " + e);
        }
        int c[] = { 1, 6, 3 };
        c[20] = 50; 
        }
        catch(ArrayIndexOutOfBoundsException x){
            System.out.println("Exception : " + x);
        }
        System.out.println("After try-catch blocks.");
    }
}


// Nested Try Statements
class NestedTry{
    public static void main(String args[]){
        try{
            int a = 0;
            int b = 20 / a;
            System.out.println("a = " + a);
            try{
                if(a == 1){
                    a = a / (a - a);
                }
                if(a == 2){
                    int c[] = {1,3};
                    c[10] = 50;
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception : " + e);
            }
        }
        catch(ArithmeticException m){
            System.out.println("Exception : " + m);
        }
    }
}

// Throw Exception Example
class Throw{
    static void demo(){
        try{
            throw new NullPointerException("Null");
        }
        catch(NullPointerException e){
            System.out.println("Exception Caught");
            throw e;
        }
    }
    public static void main(String args[]){
        try{
            demo();
        }
        catch(NullPointerException e){
            System.out.println("Recaught : " + e);
        }
    }
}







// The Main Thread
class CurrentThreadDemo{
    public static void main(String args[]){
        Thread t =Thread.currentThread();
        System.out.println("Current Thread : " + t);
        t.setName("My Thread");
        System.out.println("After name change : " + t);
        try{
            for(int n = 5; n > 0; n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
    }
}



// Thread creating
class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread : " + t);
        t.start();
    }
    public void run(){
        try{
            for(int i = 5; i > 0; i--){
                System.out.println("Child Thread : " + i);
                Thread.sleep(500);
            }
            catch(TnterruptedException e){
                System.out.println("Child Thread interrupted");
            }
            System.out.println("Existing Child Thread");
        }
    }
}
class ThreadDemo{
        public static void main(String args[]){
            new Thread();
            try{
                for (int i = 5; i > 0; i--){
                    System.out.println("Main Thread : " + i);
                    Thread.sleep(1000);
                }
            }
            catch(InterruptedException e){
                System.out.println("Main thread interrupted");
            }
            System.out.println("Main Thread existing");
        }
}



//
public class TestInterruptingThread4 extends Thread{
    public void run(){
        for(int i=1;i<=2;i++){
            if(Thread.interrupted()){
                System.out.println("code for interrupted thread");
            }
            else{
                System.out.println("code for normal thread");
            }
        }
    }
    public static void main(String args[]){
        TestInterruptingThread4 t1=new TestInterruptingThread4(); 
        TestInterruptingThread4 t2=new TestInterruptingThread4(); 
        t1.start();
        t1.interrupt(); 
        t2.start();
    }
}



//
class SetPriority{
	public static void main(String[] args){
		System.out.println("Before setting Priority of Main thread is " +
			Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(6);
		System.out.println(" After setting Priority of Main thread is " +
			Thread.currentThread().getPriority());
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
class GenDemo{
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








//
