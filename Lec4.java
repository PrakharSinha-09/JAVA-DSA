/*
AGENDA: To Study Different Loops in java
->for loop
->while loop
->do while loop
*/

import java.util.*;
class Lec4{
    public static void main(String[] args){
        //for loop
        int i;
        for(i=0;i<5;i++)               //if we don't give any condition , it will become an infinite loop.
        {
            System.out.println(i+ " Hello World");
        }

        //while loop
        i=0;
        while(i<5)
        {
            System.out.println(i);
            i++;
        }

        //do-while loop
        i=0;
        do{
            System.out.println("Hey Prakhar");
            i++;
        }
        while(i<5);                      //remember this semi colon.

        //Q- Print the sum of n natural Numbers...Take n as input from the user.
        Scanner sc=new Scanner(System.in);
        int sum=0,n;
        System.out.println("Enter The No. upto where you are intersted to get the sum");
        n=sc.nextInt();
        
        for(int j=0;j<=n;j++)
        {
            sum=sum+j;
        }
        System.out.println(sum);
    
        for(; ;)                                            //this will result in infinite loop
        {
            System.out.println("Hey There");
        }
    }
}