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


// Read the text from a file and write the same in another one.

import java.io.*;
import java.util.*;
class X{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide source file name : ");
        String file_1 = sc.next();
        
        FileReader fin = new FileReader(file_1);
        FileWriter fout = new FileWriter(file_2, true);
        int x;
        while((x = fin.read()) != -1){
            fout.write(x);
        }
        System.out.println("Done");
        fin.close();
        fout.close();
    }
}


// Reading a Text File into an ArrayList
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadTextFile{
    public static void main(String[] args){
        
    }
}
