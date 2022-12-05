class A{
    int i=1;
    public A(){
        System.out.println(getI());
        System.out.println(i+""+getI());
    }

    int getI()
    {
        return i;
    }
}

class B extends A{
    int i=2;
    
    public int getI(){
        return i;
    }
}
public class bestExample {
    public static void main(String[] args) {
        A a=new B();
        System.out.println(a.getI());

    }
}
