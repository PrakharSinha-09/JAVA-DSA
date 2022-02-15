/*
AGENDA: Here We are trying to implement Binary Search using Recursion.
*/

public class recursiveBinarySearch {

    static int search(int []arr,int start,int end,int target)
    {
        if(start>end)
        {
            return -1;
        }

        int mid=start+(end-start)/2;            //we have to return mid, so it is taken as an integer as we have return type if int in functions

        if(arr[mid]>target)
        {
            return search(arr, start, mid-1, target);
        }

        else if(arr[mid]<target)
        {
            return search(arr, mid+1, end, target);
        }

        else if(arr[mid]==target)
        {
            return mid;
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8,9,10,11};
        System.out.println(search(arr, 0, arr.length-1, 11));
    }
}
