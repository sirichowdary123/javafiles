import java.util.Scanner;
public class Condition {
    public static void main(String[] args){
       Scanner sc =new  Scanner(System.in);
        System.out.println("Enter the value of n=");
        int n=sc.nextInt(); 
        if(n%2==0){
         if(n>=6&&n<=20){
                System.out.println("Weird");
            }
             else{
                    System.out.println("Not Weird");
                
            }
        }
        else{
            System.out.println("weird");
        }
       
        
    }
    
}
