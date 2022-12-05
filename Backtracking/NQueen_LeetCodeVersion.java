import java.util.*;


public class NQueen_LeetCodeVersion {
    static int queens(int n)
    {
        List<List<String>> res=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }

        solve(0,board,res);
        return res.size();
    }

    static void solve(int col,char[][] board,List<List<String>> res)
    {
        if(col==board.length)
        {
            res.add(construct(board));
            return;
        }
        for(int row=0;row<board.length;row++)
        {
            if(isSafe(col,row,board))
            {
                board[row][col]='Q';
                solve(col+1,board,res);
                board[row][col]='.';
            }
        }
    }

    static boolean isSafe(int col,int row,char[][] board)
    {
        int tempRow=row;
        int tempCol=col;

        while(row>=0 && col>=0)
        {
            if(board[row][col]=='Q')
            {
                return false;
            }
            row--;
            col--;
        }

        row=tempRow;
        col=tempCol;

        while(col>=0)
        {
            if(board[row][col]=='Q')
            {
                return false;
            }
            col--;
        }

        row=tempRow;
        col=tempCol;
        while(col>=0 && row<board.length)
        {
            if(board[row][col]=='Q')
            {
                return false;
            }
            row++;
            col--;
        }

        return true;
    }

    static List<String> construct(char[][] board)
    {
        List<String> lis=new ArrayList<>();
        for(int i=0;i<board.length;i++)
        {
            String s=new String(board[i]);
            lis.add(s);
        }

        return lis;
    }
    public static void main(String[] args) {
        int ans=queens(4);
        System.out.println(ans);
    }
}
