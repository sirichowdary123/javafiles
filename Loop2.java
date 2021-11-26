import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Loop2{
    public static void main(String[] args){
        double temp;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            temp=0.0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for( int j=0;j<n;j++){
                 temp=temp+(Math.pow(2,j)*b);
                 System.out.print(a+(int)temp+"   ");
            }
           System.out.println();
        }
         
          sc.close();
    }   


}