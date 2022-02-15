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
}

class smartphone extends phone
{
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
        phone ph=new smartphone();
        ph.on();
    }
}