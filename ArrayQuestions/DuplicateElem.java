/*
AGENDA: Return true if there is duplicate element present otherwise return false.
*/
import java.util.Arrays;

public class DuplicateElem {

    static boolean duplic(int []nums)
    {
        //By this approach we will get the desired answer in O(nlogn)
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])                     
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []nums={2,3,2,1,4};
        System.out.println(duplic(nums));
    }
}
