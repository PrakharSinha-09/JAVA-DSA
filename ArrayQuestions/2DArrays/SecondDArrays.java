
import java.util.*;
public class SecondDArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr=new int[3][3];
        
        /*
        internal allocation of 2d arrays...every index is itself a array(remember)
        {
            {1,2,3},             //0th index
            {4,5,6},             //1st index
            {7,8,9}             //2nd index
        }
        */

        //input
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                arr[row][col]=sc.nextInt();
            }
        }
        System.out.println();

        //output

        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        

        //Alternate Way to print the elements of array using toString() method
        for(int row=0;row<arr.length;row++)
        {
            System.out.println(Arrays.toString(arr[row]));
        }

        //using for-each loop

        for(int []a: arr)                                 //just see what is the data type of every single element in 2d array...yes ofcourse every element is an array itself here.
        {
            System.out.println(Arrays.toString(a));
        }

        int [][] ar ={
            {1,2,3},             //0th index
            {4,5},             //1st index
            {7,8,9,10}
        };

        for(int row=0;row<ar.length;row++)
        {
            for(int col=0;col<ar[row].length;col++)                //hence we conclude that no. of columns can be variable for each individual array....hence we did col<arr[row].length
            {
                System.out.print(ar[row][col]+" ");
            }
            System.out.println();
        }

    }
}
