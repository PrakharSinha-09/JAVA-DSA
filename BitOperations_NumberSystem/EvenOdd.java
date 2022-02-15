/*
AGENDA: To Determine if the given number is even or odd using bit operations
*/
import java.util.*;
public class EvenOdd{

    public static boolean isOdd(int n)
    {
        return (n&1)==1;                                 //will return true if this return statement evaluates to true(i.e. if n AND 1==1)
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter The Number To Check");
        num=sc.nextInt();
        System.out.println(isOdd(num));
    }
}