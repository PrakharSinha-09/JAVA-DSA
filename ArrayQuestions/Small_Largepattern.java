import java.util.Arrays;

/*
AGENDA: Conider an array given [1,2,3,4,5,6,7,8,9,10]
our output should be like [1,10,2,9,3,8,4,7,5,6]
*/
class Small_Largepattern{
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(arr);
        int []ary=new int[10];
        int last=arr.length-1;

        int j=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(j%2==0)
            {
                ary[j]=arr[i];
                j++;
            }
            else{
                ary[j]=arr[last];
                last--;
                if(j==arr.length-1)
                {
                    break;
                }   
                else
                {
                    j++;
                    ary[j]=arr[i];
                    j++;
                }
            }
        }

        System.out.println(Arrays.toString(ary));
    }
}