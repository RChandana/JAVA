// Java Program to merge text of two Text Files alternatively into a third Text File.

import java.io.*;
public class FileMerge{
    public static void main(String[] args) throws Exception{
        PrintWriter pw = new PrintWriter("OutputFile_Path.txt");
        BufferedReder br1 = new BufferedReader(new FileReder("file1_path.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("file2_path.txt"));
        String line1 = br1.readLine();
        String line2 = br2.readLine();
        
        while(line1 != null || line2 != null){
            if(line1 != null){
                pw.println(line1);
                line1 = br.readLine();
            }
            if(line2 != null){
                pw.println(line1);
                line2 = br.readLine();
            } 
        }
        pw.flush();
        br1.close();
        br2.close();
        pw.close();
        System.out.println("Merged");
    }
}
