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


//

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         int a;
	     Scanner sc = new Scanner(System.in);  
         System.out.println("Enter the number:"); 
         a = sc.nextInt();  {
             if  (a%2==1 || a==2) 
                 System.out.println("The given number is a prime number.");
             else System.out.println("The given number is not a prime number.");
             
         }
    }
}
