import javax.print.attribute.standard.NumberUpSupported;

public class Intersection {
    public static void main(String[] args) {
        int nums1[]={1,2,2,1};
        int nums2[]={2,2};
        int nums3[];
        int k=0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {   
                if(nums1[i]==nums2[j])
                {
                    for(k=0;k<nums3.length;k++)
                    {
                        if(nums1[i]!=nums3[k])
                        {
                            nums3[k]=nums1[i];
                        }
                        k++;
                    }
                }
            }
        }
        for(int i=0;i<=k;i++)
        {
            System.out.print(nums3[i]+" ");
        }
    }    
}
