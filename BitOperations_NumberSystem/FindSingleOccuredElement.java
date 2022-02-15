/*
AGENDA: given An array arr=[2,3,4,1,2,1,3,6,4]...every no. is present twice except one, find the number.
*/
public class FindSingleOccuredElement {

    public static int ans(int[] arr)
    {
        int unique=0;
        for(int i=0;i<arr.length;i++)
        {
            unique^=arr[i];                 //performing XOR operation with 0 will result into that value itself.
                                            //you might be wondering that order is not maintained then how it is working??...nothing to do with order.
        }
        return unique;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,3,2};
        System.out.println(ans(arr));
    }
}
