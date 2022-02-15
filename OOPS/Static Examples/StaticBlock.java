public class StaticBlock {

    static int a=4;
    static int b;

    static                         //thus is static block, will only run once when the object is created i.e., when the class is loaded
    {  
        System.out.println("i'm inside static block, will run only once when the first time is class instantiated ");
        b=a*5;
    }
    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock.b+=3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock.b+=3;
        StaticBlock obj1=new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);



    }
}
