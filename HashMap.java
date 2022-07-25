// Write a Java Program to diplay the Student Details from a text file in a HashMap and then store this information in an ArrayList.
/*HashMap<String, String> 
   Keys = Roll,
          Name, 
          Age,
          Marks,
          
    ArrayList<HashMap> 
    */

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;

public class StudentHashMap{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new File Reader("FilePath.txt"));
        StringBuffer sb = new StringBuffer();
        List<Map> studentArrayList = new ArrayList<>();
        String line;
        while((line = br.readLine()) != null){
            sb.append(line);
            sb.append("\n");
