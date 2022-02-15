/*
AGENDA: To Do binary search in 2d array when the rows and columns are sorted.
*/
import java.util.Arrays;
public class RowColSortedBS {
    static int[] Search(int[][] arr,int target)
    {
        int r=0;
        int c=arr.length-1;
        int[] sry;

        while(r<arr.length && c>=0)
        {
            if(arr[r][c]==target)
            {
                return new int[]{r,c};
            }

            else if(arr[r][c]<target)
            {
                r++;
            }
            else if(arr[r][c]>target)
            {
                c--;
            }
        }
        return sry[]{-1,-1};                               //if not found.
    } 
   public static void main(String[] args) {
       int [][] arr={
           {10,20,30,40},
           {15,25,35,45},
           {28,29,37,49},
           {33,34,38,50}
       };
       int target=77;
       int[] posi=Search(arr, target);
       System.out.println(Arrays.toString(posi));
   } 
}
