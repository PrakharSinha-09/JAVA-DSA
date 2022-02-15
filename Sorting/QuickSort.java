import java.util.Arrays;

public class QuickSort {
    static void sort(int[] arr,int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];                        //taking mid as pivot element...as we have seen the advantage of taking mid as a pivot element.

        while(start<=end)
        {
            while(arr[start]<pivot)               //going good as this is something we need, but if condition become false we have to swap
            {
                start++;
            }
            while(arr[end]>pivot)                 //going good as this is something we need
            {
                end--;
            }

            if(start<=end)          //now you may ask since we already had while(start<=end), why we did if(start<=end) again... it is because maybe start++ in subwhile and end-- in subwhile may violate main while condition...hence putting the check again
                                    //also a reason why if its already sorted, it will not swap.
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }

        //now my pivot is at correct index , pllzzz sort two halves now 
        sort(arr, low, end);
        sort(arr, start, high);
    }
    public static void main(String[] args) {
        int nums[]={3,5,1,8,0,4};
        //Arrays.sort(nums);                       hybrid sorting 
        sort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
