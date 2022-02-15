/*
AGENDA 1: Find the maximum & minimum number in an array of integers. 
AGENDA 2: Take an array of numbers as input and check if it is an array sorted in ascending order.
AGENDA 3: To perform Linear Search.
*/

import java.util.*;
class ArrayQues{
    public static void main(String[] args){
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        size=sc.nextInt();
        int arr[]=new int[size];
        
        System.out.println("Insert Elements in the array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Array:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println("");

        //AGENDA 1
        /*
        int max,min;
        max=arr[0];
        min=arr[0];
        for(int i=0;i<size;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            else if(min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Maximum Element = "+ max + " and minimum element in array is = "+ min);
        */

        //AGENDA 2
        /*
        boolean ascending=true;
        for(int i=0;i<size-1;i++)
        {
            if(arr[i]>arr[i+1])                       //Descending Condition
            {
                ascending=false;
            }
        }

        if(ascending==true)
        {
            System.out.println("Elements are sorted in ascending order");
        }

        else
        {
            System.out.println("Elements are not sorted in ascending order");
        }
        */

        //AGENDA 3
        /*
        int element;
        boolean isFound=false;
        System.out.println("Enter Element To Search in array");
        element=sc.nextInt();

        for(int i=0;i<size;i++)
        {
            if(arr[i]==element)
            {
                System.out.println("Element Found");
                isFound=true;
                break;
            }
        }

        if(!isFound)
        {
            System.out.println("Element Not Found");
        }
        */
    }
}