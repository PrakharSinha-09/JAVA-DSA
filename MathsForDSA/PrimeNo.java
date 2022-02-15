/*
AGENDA: To Check all the no upto the given no. is prime or not.
*/
public class PrimeNo{

    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;             //as no. <=1 is neither prime or composite.
        }
        int c=2;                     //start checking from 2
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
        int n=20;
        for(int i=1;i<=n;i++)
        {
            System.out.println(i+ " "+ isPrime(i));
        }
    }
}