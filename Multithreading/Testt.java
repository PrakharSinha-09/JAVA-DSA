/*
 Agenda: Creating Threads by implementing Runnable Interface
 */
public class Testt implements Runnable{
    public void run()
    {
        System.out.println("Creating Thread by implementing Runnable Interface");
    }

    // public void start()
    // {
    //     System.out.println("hye ");
    // }

    public static void main(String[] args) {
        Testt tt=new Testt();
        Thread th=new Thread(tt);                //to eliminate this step, extend Thread class and implement runnable.., then you can directly call start() methood via Test Object refence i.e., tt.start()
        th.start();
        // tt.start();

    }
}
