import java.util.*;
public class Pattern10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i>2&&i!=n){
                System.out.print("1");
                for(int k=1;k<=i-2;k++){
                    System.out.print("  ");
                }
                System.out.print(i);
            }
            else{
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
            }
            System.out.println("");
        }
    }
}
