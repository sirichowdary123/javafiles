import java.util.Scanner;
import java.util.*;
public class SolidDaimond {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int M = sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=N-1;j>=i;j--){
            System.out.print(" ");
           
        }
        for(int k=1;k<=2*i-1;k++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
    for(int i=M;i>0;i--){
      for(int j=M-i;j>=0;j--){
          System.out.print(" ");
      }
      for(int k=1;k<=2*i-1;k++){
          System.out.print("*");
      }
      System.out.println("");
    }
}
}
