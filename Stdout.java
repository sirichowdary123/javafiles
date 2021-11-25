import java.util.Scanner;
import java.lang.*;
public class Stdout {
    public static void main(String[] args){  
    Scanner sc= new Scanner(System.in); 
        for(int i=0;i<3;i++){
        String  str = sc.nextLine();
       // int  P = sc.nextInt();
       String[] str1 = str.split(" ");
       int x=Integer.parseInt(str1[1]);
        if( x>=0 && x<=99){
            System.out.println(str1[0]+"   "+"0"+str1[1]);
        }
        else{
            System.out.println(str1[0]+"   "+str1[1]);
        }
           
        }
        
    }
    
    
}
