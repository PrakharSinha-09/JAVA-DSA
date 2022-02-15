class Solution {
    public static int search(int[] nums,int start,int end,int target) {
        
        if(start>end)
        {
            return -1;
        }
        
        int mid=start+(end-start)/2;
        
        if(nums[mid]==target)
        {
            return mid;
        }
        if(nums[mid]>target)
        {
            return search(nums,start,mid-1,target);
        }
        else
        {
            return search(nums,mid+1,end,target);
        }
    }
    public static void main(String[] args)
    {
        int []nums={-1,0,3,5,9,12};
        int target=9;
        System.out.println(search(nums,0,nums.length-1,target));
    }
}