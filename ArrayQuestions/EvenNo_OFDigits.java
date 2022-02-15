
/*
LEETCODE Problem Statement 1295
AGENDA: Given An array nums of an integer, return how many of them contain an even numbeer of digits.
*/
public class EvenNo_OFDigits {
    public static int findNumbers(int []nums)
    {
        int n,i,count,totalNumbers=0;
        for(i=0;i<nums.length;i++)
        {
            count=0;
            // if(nums[i]<0)
            // {
            //     nums[i]=nums[i]*-1;
            // }
            while(nums[i]>0)
            {
                nums[i]=nums[i]/10;
                count++;
            }
            if(nums[i]<0)
            {
                continue;                //or make that number positive, if you wish to count it
            }
            if(isEven(count))
            {
                totalNumbers++;
            }
        }
        return totalNumbers;
    }

    // static int digit(int num)
    // {
    //     return (int)(Math.log10(num)) + 1;              //remember this formula to get the number of digits in the number...this is optimal way
    // }
    static boolean isEven(int num)
    {
        return num%2==0;               //if the number is divisible by 2 , it will return true
    }

    public static void main(String[] args) {
        int[] arr={12,345,2,6,423,7256,-13};
        int numb;
        numb=findNumbers(arr);
        System.out.println(numb);
    }
}
