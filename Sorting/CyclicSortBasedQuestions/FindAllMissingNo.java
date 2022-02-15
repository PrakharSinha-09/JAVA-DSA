import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
Google Ques
*/
public class FindAllMissingNo {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        
        
        int i=0,index;
        while(i<nums.length)
        {
            index=nums[i]-1;
            if(nums[index] != nums[i])
            {
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
            }
            else
            {
                i++;
            }
        }
        int j;
        List<Integer> numbers = new ArrayList<>();
        for(j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                numbers.add(j+1);
            }
        }
        return numbers;
    }
    public static void main(String[] args)
    {
        int []arr={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
}
