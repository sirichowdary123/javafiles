import java.util.*;
public class AdjacentHighest{
      public static void findHarithaElement(int arr[]){
      int N = arr.length;
      if(N==1){
      System.out.println(arr[0]);
     }
       else{
        for(int i=0;i<N;i++){
          if(i==0){
             if(arr[i]>arr[i+1]){
                System.out.print(arr[i]+" ");
             }
          }
           else if(i>0 && i<arr.length-1){
              if(arr[i]>arr[i+1] && arr[i] >arr[i-1]){
                System.out.print(arr[i]+" " );
              }
           }
          else if(i==arr.length-1){
             if(arr[i]>arr[i-1]){
                 System.out.println(arr[i]+" ");
            }
         }
       }
    }
}
       public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int totalElements= sc.nextInt();
       int arr[] = new int[totalElements];
          for(int i=0;i<totalElements;i++){
            arr[i] = sc.nextInt();
           }
         sc.close();
         findHarithaElement(arr);
      }
 }
 /*o/p:
 6
1 3 2 5 8 4
3 8  */
          