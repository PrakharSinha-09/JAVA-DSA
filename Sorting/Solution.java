public class Solution {
    public static int largestAltitude(int[] gain) {
        int[] gain1=new int[gain.length+1];
        gain1[0]=0;
        int i=0;
        int j=0;
        while(i<gain.length)
        {
            if(j==0)
            {
                gain1[j]=0;
            }
            else
            {
                gain1[j]=gain[i]+gain1[j-1];
                i++;
            }
            j++;
        }

        int max=gain1[0];
        
        for(int k=0;k<gain1.length;k++)
        {
            if(max<gain1[k])
            {
                max=gain1[k];
            }
        }
        return max;
        // for(int k=0;k<gain1.length;k++)
        // {
        //     System.out.println(gain1[k]);
        // }
    }
    public static void main(String[] args)
    {
        int[] gain={-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
        
    }
}