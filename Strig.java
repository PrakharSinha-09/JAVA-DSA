import java.util.*;
public class Strig {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String ch;
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)==2)
        {   
            ch="Yes";
            System.out.println(ch);
        }
        else
        {
            ch="No";
            System.out.println(ch);
        }
        
        String h=A.substring(0,1);
        String h1=h.toUpperCase();
        String m=A.substring(1,A.length());
        String conc=h1+m;
        
        String h2=B.substring(0,1);
        String h3=h2.toUpperCase();
        String m1=B.substring(1,B.length());
        String conc1=h3+m1;
        
        System.out.println(conc+ " "+ conc1);
        
        
    }
}