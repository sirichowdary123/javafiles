import java.util.*;
public class ReverseWord {
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       String original = sc.nextLine();
       String revstr = "";
       char ch;
       for(int i=0;i<original.length();i++) {
           ch=original.charAt(i);
           revstr = ch+revstr;   
       }
       System.out.println("reverse String is:"+revstr);
    }
}