public class Set_ith_Bit {
    public static void main(String[] args) {
        int n=10;
        int posi=0;                  //bit of this position will get set(1) if not.
        int mask=n|(1<<posi);
        System.out.println(mask);

        //lets reset
        int m=9;
        int post=0;
        int mask1=(1<<post);
        int newMask=~mask1;
        int newNo=m&newMask;
        System.out.println(newNo);

    }
}
