import java.util.*;
public class ArrayFreq {
        public static void frequency(int arr[],int N){
            boolean arr1[] = new boolean[N];
            Arrays.fill(arr1,false);
            for(int i=0;i<N;i++){
                   if(arr1[i]==true)
                   continue;
                   int count=1;
                   for(int j=i+1;j<N;j++){
                 if(arr[i]==arr[j]){
                     arr1[j]=true;
                     count++;
                 }
            }
            System.out.println("frequency of"+arr[i]+":"+count);
        }
    
    }
       public static void main(String args[]){
           Scanner sc = new Scanner(System.in);
           int N = sc.nextInt();
           int arr[] = new int[N];
           for(int i=0; i<N;i++){
               arr[i]=sc.nextInt();  
           }
           sc.close();
           frequency(arr,N);
       }

}
/* o/p:
   5
1 2 1 3 2
frequency of1:2
frequency of2:2
frequency of3:1    */
