import java.lang.reflect.Array;
import java.util.Arrays;

class LeetCode1354 {
    public static void isPossible(int[] target) {
        Arrays.sort(target);
        int x=0;
        int arr[]=new int[target.length];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=1;
            x+=arr[i];
        }
        
        int k,sum=0;
        int y=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=x;
            // x+=arr[i];
            for(k=i+1;k<arr.length;k++)
            {
                sum+=arr[k];
            }
            y+=arr[i];
            x=y+sum;
            sum=0;
            
        }
        
        // if(Arrays.equals(target,arr))
        // {
        //     return true;
        // }
        // return false;
        System.out.println(Arrays.toString(target));
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={9,3,5};
        isPossible(arr);
    }
}