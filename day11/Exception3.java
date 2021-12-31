import java.util.*;
public class Exception3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
        int arr[] = new int[6];
        arr[10] = 30;
        
    }
    catch(Exception e){
        System.out.println(e);
    }
    finally{
      System.out.println("finally block is executed");
      sc.close();
    }
    

}
}
