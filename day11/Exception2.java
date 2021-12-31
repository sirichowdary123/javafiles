import java.util.*;
public class Exception2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        try{
            int i = Integer.parseInt(s1);
        }
        catch(InputMismatchException e){
           System.out.println(e);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally block is executed");
            sc.close();
        }
        
    }
}