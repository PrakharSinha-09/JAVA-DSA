/*

*/
public class FirstMissingPositive{
    public static int firstMissingPositive(int[] nums) {
        int i=0,index;
        while(i<nums.length)
        {
            index=nums[i]-1;

            // if(nums[i]<0)
            // {
            //     continue;
            // }

            if(nums[i]>0 && nums[i]<nums.length && nums[index]!=nums[i])         //as we have to skip negatives so, nums[i]>0 should also be true
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
                return j+1;
            }
        }
        return nums.length+1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(firstMissingPositive(arr));
    }
}
