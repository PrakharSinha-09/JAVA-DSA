import java.util.Arrays;

/*
AGENDA: To Concatenate the Array of that Array elements....
*/
public class Concatenation {
    static int[] concat(int []arr)
    {
        int size=arr.length;
        int size1=arr.length*2;
        int []ary=new int[size1];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            ary[j]=arr[i];
            j++;
        }
        int k=j;

        for(int i=0;i<arr.length;i++)
        {
            ary[k]=arr[i];
            k++;
        }
        return ary;                            //now question might arise why this retuurned array is not countered with new keyword...because we have already declare the array...so we are directly returning it.

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,7,9};
        System.out.println(Arrays.toString(concat(arr)));
        //concat(arr);
    }
}
