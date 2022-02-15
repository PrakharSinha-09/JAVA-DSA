/*
AGENDA: To Perform the Binary Search
Commit to Memory:
Binary Search Only Works with sorted array...if an unsorted array is provided, it will lead to something element not found.
*/

import java.util.*;
public class BinarySearch {
    static int binarySearch(int[] arr, int target)
    {
        int start,end,mid,i;
        start=0;
        end=arr.length-1;
        i=start;

        if(isSorted(arr))
        {
            while(start<=end)
            {   
                mid=start+(end-start)/2;
                if(arr[mid]>target)
                {
                    end=mid-1;
                }
                else if(arr[mid]<target)
                {
                    start=mid+1;
                }            
                else if(arr[mid]==target)
                {
                    return mid;
                }

            }
            return -1;                  //if element not found
        }
        return -1;                     //if array is not sorted...return -1 as the location of the desired element.
        
    }

    static boolean isSorted(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={4,5,6,7,8,9,11,18,19,45,78,80};
        int elem;
        System.out.println("Enter Element You Want TO Search For");
        elem=sc.nextInt();
        System.out.println(binarySearch(arr, elem));  
    }
}
