import java.util.*;
public class CommonElement {
           public static void commonElement(int arr1[],int arr2[],int arr3[],int N,int M,int H){
                  for(int i=0;i<N;i++){
                         for(int j=0;j<M;j++){
                                for(int k=0;k<H;k++){
                                       if(arr1[i]==arr2[j] && arr2[j]==arr3[k] && arr1[i]==arr3[k]){
                                          System.out.println(arr1[i]);
                                }
                         }
                  }
                 
              }
           }
          public static void main(String args[]){
                 Scanner sc = new Scanner(System.in);
                 int N = sc.nextInt();
                 int M = sc.nextInt();
                 int H = sc.nextInt();
                 int arr1[] = new int[N];
                 int arr2[] = new int[M];
                 int arr3[] = new int[H];
                 for(int i=0;i<N;i++){
                        arr1[i]=sc.nextInt();
                 }
                 for(int j=0;j<M;j++){
                        arr2[j]=sc.nextInt();
                 }
                 for(int k=0;k<M;k++){
                        arr3[k] = sc.nextInt(); 
                 }
                 sc.close();
                 commonElement(arr1,arr2,arr3,N,M,H);
          }
}
/* o/p:
4
3
5
1 2 3 4
2 3 5
1 2 3 4 5
2
3  */
