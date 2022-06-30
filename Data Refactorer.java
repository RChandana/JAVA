import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DataRefactorer{
    public static void main(String args[]){
        BufferedReader br = null;
        BufferedWriter writer = null;
        try{
            br = new BufferedReader(new InputStreamReader(new FileInputStream("InputFilePath.dat")));
            writer = new BufferedWriter(new FileWriter("OutputFileName.csv"));
            List<Integer> droneIdList = Array.asList(565, 531, 275);
            
            int rowCount = 1;
            String line;
            while(null != (line = br.readLine())){
                if(line.trim().lenght() > 0){
                    line = line.replaceAll("Del B", "DelB");
                    line = line.replaceAll("FLD_\\[", "FLD[");
                    while(line.contains("[")){
                        line = line.replaceAll("\\[", "[");
                    }
                    int trackID = getTrackIdFromLine(line);
                    if(rowCount > 1){
                        line = line.replaceAll("Velocity", " ");
                        line = line.replaceAll("Acc", " ");
                        line = line.replaceAll("Wt", " ");
                        line = line.replaceAll("Speed", " ");
                        line = line.replaceAll("Str", " ");
                        line = line.replaceAll("N", " ");
                        line = line.replaceAll("FNo", " ");
                        line = line.replaceAll("DelA", " ");
                        line = line.replaceAll("DelB", " ");
                        line = line.replaceAll("SNR", " ");
                    }
                    while(line.contains(" ")){
                        line = line.replaceAll(" ", "");
                    }
                    while(line.contains("\t")){
                        line = line.replaceAll("\t", " ");
                    }
                    if(line.startsWith(" ")){
                        line = line.substring(1);
                    }
                    String[] tokens = line.split(" ");
                    
                    LinedList<String> tokenList = new LinkedList<>();
                    for(String token : tokens){
                        if(token.trim().length() > 0){
                            tokenList.add(token.trim());
                        }
                    }
                    for(int i = 0; i < tokenList.size(); i++){
                        String finalToken = tokenList.get(i);
                        writer.write(finalToken);
                       
                      /* Commenting the if condition because there will be droneFound = 1 or 0(in case of not_a_drone) suffixed after the comma as the last column
                        
                        if(i < tokenList.size() - 1){
                            writer.write(", ");
                        }*/
                    }
                    if(rowCount == 1){
                        writer.write("Drone Found");
                    } else{
                        String droneFound = droneList.contains(trackId) ? "1" : "0";
                        writer.write(droneFound);
                    }
                    writer.newLine();
                    rowCount++;
                }
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                br.close();
                writer.close();
            }catch(IOExcption e){
                e.printStackTrace();
            }
        }
    }
}
