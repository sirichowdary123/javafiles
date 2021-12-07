import java.util.*;
import java.io.*;
public class Strings4 {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     String A=sc.next();
     String B=sc.next();
     int length1 =A.length();
     int length2 =B.length();
     int X=length1+length2;
     System.out.println(X);
     if(length1>length2){
     System.out.println("no");
     }
     else{
         System.out.println("yes");
     }
     System.out.println(A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase()+"  "+
     B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase()+"  ");

     
    

    }
    
}
