/*
Write a function that calculates the Greatest Common Divisor of 2 numbers.
*/
import java.util.*;
class HCF_GCD{

    static int gcdCal(int m,int n)
    {
        int i,gcd=1;
        for(i=1;i<=m && i<=n;i++)
        {
            if(m%i==0 && n%i==0)
            {
                gcd=i;
            }
        }
        return gcd;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,hcf;
        System.out.println("Enter Two Numbers To get their GCD");
        a=sc.nextInt();
        b=sc.nextInt();
        hcf=gcdCal(a,b);
        System.out.println("gcd= "+hcf);
    }
}