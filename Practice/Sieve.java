public class Sieve {
    static void sieve(boolean[] primes)
    {
        for(int i=0;i<primes.length;i++)
        {
            primes[i]=true;
        }

        for(int i=2;i*i<primes.length;i++)
        {
            if(primes[i]==true)
            {
                for(int j=i*2;j<primes.length;j+=i)
                {
                    primes[j]=false;
                }
            }
        }

        for(int i=2;i<primes.length;i++)
        {
            if(primes[i]==true)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int n=50;
        boolean[] arr=new boolean[n+1];
        sieve(arr);
    }
    
}
