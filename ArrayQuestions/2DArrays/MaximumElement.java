/*
AGENDA: To get the maximum element in 2d Array.
*/

public class MaximumElement {
    public static void main(String[] args) {
        int [][]arr={
            {1,3,54,6},
            {3,5,8},
            {9,8}
        };
        int max;
        max=Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]>max)
                {
                    max=arr[row][col];
                }
            }
        }
        System.out.println("Maximum Element is "+ max);
    }
}
