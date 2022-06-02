  import java.util.*;
  public class MinimumMax{
         public static void findElement(int arr[],int N){
           int min=arr[0],max = arr[0];
            for(int i=1;i<N;i++){
              if(min>arr[i]){
                 min=arr[i];
                }
               if(max<arr[i]){
                 max=arr[i];
                }
           
            }
System.out.println("min:"+min+"\nmax:"+max);  
        } 
       public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int arr[] = new int[N];
        for(int i=0;i<N;i++){
          arr[i] = sc.nextInt();
         }
        sc.close();
        findElement(arr,N);
    }
}
/* o/p:
5
1 2 3 4 5
min:1
max:5 */