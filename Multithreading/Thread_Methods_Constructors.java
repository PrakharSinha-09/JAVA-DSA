
class Test3 extends Thread{
    public void run()
    {
        System.out.println("Hey There");
        Thread.currentThread().setName("Over");              //as you can see we have changed the name of thread in main as well, in such case priority will be given to the call of setName() locally.
        System.out.println(Thread.currentThread().getName());  
    }
}
public class Thread_Methods_Constructors {
    public static void main(String[] args) {
        Test3 t3=new Test3();
        t3.setName("Custom Thread");
        t3.start();
        // System.out.println(Thread.currentThread().getName());              //as we know main also creates its thread named main
        Thread.currentThread().setName("Prakhar");                   //here we changed its name to Prakhar
        System.out.println(Thread.currentThread().getName());
        
        // System.out.println(9/0);
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(t3.currentThread().isAlive());
        

    }
}
