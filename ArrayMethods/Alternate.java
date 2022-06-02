import java.util.stream.*;
import java.util.*;
    public class Alternate{
         public static void main(String args[]){
            ArrayList<Integer> pE= new ArrayList<Integer>();
             ArrayList<Integer> nE= new ArrayList<Integer>();
            ArrayList<Integer> result= new ArrayList<Integer>();
           int arr[] = {23,-81,34,53,-6,-8,-23,65};
          IntStream.of(arr).filter(e-> e>=0).forEach(e -> pE.add(e));
          IntStream.of(arr).filter(e-> e <0).forEach(e -> nE.add(e));
          System.out.println(pE);
           System.out.println(nE);
        for(int i=0,j=0,k=0;i<arr.length;i++){
            if(i%2 !=0){
              result.add(pE.get(j));
               j++;
              }
              else{
                   result.add(nE.get(k));
                k++;
              }
          }
             System.out.println(result);
         }
}
/* o/p:
    [23, 34, 53, 65]
    [-81, -6, -8, -23]
    [-81, 23, -6, 34, -8, 53, -23, 65]   */