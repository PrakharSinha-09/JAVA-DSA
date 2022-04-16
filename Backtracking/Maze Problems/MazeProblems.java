import java.util.ArrayList;
import java.util.Arrays;

public class MazeProblems{

    static int countPath(int r,int c)
    {
        if(r==1 || c==1)                //while there is one path means r==1 or c==1 obviosly return 1 from there!
        {
            return 1;
        }

        int left=countPath(r-1, c);                         //answer by left recursion calls
        //int diagonal=countPath(r-1, c-1);                 //if allowing diagonal paths too...
        int right=countPath(r, c-1);                        //answer by right recursion calls

        return left+right;
    }

    //Now Lets Print. (when you are only allowed to move down and right)
    static void printPath(String p,int r,int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(p);
            return;
        }

        if(r>1)
        {
            printPath(p+"D", r-1, c);
        }

        if(c>1)
        {
            printPath(p+"R", r, c-1);
        }
        /*
        if(r==1 & c==1)
        {
            System.out.println(p);
            return;
        }
        //char ch=up.charAt(0);
        if(r>1 && c>1)
        {
            printPath(p+'D', r-1, c-1);
        }

        if(r>1)
        {
            printPath(p+'V', r-1, c);
            //printPath(p, r-1, c);
        }

        if(c>1)
        {
            printPath(p+'H', r, c-1);
            //printPath(p, r, c-1);
        }
        */
    }

     //Now Lets Return iN Array List
    static ArrayList<String> print(String p,int r,int c)
    {
        ArrayList<String> list=new ArrayList<>();
        if(r==1 & c==1)
        {
            list.add(p);
            return list;
        }
        //char ch=up.charAt(0);
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();

        if(r>1 && c>1)
        {
            list.addAll(print(p+'D', r-1, c-1));
        }
        if(r>1)
        {
            list1=print(p+'V', r-1, c);
            list.addAll(list1);
        }
        if(c>1)  
        {
            list2=print(p+'H', r, c-1);
            list.addAll(list2);
        }

        return list;
    }

    static void pathRestrictions(String p,boolean[][] maze,int r,int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);                                  //as once r&c becomes equal to maze.length-1 we cannot have further recursion calls
            return;
        }

        if(maze[r][c]==false)                         //as we found false we dont need our recursive function to be called...just move back from where you were called
        {
            return;
        }

        if(r<maze.length-1)
        {
            pathRestrictions(p+'D', maze, r+1, c);                         //this time (r+1) as we are starting from 0,0
        }

        if(c<maze[0].length-1)
        {
            pathRestrictions(p+'R', maze, r, c+1);                          //this time (c+1) as we are starting from 0,0
        }
    }

    static void allPath(String p,boolean[][] maze,int r,int c)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);                                  //as once r&c becomes equal to maze.length-1 we cannot have further recursion calls
            return;
        }

        if(maze[r][c]==false)                         //as we found false we dont need our recursive function to be called...just move back from where you were called
        {
            return;
        }

        //iF i'm considering this path means i've to mark this path as false
        maze[r][c]=false;
        if(r<maze.length-1)
        {
            allPath(p+'D', maze, r+1, c);                         //this time (r+1) as we are starting from 0,0
        }

        if(c<maze[0].length-1)
        {
            allPath(p+'R', maze, r, c+1);                          //this time (c+1) as we are starting from 0,0
        }

        if(r>0)
        {
            allPath(p+'U', maze, r-1, c);                          //U means upward
        }

        if(c>0)
        {
            allPath(p+'L', maze, r, c-1);                         //L means left
        }

        //this line is where the function will be over
        //so before the function gets removed , also remove the changes that were made by that function call
        maze[r][c]=true;
    }

    static void allPathPrint(String p,boolean[][] maze,int r,int c,int[][] path,int step)
    {
        path[r][c]=step;                                              //as last step is also a step
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            for(int[] arr: path)
            {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);                                  //as once r&c becomes equal to maze.length-1 we cannot have further recursion calls
            System.out.println();
            return;
        }

        if(maze[r][c]==false)                         //as we found false we dont need our recursive function to be called...just move back from where you were called
        {
            return;
        }

        //iF i'm considering this path means i've to mark this path as false
        maze[r][c]=false;
        if(r<maze.length-1)
        {
            allPathPrint(p+'D', maze, r+1, c,path,step+1);                         //this time (r+1) as we are starting from 0,0
        }

        if(c<maze[0].length-1)
        {
            allPathPrint(p+'R', maze, r, c+1,path,step+1);                          //this time (c+1) as we are starting from 0,0
        }

        if(r>0)
        {
            allPathPrint(p+'U', maze, r-1, c,path,step+1);                          //U means upward
        }

        if(c>0)
        {
            allPathPrint(p+'L', maze, r, c-1,path,step+1);                         //L means left
        }

        //this line is where the function will be over
        //so before the function gets removed , also remove the changes that were made by that function call
        maze[r][c]=true;
        path[r][c]=0;
    }
    public static void main(String[] args) {
        System.out.println(countPath(3, 3));    
        printPath("", 3, 3);      
        // System.out.println(print("", 3, 3));   

        // boolean[][] maze={
        //     {true,true,true},
        //     {true,false,true},
        //     {true,true,true}
        // };

        // boolean[][] maze1={
        //     {true,true,true},
        //     {true,true,true},
        //     {true,true,true}
        // };
        // //pathRestrictions("", maze, 0, 0);
        // //allPath("", maze1, 0, 0);

        // int[][] path=new int[maze.length][maze[0].length];
        // allPathPrint("", maze1, 0, 0, path, 1);
    }
}