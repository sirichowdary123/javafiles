import java.util.*;
public class Pattern8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=N;j>i;j--){
                System.out.print(" ");
            }
            for(int k=i;k<=2*i-1;k++){
             System.out.print(k);
            }
            if(i!=0){
                for(int m=2*i-2;m>=i;m--){
                    System.out.print(m);
                }
            }
            System.out.println("");
        }
    }
}
