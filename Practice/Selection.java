import java.util.Arrays;

public class Selection{
    static void selection(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int last=n-i-1;
            int maxInd=getMaxIndex(arr,0,last);
            swap(arr, maxInd, last);

        }
        System.out.println(Arrays.toString(arr));
    }

    static int getMaxIndex(int[]arr,int start,int end)
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

    static void swap(int arr[],int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int[] arr={3,2,1,5,7,9};
        selection(arr);
    }
}