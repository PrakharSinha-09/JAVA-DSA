/*
AGENDA: Here We are interested in swapping adjacent elments of an array.
for example arr=[1,2,3,4,5,6]
expected output=[2,1,4,3,6,5]
*/
import java.util.Arrays;
public class SwapAdjacentElements {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,7,8};
        for(int i=0;i<arr.length-1;i+=2)
        {
            //if(i+1<arr.length)             //if i reached n-1...how will it go on i+1 as i itself is the last index...it would lead to index out of bound exception
            //{
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            //}
        }

        System.out.println(Arrays.toString(arr));
    }
}
