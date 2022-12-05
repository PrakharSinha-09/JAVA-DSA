/*This will even work for negative values in powers */
/*Time Complexity - O(logN) & Space Complexity - (1)....Of Course! the Auxillary Space*/

public class Power {
    double power(double x,int n)
    {
        double temp;
        if(n==0)
        {
            return 1;
        }

        temp=power(x, n/2);

        if(n%2==0)
        {
            return temp*temp;
        }

        else
        {
            if(n>0)
            {
                return x*temp*temp;
            }

            else{
                return temp*temp*(1/x);
            }
        }
    }
    public static void main(String[] args) {
        Power num=new Power();
        System.out.println(num.power(2.000, 10));

    }
}
