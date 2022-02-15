import java.util.Arrays;

public class MergeSortiNplace {
    static void  mergeSort(int[] arr,int start,int end)
    {
        if(end-start==1)
        {
            return;
        }

        int mid=(start+end)/2 ;

        mergeSort(arr,start, mid);             
        mergeSort(arr,mid,end);     

        merge(arr,start,mid,end);
    }

    static void merge(int[] arr,int start,int mid,int end)
    {
        int[] mix=new int[end-start];

        int i=start;
        int j=mid;
        int k=0;

        while(i<mid && j<end)          //as i is going till mid only and similaly j is also going till end
        {
            if(arr[i]<arr[j])
            {
                mix[k]=arr[i];
                i++;
            }
            else
            {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        //now it may be possible that one of the arrays is not complete.
        //copy the remaining elements.
        while(i<mid)
        {
            mix[k]=arr[i];
            i++;
            k++;
        }
                                                   //obviously any of the while loop willl get executed.
        while(j<end)
        {
            mix[k]=arr[j];
            j++;
            k++;
        }

        for(int l=0;l<mix.length;l++)
        {
            arr[start+l]=mix[l];
        } 
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
