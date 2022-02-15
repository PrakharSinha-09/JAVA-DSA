/*
https://leetcode.com/problems/find-the-duplicate-number/
Amazon,Mcrosoft Ques: 287. Find the Duplicate Number
*/

public class FindingDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int i=0,index;
        while(i<nums.length)
        {
        //     if(nums[i]!=i+1)
        //     {
        //         index=nums[i]-1;
        //         if(nums[index]!=nums[i])
        //         {
        //             int temp=nums[index];
        //             nums[index]=nums[i];
        //             nums[i]=temp;
        //         }
        //         else
        //         {
        //             return nums[i];
        //         }
        //     }
        //     else
        //     {
        //         i++;
        //     }   
        // }
        //return -1;
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
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]!=j+1)
                {
                    return nums[j];
                }
            }
            return -1;                            //if no duplicates found.
    }
    public static void main(String[] args){
        int arr[]={1,3,3,2};
        System.out.println(findDuplicate(arr));
    }
}