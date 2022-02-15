/*
1- Write a program to enter the numbers till the user wants and at the end,
it should display the count of positive, negative and zeros entered.
*/
 import java.util.*;
class PracticeSet1{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,countP=0,countN=0,countZ=0;
        int choice;
        
        while(true)
        {
            System.out.println("Press N To Exit & Y to continue");
            choice=sc.next().charAt(0);
            if(choice=='N')
            {
                break;
            }
            else if(choice=='Y')
            {
                System.out.println("Enter The Number");
                n=sc.nextInt();

                if(n>0)
                {
                    countP++;
                }

                else if(n<0)
                {
                    countN++;
                }

                else if(n==0)
                {
                    countZ++;
                }
            }  
        }
        System.out.println("Positives ="+ countP);
        System.out.println("Negatives ="+ countN);
        System.out.println("Zeroes ="+ countZ);
    }
}