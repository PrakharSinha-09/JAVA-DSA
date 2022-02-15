/*
AGENDA: To Get The square root of a number using binary search
*/
public class BinarySearchSquareRoot {

    public static double sqrt(int n,int p)
    {
        int start=0;
        int end=n;
        double root=0.0;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(mid*mid==n)
            {
                root=mid;
                return root;
            }

            else if(mid*mid>n)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }

        double incr=0.1;
        for(int i=0;i<p;i++)
        {
            while(root*root<=n)
            {
                root+=incr; 
            }
            root-=incr;
            incr=incr/10;                  //so that it can get converted to 0.01 for second decimal place and with third iteration 0.001
        }
        return root;
        
    }
    public static void main(String[] args) {
        int n=40;
        int p=3;           //precision value(means upto how many decimal places we need the answer)
        System.out.printf("%.3f",sqrt(n, p));             //for 3 decimal places
    }
}
