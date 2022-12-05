class Test9 extends Thread{
    public void run()
    {
        // System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
                // System.out.println(Thread.currentThread().isInterrupted());

                // System.out.println(Thread.interrupted());
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
public class interruptedMethod {
    public static void main(String[] args) {
        Test9 t9=new Test9();
        t9.start();
        t9.interrupt();
    }
}
