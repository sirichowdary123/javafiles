import java.util.*;
public class Pairs {
        public static void sumPairs(int arr[],int N,int K){
            boolean found = false;
              for(int i=0;i<N;i++){
                  for(int j=i+1;j<N;j++){
                      if(arr[i]+arr[j]==K){
                          System.out.println(arr[i]+","+arr[j]);
                          found=true;
                      }
                     
                    }
                }
                if(found==false){
                    System.out.println("No pair Exists");
                }
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int K = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0;i<N;i++){
                arr[i]= sc.nextInt();
            }
            sumPairs(arr,N,K);
        }
    }
/* o/p:
5
3
1 2 3 4 0
1,2
3,0 */

