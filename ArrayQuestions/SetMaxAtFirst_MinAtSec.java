/*
AGENDA: To set the maximum element at first and minimum element at second position
*/

import java.util.*;
public class SetMaxAtFirst_MinAtSec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the array");
        size=sc.nextInt();
        int []arr=new int[size];

        System.out.println("Insert elements inside array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("the array");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int temp,temp1;
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-1-i;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        // System.out.println("Descending order");
        // for(int i=0;i<size;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        for(int i=0;i<size-1;i++)
        {
            for(int j=1;j<size-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp1=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp1;
                }
            }
        }

        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
