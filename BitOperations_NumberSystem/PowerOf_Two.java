public class PowerOf_Two {
    public static void main(String[] args) {
        int n=15; //fix for n=0                            //will return true if given no. is the power of 2.
        boolean ans;
        if(n==0)
        {
            ans=false;
        }
        else
        {
            ans=(n&(n-1))==0;
        } 
        System.out.println(ans);
    }
}
