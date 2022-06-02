import java.util.*;
public class MissingElement {
        public static void  missing(int arr[],int N,int size){
                  int MissingElement=0;
                int sum=0,arraysum=0;
                sum=size*(size+1)/2;
                System.out.println("Total sum:"+sum);
                for(int i=0;i<N;i++){
                arraysum=arraysum+arr[i];
                }
                System.out.println("Array sum:"+arraysum);
               MissingElement=sum-arraysum;
                System.out.println("MissingElement:"+MissingElement);
            }
          
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            sc.close();
            missing(arr,N,size);
        }
}
/* o/p:
  6
5
1 3 4 5 6
Total sum:21
Array sum:19
MissingElement:2   */