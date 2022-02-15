public class Sieve {
    public static void print(int n)
    {
        boolean[] primes=new boolean[n+1];
        for(int i=0;i<=n;i++)
        {
            primes[i]=true;
        }

        for(int i=2;i*i<=n;i++)
        {
            if(primes[i]==true)
            {
                for(int j=i*2;j<=n;j+=i)
                {
                    primes[j]=false;
                }
            }
        }

        for(int i=2;i<=n;i++)
        {
            if(primes[i]==true)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int n=50;
        print(n);

    }
}
