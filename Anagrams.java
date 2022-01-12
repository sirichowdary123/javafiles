import java.util.*;
public class Anagrams {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
       char a[] = s1.toCharArray();
       char b[] = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        Boolean Result = Arrays.equals(a,b);
        if(Result==true){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("not anagrams");
        }
        sc.close();

    }
}
