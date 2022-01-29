import java.util.*;
public class Test1{
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       String s1 = sc.nextLine();
       String s2 = "[ :,'@!_-]";
       String[] s3=s1.split(s2);
       System.out.println(s3.length);
       for(String t:s3){
           System.out.println(t);
       }
       sc.close();
   }
}