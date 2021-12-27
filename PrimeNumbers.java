import java.util.*;
import java.io.*;
public class PrimeNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        
        if(A==0)
        System.out.println("Not a primenumber");
        else{
            int count=0;
            for(int i=1;i<=A/2;i++){
                if(A%i==0)
                count++;
            }
        if(count==1)
            System.out.println("prime number");
         else
         System.out.println("not a primenumber");
        
        } 
    }        
}