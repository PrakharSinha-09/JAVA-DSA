/*
AGENDA: To Delete The Duplicate elmement in an Array.
*/
import java.util.*;
public class DeleteDuplicateElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];

        System.out.println("Insert Elements Inside Array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        //Finding The Duplicate..
        //after comparing arr[i]==arr[j], print either arr[i] or arr[j]
        
        int index=0;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    index=j;                   //Getting The Postion(Index No.) Of Duplicate Element.
                    break;
                }
            }
        }

        size--;                                //Reduce The Size OF array by 1.
        for(int i=index;i<size;i++)
        {
            arr[i]=arr[i+1];
        }
        System.out.println();
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
