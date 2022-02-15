import java.util.Arrays;

public class MergeSort {
    static int[] mergeSort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }

        int mid=arr.length/2;

        int[] left=mergeSort(Arrays.copyOfRange(arr,0, mid));              //left will contain 4,5 eventually        //this second argument of this function (mid) here is exclusive                                                                           
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));     //right will contain 1,2,3 eventually and finallly merge

        //at each step we are returning new array means we are creating new object @ every level
        //that means original array will not get sorted despite the value being the same but different objects...
        //this is why it is returning new array "int[] left" after sorting... same applies for int[] right
        //but what if we dont want to create the new object at every level..that we will see soon i.e., 
        //inplace mergesort.....doing this as this way is pretty starightforward and easy so doing this first.

        return merge(left,right);
    }

    static int[] merge(int[] first,int[] second)
    {
        int[] mix=new int[first.length+second.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<first.length && j<second.length)          //any of the condition got false loop will terminate.
        {
            if(first[i]<second[j])
            {
                mix[k]=first[i];
                i++;
            }
            else
            {
                mix[k]=second[j];
                j++;
            }
            k++;
        }

        //now it may be possible that one of the arrays is not complete.
        //copy the remaining elements.
        while(i<first.length)
        {
            mix[k]=first[i];
            i++;
            k++;
        }
                                                   //obviously any of the while loop willl get executed.
        while(j<second.length)
        {
            mix[k]=second[j];
            j++;
            k++;
        }

        return mix;
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
}
