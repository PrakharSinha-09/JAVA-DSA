/*
AGENDA: Find All duplicate no. in an array.
https://leetcode.com/problems/find-all-duplicates-in-an-array/
Problem 442. Find All Duplicates iN An Array.
*/
import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateNo {

    public static List<Integer> findDuplicates(int[] nums)
    {
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
        List<Integer> numbers = new ArrayList<>();
        for(j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                numbers.add(nums[j]);
            }
        }
        return numbers;
    }
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
}
