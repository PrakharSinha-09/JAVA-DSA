/*
AGENDA: TO return the sum of diagonal elements of a General matrix.
https://leetcode.com/problems/matrix-diagonal-sum/submissions/
Problem 1572: Matrix Diagonal Sum....
*/
public class SumOfDiagonalMatrix {
    public static int diagonalSum(int[][] mat) {
        int sum=0,sum1=0,sum2;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=i;j<mat[i].length;j++)
            {
                sum=sum+mat[i][j];
                break;
            }
            
            for(int j=mat.length-1-i;j>=0;j--)
            {
                if(i==j)
                {
                    break;
                }
                
                else
                {
                    sum1=sum1+mat[i][j];
                    break;
                }
            }
        }
        sum2=sum+sum1;
        return sum2;
    }
    public static void main(String[] args)
    {
        int [][]mat={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(diagonalSum(mat));
    }
}