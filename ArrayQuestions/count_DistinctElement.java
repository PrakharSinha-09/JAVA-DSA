public class count_DistinctElement {
    public static void main(String[] args) {
        int arr[]={5,10,15,5,4,5,3};
        int count=1;
        for(int i=0;i<arr.length;i++)
        {
            int element=arr[i];
            for(int j=0;j<i;j++)
            {
                if(element != arr[j] && j==i-1)
                {
                    count++;
                }

                if(element==arr[j])
                {
                    break;
                }  
            }
        }
        System.out.println(count);
    }
}
