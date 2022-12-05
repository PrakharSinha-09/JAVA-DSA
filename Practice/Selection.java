import java.util.Arrays;

public class Selection {
    static void sort(int[] arr)
    {
        
        for(int i=0;i<arr.length;i++)
        {
            int last=arr.length-i-1;
            int maxInd=max(arr, last);
            swap(arr,last,maxInd);;
        }   
    }

    static int max(int [] arr,int last)
    {
        int maxi=0;
        for(int i=1;i<=last;i++)
        {
            if(arr[i]>arr[maxi])
            {
                maxi=i;
            }
        }
        return maxi;
    }


    static void swap(int[] arr,int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,7,4,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
