class Test8 extends Thread{
    public void run()
    {
        try{
            for(int i=1;i<=5;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class interruptMethod {
    public static void main(String[] args) {
        Test8 t8=new Test8();
        t8.start();
        t8.interrupt();            //As we wrote this line, if in thread-0, it gets sleep(), it will go to catch block and execute that and fiinally get terminated
    }
}
