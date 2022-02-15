/*
AGENDA: to search for an element in 2D Array
*/

import java.util.*;
public class SearchingiNArray {
    static int[] search(int[][]arr, int target)
    {
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(target==arr[row][col])
                {
                    return new int[]{row,col};                  //as array is the object in java, we have to encounter it with new keyword
                }                                              //format is like mew int[]{row,col} because this array is not initialized, so jvm will
                                                               //not be able to figure out if it is actually an array or not and consequently will throw an error.
            }                                                  //also we are intereted to get the position of searched element in the form of an array.
        }
        return new int[]{-1,-1};                           //if not found.
    }
    public static void main(String[] args) {
        int [][]arr={
            {1,3,54,6},
            {3,5,8},
            {9,8}
        };
        int target=8;                                 //element to search
        int[] ary=search(arr, target);
        //System.out.println(Arrays.toString(ary));       this can also be used to get the location of target element.

        for(int i=0;i<ary.length;i++)
        {
            System.out.print(ary[i]+",");                //location of the targget element
        }
    }
    
}
