// https://leetcode.com/problems/richest-customer-wealth/            problem 1672
public class MaxWealth {
    public static int maximumWealth(int[][] accounts) 
    {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int person=0;person<accounts.length;person++) {
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for (int account=0;account<accounts[person].length;account++) {
                sum += accounts[person][account];
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [][]arr={
            {2,8,7},
            {7,1,3},
            {1,9,5}
        };
        System.out.println(maximumWealth(arr));
    }
    
}