import java.util.*;
 class BubbleSort {
     public static void printArray(int arr[]){
         int N = arr.length;
         for(int i=0; i<N; i++){
             System.out.print(arr[i]+" ");
         }
     }
     
     public static void bubbleSort(int arr[],int N){
        boolean swapped;
         for(int i=0;i<N-1;i++){
             swapped=false;
             for(int j=0;j<N-i-1;j++){
                 if(arr[j]>arr[j+1]){
                     int temp=arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                     swapped=true;
                 }
             }
             if(swapped==false){
                 break;
             }
         }
     }
     public static void main(String[] args){
         int arr[] ={1,3,4,12,5,62,2};
         int N = arr.length;
         System.out.println("Array before sorting:");
         printArray(arr);
         bubbleSort(arr,N);
         System.out.println("\nArray after sorting:");
         printArray(arr);
    
}
 }
 /* o/p:
 Array before sorting:
1 3 4 12 5 62 2 
Array after sorting:
1 2 3 4 5 12 62   */
