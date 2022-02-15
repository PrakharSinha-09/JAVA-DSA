import java.util.Arrays;

/*
AGENDA: To perform cyclic sort
*/

public class CyclicSort {
    static void Cycle(int[] arr)
    {
        int index,i=0;
        while(i<arr.length)
        {
            index=arr[i]-1;
            if(arr[index] != arr[i])
            {
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp; 
            }
            else
            {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        // for(int i=0;i<arr.length;i++)
        // {
        //     int value=arr[i];
        //     index=arr[i]-1;
        //     if(arr[index]==value+1)
        //     {
        //         continue;
        //     }
        //     else{
        //         int temp=arr[i];
        //         arr[i]=arr[index];
        //         arr[index]=temp;
        //     }
           
        // }
        // System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int []arr={3,5,2,1,4};
        Cycle(arr);
        
    }
    
}
