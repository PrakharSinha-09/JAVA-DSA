import java.util.Arrays;

/*
AGENDA: To Perform Insertion Sort
*/
public class InsertionSort {
    static void Insertion(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)           //as j=i+1.. so if i reaches the last index, and j=i+1...that will consequently result in index ou of bound exception 
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swapArray(arr, j, j-1);
                }
                else
                {
                    break;                //when element j is not smaller than element j-1 break...very obvious reason as left sub array is already sorted. so no need to compare all the elements
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void swapArray(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int []arr={2,3,1,6,8,4};
        Insertion(arr);
    }
    
}
