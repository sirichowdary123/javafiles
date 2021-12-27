import java.util.*;
import java.io.*;
public class SubString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
         int Start =sc.nextInt();
         int end = sc.nextInt();
         System.out.println(S1.substring(Start,end));
    }
}
