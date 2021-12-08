import java.util.*;
import java.lang.*;
import java.io.*;
public class StringReverse {
       public static void main(String args[]){
           String original,reverse="";
           Scanner sc = new Scanner(System.in);
             original = sc.nextLine();
             int length=original.length();
             for(int i=length-1;i>=0;i--)
                 reverse=reverse+original.charAt(i);
                 if(original.equals(reverse))
                 System.out.println("palindrome");
                 else
                 System.out.println("Not palindrome");
             }
       }
        
    

