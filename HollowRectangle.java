import java.util.Scanner;
import java.util.*;
public class HollowRectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i=1;i<=N;i++){
         for(int j=1;j<=M;j++){
             if(i==1 || i==N || j==M || j==1){
                 System.out.print("*" + " ");
             }
             else{
                 System.out.print("  ");
                
             }
         }
         System.out.println("");
        }
        
    }
}
