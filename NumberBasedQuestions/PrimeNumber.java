/*
exercise 
AGENDA 1: to check whether the number entered by the user is prime or not.
AGENDA 2: to print prime number in the given range.
*/

import java.util.*;
class PrimeNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //AGENDA 1
        int n,factor=0;
        System.out.println("Enter The Number you want to check whether it is prime or not");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                factor++;
            }
        }
        if(factor==2)
        {
            System.out.println(n + " is Prime no.");
        }

        else
        {
            System.out.println(n + " is not a Prime no.");
        }

        //AGENDA 2
        int a,b,count;
        System.out.println("Enter The range of Numbers in which you are interested to see prime numbers");
        a=sc.nextInt();
        b=sc.nextInt();

        for(int j=a;j<=b;j++)
        {
            count=0;
            for(int k=1;k<=j;k++)
            {
                if(j%k==0)
                {
                    count++;
                }
            }
            
            if(count==2)
            {
                System.out.print(j + " ");
            }
            else
            {
                System.out.println("No Prime No b/w the given range");
                break;
            }
        }
    }
}