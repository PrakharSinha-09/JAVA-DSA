public class NewtonSQRT {
    static double sqrt(double n)
    {
        double x=n;                  //assumed square root
        double root;
        while(true)
        {
            root=0.5*(x+n/x);
            if(Math.abs(root-x)<0.5)                    //here we are providing the condition that only error is allowed of 0.5
            {
                break;
            }
            x=root;
        }
        return root;
    }
    public static void main(String[] args) {
        System.out.println(sqrt());
    }
    
}
