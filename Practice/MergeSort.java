import java.util.Arrays;

public class MergeSort {
    static int [] mergeSort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }

        int mid=arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] first,int[] second)
    {
        int i=0;
        int j=0;
        int k=0;
        int []ary=new int[first.length+second.length];

        while(i<first.length && j<second.length)
        {
            if(first[i]<second[j])
            {
                ary[k]=first[i];
                i++;
            }
            else
            {
                ary[k]=second[j];
                j++;
            }
            k++;
        }

        while(i<first.length)
        {
            ary[k]=first[i];
            i++;
            k++;
        }

        while(j<second.length)
        {
            ary[k]=second[j];
            j++;
            k++;
        }

        return ary;
    }
    public static void main(String[] args) {
        int[] arr={2,4,21,4,8,9,10};
        System.out.println(Arrays.toString(mergeSort(arr)));
        //System.out.println();
    }
}