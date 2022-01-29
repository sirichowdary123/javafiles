import java.util.*;
public class Test5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[][]= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j]=sc.nextInt();
            }
        }
        int primary=0,secondary=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i)
                primary=primary+A[i][j];
            }
        }
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==n-j-1){
                secondary=secondary+A[i][j];
            }
        }
        }
        int difference=secondary-primary;
        difference=Math.abs(difference);
        System.out.println(difference);
        sc.close();
    }
}
