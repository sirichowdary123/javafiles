import java.util.*;
public class Exception1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int A = sc.nextInt();
        int B = sc.nextInt();
        try{
           int result = A/B;
           System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
           try{
           String s3 = s1.concat(s2);
           System.out.println(s3);
        }
        
        finally{
       sc.close();
        } 
    }
}
