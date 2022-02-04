import java.util.*;
import java.io.*;
import java.util.regex.*;
public class Test1{
    public static void main(String args[]){
     final String REGEX_PATTERN = "[a-zA-Z]{4}\s[0-9]{10}";
     Pattern r = Pattern.compile(REGEX_PATTERN);
        
        
     try{
         FileReader fr = new FileReader("C:\\Users\\Krishna\\Desktop\\work\\java\\javafiles\\javafiles\\day 13\\data.txt");
         BufferedReader br = new BufferedReader(fr);
         String line;
         while((line = br.readLine()) != null){
             Matcher m = r.matcher(line);
             if(m.find()){
                 System.out.println(line);
             }
         }
         br.close();
     }
     catch(IOException e){
         System.out.println(e);
     }
    }
}