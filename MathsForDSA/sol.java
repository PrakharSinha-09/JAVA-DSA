class sol {
    public static int sqrtt(int n)
    {
        double ans=sqrt(n, 1);
        int ans1=(int)ans;
        return ans1+1;
    }
    public static double sqrt(int n,int p)
    {
        int start=0;
        int end=n;
        double root=0.0;
        while(start<=end)
        {
            int mid=end+(start-end)/2;
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
        int n=2147395600;
        // int p=1;           //precision value(means upto how many decimal places we need the answer)
        System.out.print(sqrtt(n));             //for 3 decimal places
    }
}
