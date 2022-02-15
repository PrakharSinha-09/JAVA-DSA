/*
AGENDA: To Delete elements in array A from Array B...and storing in some other Array C and printing that array.
*/
public class DeletingA_BArray{
    public static void deletion(int[] A,int[] B)
    {
        int []C=new int[10];
        int k=0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=i;j<B.length;j++)
            {
                C[k]=A[i]-B[j];
                k++;
                break;
            }
        }
        System.out.println();

        for(int i=0;i<k;i++)
        {
            System.out.print(C[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []A={4,2,7,8,1};
        int []B={2,1,4,6,0};
        deletion(A, B);
    }
}