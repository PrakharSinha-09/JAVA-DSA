import java.util.Arrays;

public class selectionReursive {
    static void selection(int[] arr,int r,int c,int max)       //int max is basically the index
    {
        if(r==0)
        {
            return;
        }

        if(c<r)                                //this loop was for the current row...while doing it iteratively.
        {
            if(arr[c]>arr[max])
            {
                selection(arr, r, c+1, c);
            }
            else
            {
                selection(arr, r, c+1, max);
            }
        }
        else
        {
            int temp=arr[max];                   //as after each pass....the greatest element in the array will be bubbled to the last position..which implies we dont need to check upon it.
            arr[max]=arr[r-1];
            arr[r-1]=temp;

            selection(arr, r-1, 0, 0);
        }
    }
    public static void main(String[] args) {
        int []arr={2,31,5,1,0};
        selection(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    }
}
