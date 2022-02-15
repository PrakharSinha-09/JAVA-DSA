public class HappyNumber {

    public static int takeSquare(int num)
    {
        int sq=0;
        int x;
        while(num>0)
        {
            x=num%10;
            sq=sq+x*x;
            num=num/10;
        }
        return sq;
    }
    public static boolean isHappy(int n) {
        int slow=n;
        int fast=n;

        do{
            slow=takeSquare(slow);                         //slow k liye 1 time square find kro!
            fast=takeSquare(takeSquare(fast));             //fast k liye 2 times square find kro!

        }while(slow!=fast);

        if(slow==1)
        {
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println(isHappy(num));
    }
}
