public class CountZeroes {
    static int count=0;
    static int fun(int n)
    {
        int rem;
        if(n==0)
        {
            return 0;
        }
        rem=n%10;
        if(rem==0)
        {
            count++;
        }
        fun(n/10);
        return count;
    }
    public static void main(String[] args) {
        int ans=fun(100030);
        System.out.println(count);
    }
    
}
