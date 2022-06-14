// Creating a new File.

import java.io.File;
import java.io.IOException;
class HelloWorld {
    public static void main(String[] args) {
        try{
            File myObj = new File("File Path");
            if(myObj.createNewFile()){
                System.out.println("File Created : " + myObj.getName());
            }
            else{
                System.out.println("File already exists.");
            }
        } 
        catch(IOException e){
            System.out.println("Error");
        }
    }
}


//
