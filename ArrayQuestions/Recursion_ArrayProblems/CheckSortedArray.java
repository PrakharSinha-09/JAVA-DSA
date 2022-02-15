/*
AGENDA: Trying to check if an array is sorted or not using recursion.
*/
public class CheckSortedArray{
    static boolean sorted(int[] arr,int index)
    {
        if(index==arr.length-1)
        {
            return true;                  //very obvious as if index reached the last position means the given array is sorted...yes we will be incrasing index              
        }
        return arr[index]<arr[index+1] && sorted(arr, index+1);
        
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        boolean check=sorted(arr, 0);
        System.out.println(check);
    }
}