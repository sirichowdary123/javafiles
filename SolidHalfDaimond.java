import java.util.Scanner;
import java.util.*;
public class SolidHalfDaimond{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i=1;i<N;i++){
            for(int j=1;j<=i;j++)
            System.out.print( "*");
            System.out.println(" ");
        }
        for(int i=1;i<M;i++){
            for (int j=M-1;j>=i;j--)
            System.out.print("*");
            System.out.println(" ");
        }
        
    }
}
