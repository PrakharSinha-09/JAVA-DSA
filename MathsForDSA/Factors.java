import java.util.ArrayList;

public class Factors {
    /*
    static void factor2(int n)
    {
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                if(n%i==i)                       //this will ignore the duplicate roots
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(i+" "+(n/i)+" ");            //here we will get the factors but of the sequence like 
                }
            }
        }
    }
    */

    static void factor3(int n)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                if(n%i==i)                       //this will ignore the duplicate roots
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }

        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        int n=20;
        //factor2(n);                        //factor 2 function will not print the factors in sorted order...
        factor3(n);
        
    }
}
