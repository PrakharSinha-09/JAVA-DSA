/*
AGENDA: Lets study about 2-D arrays
*/

import java.util.*;
class Lec11{
    public static void main(String[] args){

        int x=100,count=0;
        int element;
        System.out.print(count);
        Scanner sc=new Scanner(System.in);
        int row,col;
        System.out.println("Enter The Size of 2D array you are interested to construct");
        System.out.println("Enter The No. of rows");
        row=sc.nextInt();
        System.out.println("Enter The No. of columns");
        col=sc.nextInt();
        int arr[][]=new int[row][col];

        System.out.println("Insert Elements in 2D Array");

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
            {   
                System.out.print("arr"+"["+i+"]"+ "["+j+"]= " );
                arr[i][j]=sc.nextInt();
            }
            System.out.println("");
        }
        //Printing the array.
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

        //searching for an element in 2d Array

        boolean isFound=false;
        System.out.println("Enter element to search");
        element=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
            {
                if(element==arr[i][j])
                {
                    System.out.print("Element Found @ " +"["+i+"]"+ "["+j+"]"+ "position");
                    isFound=true;
                    break;
                }
            }
        }
        if(!isFound)
        {
           System.out.print("element Not Found");
        }
    }
}