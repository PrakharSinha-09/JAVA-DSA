import java.util.Arrays;

class reverse{

    void reverse1(int []arr)
    {
        reverseHelper(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));
    }

    void reverseHelper(int l,int r,int[] arr)
    {
        if(l==r)
        {
            return;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;

        reverseHelper(l+1,r-1,arr);
    }
}

public class ArrayReverse{
    public static void main(String[] args) {
        reverse rev=new reverse();
        int arr[]={3,4,2,6,8};
        
        rev.reverse1(arr);
    }
}