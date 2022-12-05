import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] nums3=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                nums3[k]=nums1[i];
                i++;
                k++;
            }
            else
            {
                nums3[k]=nums2[j];
                j++;
                k++;
            }
            // k++;
        }
        
        
        while(i<m)
        {
            nums3[k]=nums1[i];
            i++;
            k++;
        }
        
        while(j<n)
        {
            nums3[k]=nums2[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(nums3));
    }

    public static void main(String[] args)
    {
        int[] nums1={1,2,3};
        int m=3;
        int[] nums2={2,5,6};
        int n=3;

        merge(nums1, m, nums2, n);

    }
}