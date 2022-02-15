// /*
// AGENDA: To Reverse integer....leetcode problem 7
// https://leetcode.com/problems/reverse-integer/
// */public class Solution {
//     public static int reverse(int x) {
//         boolean isNegative = false;
//         if (x < 0) {
//             isNegative = true;
//             x = -x;
//         }
//         long reverse = 0;
//         while (x > 0) {
//             reverse = reverse * 10 + x % 10;
//             x /= 10;
//         }
//         if (reverse > Integer.MAX_VALUE) {
//             return 0;
//         }
//         return (int) (isNegative ? -reverse : reverse);
//     }
//     public static void main(String[] args)
//     {
//         System.out.println(reverse(-123));
//     }
// }

public class Solution {

	public static int sumOrProduct(int n, int q) {
        int sum=0;
        int x,y;
        int prod=1;
        if(q==1)
        {
            while(n!=0)
            {
                x=n%10;
            	sum=sum+x;
            	n=n/10;
            }  
            return sum;
        }
        
        else if(q==2)
        {
            while(n!=0)
            {
                y=n%10;
            	prod=prod*y;
            	n=n/10;
            }  
            return prod;
        }
		
        return 0;
		// Write your code here
	}
    public static void main(String[] args)
    {
        System.out.println(sumOrProduct(3, 1));
    }
}
