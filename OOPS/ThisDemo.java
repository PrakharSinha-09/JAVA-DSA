import InnerClasses.Test;

//this can be used as an argument to pass referece in the method call
/* 
public class ThisDemo {
    void m1(ThisDemo td)
    {
        System.out.println("i'm in m1 method");
    }

    void m2()
    {
        m1(this);
    }

    public static void main(String[] args) {
        ThisDemo td=new ThisDemo();
        td.m2()
    }
}
*/

//this can be used to pass an argument in the constructor call
/* 
class test{
    test(ThisDemo td)
    {
        System.out.println("test class constructor");
    }
}
public class ThisDemo {
    void m1()
    {
        test t=new test(this);
    }

    public static void main(String[] args) {
        ThisDemo td=new ThisDemo();
        td.m1();
    }
}
*/