/*
AGENDA: To Get a^b....through bits it will reduce the time complexity to logb via traditional method like 3^6=3*3*3*3*3*3 will give O(b) complexity....where b is the power
*/public class Power {
    public static void main(String[] args) {
        int base=2;
        int power=3;
        
        int ans=1;

        while(power>0)
        {
            if((power&1)==1)
            {
                ans*=base;
            }
            base*=base;
            power=power>>1;
        }
        System.out.println(ans);
    }
}
