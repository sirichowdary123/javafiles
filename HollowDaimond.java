import java.util.Scanner;
import java.util.*;
public class HollowDaimond {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                
                System.out.print(" ");
                }
                for(int k=1;k<=2*i-1;k++){
                    if(k==1 || k==2*i-1){
                    System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                
            
            System.out.println(" ");
            }
            for(int i=N-1;i>=1;i--){
             for(int j=1;j<=N-i;j++){
                 System.out.print(" ");
             }
             for(int k=1;k<=2*i-1;k++){
                 if(k==1 || k==2*i-1){
                 System.out.print("*");}
                 else{
                     System.out.print(" ");
                 }
             }
             System.out.println(" ");
            }
        }
    }

