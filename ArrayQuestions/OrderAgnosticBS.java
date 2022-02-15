/*
AGENDA: If We dont know whether the array is srted in ascending order or decending order...we go with the Order Agnostic Biinary Search.
*/
import java.util.*;
public class OrderAgnosticBS {
    static int binarySearch(int[] arr, int target)
    {
        int start,end,mid,i;
        start=0;
        end=arr.length-1;
        i=start;

        boolean isAscend=arr[start]<arr[end];

        while(start<=end)
        {   
            mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if(isAscend)
            {
                if(arr[mid]>target)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }     
            }
            else
            {
                if(arr[mid]<target)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }     
            }
        }
        return -1;                  //if element not found                    //if array is not sorted...return -1 as the location of the desired element.

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={9,8,7,6,5,4,3,2,1,0};
        int elem;
        System.out.println("Enter Element You Want TO Search For");
        elem=sc.nextInt();
        System.out.println(binarySearch(arr, elem));  
    }
}
