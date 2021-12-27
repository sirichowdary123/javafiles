import java.util.*;
import java.io.*;
public class Datatypes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            try{
                  long X =sc.nextLong();{
                  System.out.println("Can be Fitted in:"+X);
                  if(X>=-128 && X<=127)
                  System.out.println("* byte");
                  if(X>=-2147483648 && X<=2147483647)
                  System.out.println("* int");
                  if(X>=-32768 && X<=3278)
                  System.out.println("* short");
                  }
                  System.out.println("* long");
                 

                  
            }
            catch(Exception e){
                System.out.println(sc.next()+"can't be fitted anywhere");
            }
        }
    }

    
}
