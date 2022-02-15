import java.util.Arrays;

/*

*/
public class Set_Mismatch {
    public static int[] findErrorNums(int[] nums) {
        int i=0,index;
        while(i<nums.length)
        {
            index=nums[i]-1;
            if(nums[index]!=nums[i])
            {
                int temp=nums[index];
                nums[index]=nums[i];
                nums[i]=temp;
            }
            else
            {
                i++;
            }
        }
        int j;
        for(j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{-1,-1};
        
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,2,4};
        int[] ary=findErrorNums(arr);
        System.out.println(Arrays.toString(ary));
    }
}

  