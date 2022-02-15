public class N_Knights {
    static void knight(boolean[][] board,int row,int col,int knights)
    {
        if(knights==0)
        {
            display(board);
            System.out.println();
            return;
        }

        if(row==board.length-1 && col==board.length)
        {
            return;                                        //obviously if we are out of bound we cannot do anything so directly return from there.
        }
        if(col==board.length)                             //if this becomes true...try for the next line
        {
            knight(board,row+1,0,knights);              //so r+1    always we have to start from 0(obviously) for every single row...thats why c=0.
            return;
        }

        if(isSafe(board,row,col))
        {
            board[row][col]=true;
            knight(board,row,col+1,knights-1);          //check for next column
            board[row][col]=false;
        }

        //if its not safe...just move ahead     #obviously
        knight(board,row,col+1,knights);
    }

    static void display(boolean[][] board)
    {
        for(boolean[] row:board)
        {
            for(boolean element:row)
            {
                if(element==true)
                {
                    System.out.print("K ");
                }
                else
                {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    static boolean isSafe(boolean[][] board,int row,int col)
    {
        if(isValid(board,row-2,col-1))                  //checking whether this coordinate is running out of matrix or not
        {
            if(board[row-2][col-1])                      //if true...then check knight is already available there or not...if it is present return false
            {
                return false;
            }
        }

        if(isValid(board,row-1,col-2))
        {
            if(board[row-1][col-2])   
            {
                return false;
            }
        }

        if(isValid(board,row-2,col+1))
        {
            if(board[row-2][col+1])   
            {
                return false;
            }
        }

        if(isValid(board,row-1,col+2))
        {
            if(board[row-1][col+2])   
            {
                return false;
            }
        }
        return true;
    }


    //Checking for stuffs like we are not going out of bound
    static boolean isValid(boolean[][] board,int row,int col)
    {
        if(row>=0 && row<board.length && col>=0 && col<board.length)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n=4;
        boolean[][] board= new boolean[n][n];
        knight(board, 0,0,4);
    }
}
