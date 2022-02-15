/*
Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 

*/
import java.util.*;
class Fibonacci{
    public static void main(String[] args)
    {
        int n,a,b,c,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The No. of terms you want in fibonacci series");
        n=sc.nextInt();
        a=0;
        b=1;
        for(i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
