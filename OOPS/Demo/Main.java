class phone
{
    void on()
    {
        System.out.println("ON of super class");
    }

    void call()
    {
        System.out.println("call of super class");
    }

    phone()
    {
        System.out.println("Constructor of super Class");
    }

    @Override
    protected void finalize()
    {
        System.out.println("Refernce to this is destroyed");
    }
}

class smartphone extends phone
{
    smartphone()
    {
        System.out.println("Constructor of subClass");
    }
    void on()
    {
        
        System.out.println("ON of sub class");
    }

    void call()
    {
        System.out.println("call of sub class");
    }

    void gps()
    {
        System.out.println("gps");
    }
}

public class Main{
    public static void main(String[] args) {
        smartphone ph=new smartphone();
        ph.on();
        phone pho=new phone();
        
    }
}