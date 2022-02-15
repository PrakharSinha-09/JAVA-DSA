public class ProductOfDigits {
    static int prod(int n)
    {
        if(n%10==n)                     //if only one no. is present
        {
            return n;
        }
        return n%10 * prod(n/10);
    }
    public static void main(String[] args) {
        int ans=prod(1342);
        System.out.println(ans);
    }
}
