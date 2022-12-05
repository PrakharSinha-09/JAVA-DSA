class Test4 extends Thread{
    public void run()
    {
        System.out.println("Thread Priorities Demonstration");
        System.out.println(Thread.currentThread().getPriority());
    }
}

class Test5 extends Thread{
    public void run()
    {
        System.out.println("Yoooo!");
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class ThreadProperties {
    public static void main(String[] args) {
        Test4 t4=new Test4();
        t4.setPriority(4);
        t4.start();

        Test5 t5=new Test5();
        t5.setPriority(3);
        t5.start();



        System.out.println(Thread.currentThread().getPriority());          //main thread bydefault property is 5.

    }
}
