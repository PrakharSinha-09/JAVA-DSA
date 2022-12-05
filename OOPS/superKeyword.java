class phone{
    int price;
    phone()
    {
        // price=a;
        System.out.println(price);
    }

    void greet()
    {
        System.out.println("Hello There");
    }

    void example()
    {
        System.out.println("efsnfs");
    }
}
public class superKeyword extends phone{

    superKeyword(int a) {
        // super();                remember, while derived class is instantiated and either if has a constructor or not, the first line inside the constructor will be super() that is it will call parent class constructor, if it is made manually then also it will call super() by default
        //TODO Auto-generated constructor stub
        System.out.println("gg");
    }

    void greet()
    {
        System.out.println("Hello There inside sub class");
    }

    void example()
    {
        super.greet();
        greet();
        System.out.println(price);
    }

    public static void main(String[] args) {
        // phone ph=new phone(5);
        // ph.example();
        superKeyword sk=new superKeyword(8);
        sk.example();
    }
    
}
