/*
AGENDA: To check whether the given no is armstromng or not.
*/

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,x,temp;
        System.out.println("Enter the no. to check");
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            x=n%10;
            sum=sum+(x*x*x);
            n=n/10;
        }

        if(sum==temp)
        {
            System.out.println("Armstrong no");
        }

        else
        {
            System.out.println("Not armstrong no");
        }
    }
}
