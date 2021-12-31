import java.util.*;
public class Exception5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        for(int i=0;i<s1.length();i++){
        System.out.println(s1.charAt(i));
        }
        
        try{
           System.out.println(s1.charAt(40));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally block is executed");
            sc.close();
        }
    }
}
