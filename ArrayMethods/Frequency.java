import java.util.*;
public class Frequency{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        sc.close();
        int count;
        for(int i=0; i<s1.length();i++)
        {
            count=0;
            if(s1.charAt(i)!='\0')
            {   
                for(int j=i;j<s1.length();j++){
                    if(s1.charAt(i)==s1.charAt(j))
                    {
                        count++;
                        
                    }
                }
                System.out.println(s1.charAt(i)+" = "+count);
                s1=s1.replace(s1.charAt(i),'\0');
          
            }
        }
    }

}
 /* o/p:  
 h = 1
e = 1
l = 2
o = 1
  = 1
s = 1
i = 2
r = 1   */