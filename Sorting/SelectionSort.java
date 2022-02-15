import java.util.Arrays;

/*
AGENDA: to perform the selection sort
*/
public class SelectionSort {
    static void selection(int[] arr)
    {
        int max;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            //find max itemm in the remaining array and swap with the correct inndex
            int last=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swapArray(arr,maxIndex,last);
        }
        System.out.println(Arrays.toString(arr));
    }

    static int getMaxIndex(int[] arr,int start, int end)
    {
        int max=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[max]<arr[i])
            {
                max=i;
            }
        }
        return max;
    }

    static void swapArray(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int[] arr={2,5,0,7,2,4};
        selection(arr);
    }
}
