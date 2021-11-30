import java.util.*;
import java.util.Scanner;
public class IntString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        if( n>=-100 && n<=100){
            if(s.equals(Integer.toString(n))){
                System.out.println("Good Job");
            }
        }
        
        else
        System.out.println("Wrong Answer!");
    }


}
