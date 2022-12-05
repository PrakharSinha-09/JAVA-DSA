class NthPower_OfNumber
{
    static int power(int x,int n)
    {
        if(n==1)
        {
            return x;
        }
        int ans=x*power(x, n-1);

        return ans;
    }
    public static void main(String[] args) {
        int ans=power(6, 2);
        System.out.println(ans);
    }
}