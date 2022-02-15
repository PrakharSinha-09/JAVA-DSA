import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        int rowStart=0;
        int colStart=0;
        int rowEnd=matrix.length-1;
        int colEnd=matrix[0].length-1;

        ArrayList<Integer> list=new ArrayList<>();
        
        while(rowStart<=rowEnd && colStart<=colEnd)
        {
            for(int col=colStart;col<=colEnd;col++)
            {
                // System.out.print(matrix[rowStart][col]);
                list.add(matrix[rowStart][col]);
            }
            rowStart++;
            
            for(int row=rowStart;row<=rowEnd;row++)
            {
                //System.out.print(matrix[row][colEnd]);
                list.add(matrix[row][colEnd]);
            } 
            colEnd--;
            
            for(int col=colEnd;col>=colStart;col--)
            {
                // System.out.print(matrix[rowEnd][col]);
                list.add(matrix[rowEnd][col]);
            }
            rowEnd--;
            
            for(int row=rowEnd; row>=rowStart; row--) 
            {
                //System.out.print(matrix[row][colStart]);
                list.add(matrix[row][colStart]);
            }
            colStart++;
        }
        return list;
    }
    public static void main(String[] args)
    {
        int[][] matrix={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        System.out.println(spiralOrder(matrix));   
    }
}