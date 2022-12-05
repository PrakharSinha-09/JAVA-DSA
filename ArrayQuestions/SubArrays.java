public class SubArrays {
    static void subarr(int[] arr)
    {
        for(int start=0;start<arr.length;start++)
        {
            for(int end=0;end<arr.length;end++)
            {
                for(int i=start;i<=end;i++)
                {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        subarr(arr);
    }
}
