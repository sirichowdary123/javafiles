import java.util.*;
public class Exception4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        try{
            String s1 = null;
            System.out.println(s1.length());
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        finally{
           System.out.println("finally block is executed");
           sc.close();
    }
        }
        
}
