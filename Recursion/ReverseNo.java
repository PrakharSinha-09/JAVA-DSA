public class ReverseNo {
    static int sum=0;
    static void rev1(int n)
    {
        
        if(n==0)
        {
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev1(n/10);
        //System.out.println(sum);               printing it here will print it no of times the function is getting called...as we know these callls will ireside in the stack until something is returned by the function and after execution gets finished...each of them will print their values
    }
    
    public static void main(String[] args) {
        rev1(123);
        System.out.println(sum);
    }
    
}
