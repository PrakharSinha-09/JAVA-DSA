/*
AGENDA 1: To check the number input by the user is perfect no. or not.
AGENDA 2: To check the perfect no. in the given range
*/

import java.util.*;
public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum;
        System.out.println("Enter a number");
        n=sc.nextInt();

        sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
        {
            System.out.println("Perfect Number");
        }

        else
        {
            System.out.println("Not A Perfect Number");
        }

        //AGENDA 2
        int num1,num2,j;
        System.out.println("Enter The first number");
        num1=sc.nextInt();

        System.out.println("Enter The first number");
        num2=sc.nextInt();

        for(int i=num1;i<=num2;i++)
        {   
            sum=0;
            for(j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    sum=sum+j;
                }
            }
            if(sum==i)
            {
                System.out.print(i+" ");
            }
        }  
    }
}
