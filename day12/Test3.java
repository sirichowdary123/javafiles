import java.util.Scanner;
import java.util.*;
public class Test3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] X = new int[n];
    
        for(int i=0;i<n;i++){
            X[i]=sc.nextInt();
        }
        int negative=0;
        for(int i=0;i<n;i++){
          int sum=X[i];
          if(sum<0)
          negative++;
          for(int j=i+1;j<n;j++){
              sum+=X[j];
              if(sum<0)
              negative++;
          }
        }
        System.out.println(negative);
        sc.close();
         }
}
