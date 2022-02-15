/*
AGENDA: To perform bubble sort
*/
public class BubbleSort{
    static void bubble(int[] arr)
    {
        boolean swapped;                             //took this so that if an array is sorted , the outer loop runs only time..hence to stop further iteration and save our time we did this
        int temp,n;
        n=arr.length;
        for(int i=0;i<=n-1;i++)
        {
            swapped=false;
            for(int j=1;j<=n-1-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={4,5,8,6,3,9};
        bubble(arr);
    }
}