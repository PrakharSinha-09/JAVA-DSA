public class N_Queens{
    static int no_OfWays(boolean[][] board,int row)
    {
        if(row==board.length)
        {
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        //placing the queen and checking for every row and column
        for(int col=0;col<board.length;col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col]=true;
                count+=no_OfWays(board, row+1);
                board[row][col]=false;                        //while coming back to the function revert thr changes u made...hence did this
            } 
        }
        return count;
    }

    static void display(boolean[][] board)
    {
        for(boolean[] row:board)
        {
            for(boolean element:row)
            {
                if(element==true)
                {
                    System.out.print("Q ");
                }
                else
                {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }


    static boolean isSafe(boolean board [][],int row,int col)
    {
        //check vertical row
        for(int i=0;i<row;i++)
        {
            if(board[i][col]==true)                         //means if queen is overthere, we cannot place queen overthere
            {
                return false;
            }
        }


        //diagonal left
        int maxLeft=Math.min(row,col);               //maximum time u can go left
        for(int i=1;i<=maxLeft;i++)
        {
            if(board[row-i][col-i])                 //if both rows and colmns are decreasing...NoProblem
            {
                return false;
            }                   
        }


        //diagonal right
        int maxRight=Math.min(row,board.length-col-1);
        for(int i=1;i<=maxRight;i++)
        {
            if(board[row-i][col+i])                 //if both rows and colmns are decreasing...NoProblem
            {
                return false;
            }                   
        }
        return true;
    }
    public static void main(String[] args) {
        int n=4;
        boolean[][] board= new boolean[n][n];
        System.out.println(no_OfWays(board, 0));
    }
}