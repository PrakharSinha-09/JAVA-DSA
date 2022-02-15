
public class nTh_MagicNo {
    public static void main(String[] args) {
        int n=5;
        int ans=0;
        int base=5;
        while(n!=0)
        {
            int last=n&1;
            ans=ans+last*base;
            base=base*5;
            n=n>>1;
        }
        System.out.println(ans);

    }
}
