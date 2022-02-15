public class GCD_LCM {
    static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);              //Euclid Algorithm
    }

    static int lcm(int a,int b)
    {
        return a*b/gcd(a, b);
    }
    public static void main(String[] args) {
        System.out.println(gcd(9, 0));
        System.out.println(lcm(1, 7));
    }
    
}
