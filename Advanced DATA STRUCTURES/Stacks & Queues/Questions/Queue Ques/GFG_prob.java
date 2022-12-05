import java.util.Deque;
import java.util.LinkedList;

// Sum of minimum and maximum elements of all subarrays of size k.

class GFG_prob{

    static int solve(int[] a,int n,int k)
    {
        Deque<Integer> maxi=new LinkedList<>();
        Deque<Integer> mini=new LinkedList<>();

        //Addition of first k size window
        int i=0;
        for(i=0;i<k;i++)
        {
            while(!maxi.isEmpty() && a[maxi.peekLast()]<=a[i])
            {
                maxi.removeLast();
            }
            while(!mini.isEmpty() && a[mini.peekLast()]>=a[i])
            {
                mini.removeLast();
            }

            //adding current element at the end of both the queue
            maxi.addLast(i);
            mini.addLast(i);
        }

        int ans=0;
        for(;i<n;i++)    //processing for rest of the windows
        {
            ans+=a[maxi.peekFirst()]+a[mini.peekFirst()];

            //next window now

            //removal
            while(!maxi.isEmpty() && i-maxi.peekFirst()>=k)
            {
                maxi.removeFirst();
            }
            while(!mini.isEmpty() && i-mini.peekFirst()>=k)
            {
                mini.removeFirst();
            }

            //addition
            while(!maxi.isEmpty() && a[maxi.peekLast()]<=a[i])
            {
                maxi.removeLast();
            }
            while(!mini.isEmpty() && a[mini.peekLast()]>=a[i])
            {
                mini.removeLast();
            }

            //adding current element at the end of both the queue
            maxi.addLast(i);
            mini.addLast(i);

        }

        //now considering the last window
        ans+=a[maxi.peekFirst()]+a[mini.peekFirst()];
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={2,5,-1,7,-3,-1,-2};
        int k=4;
        int ans=solve(arr,arr.length,k);
        System.out.println(ans);
    }
}