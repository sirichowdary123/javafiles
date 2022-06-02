import java.util.*;
public class KthMaxMin {
      
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        TreeSet<Integer> ts = new TreeSet<Integer>();
        for(int i=0;i<N;i++){
            ts.add(sc.nextInt());
        }
        sc.close();
        System.out.println(ts);
    }
}
