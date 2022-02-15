import java.util.Arrays;

public class BubbleSort_Recursive {
    static void bubble(int[] arr,int r,int c)          //try to relate this thing wit iterative approach there we used to take up two variables...so here also we are taking up two variables.
    {
        if(r==0)
        {
            return;
        }

        if(c<r)
        {
            if(arr[c]>arr[c+1])
            {
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr, r, c+1);
        }
        else
        {
            bubble(arr, r-1, 0);                   //as after each pass....the greatest element in the array will be bubbled to the last position..which implies we dont need to check upon it.
        }
    }
    public static void main(String[] args) {
        int []arr={2,31,5,1,0};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
}
