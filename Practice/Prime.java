public class Prime {
    public boolean isPrime(int n)
    {
        if(n<2)
        {
            return false;
        }

        int c=2;
        while(c<=Math.sqrt(n))
        {
            if(n%c==0)
            {
                return false;
            }
            c++;
        }
        return true;
    }
    public static void main(String[] args) {
        Prime pc=new Prime();
        int n=20;
        for(int i=2;i<n;i++)
        {
            System.out.println(i+" "+pc.isPrime(i));
        }
    }
}
