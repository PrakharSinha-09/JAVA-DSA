/*
AGENDA: to conert elements inside array into string
*/

import java.util.*;

public class ArrayiNTOString {
    public static void main(String[] args) {
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

        //array elements in string
        System.out.println(Arrays.toString(arr));           //this is one of the other method to print the elements inside the array...without iteration. 

    }
    
}
