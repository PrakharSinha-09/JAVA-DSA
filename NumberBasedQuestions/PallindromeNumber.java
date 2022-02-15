/*
AGENDA 1: To check if a number given by the user is pallindrome number or not.
Pallindrome Number: if a number is equal to its reverse
*/

import java.util.*;

public class PallindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,x,rev=0;
        System.out.println("Enter a number you want to check whether it is pallindromee number or not");
        n=sc.nextInt();
        int temp=n;
        while(n!=0)
        {
            x=n%10;
            rev=rev*10+x;
            n=n/10;
        }
         System.out.println(rev);


        if(temp==rev)
        {
            System.out.println("Pallindrome Number");
        }
        else
        {
            System.out.println("Not Pallindrome Number");
        }
    }
}
