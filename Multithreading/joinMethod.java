/*
class Test7 extends Thread{
    public void run()
    {
        try{
            for(int i=1;i<5;i++)
            {
                System.out.println("child thread"+"-"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){

        }
    }
}
public class joinMethod{
    public static void main(String[] args) {
        Test7 t7=new Test7();
        t7.start();
        try{
            t7.join();
        }
        catch(Exception e)
        {

        }

        try{
            for(int i=1;i<5;i++)
            {
                System.out.println("main thread"+"-"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){

        }
    }
}
*/

//here we want, thread-0 to wait for main thread.

public class joinMethod extends Thread{
    public static Thread mainReference;
    public void run()
    {
        try{
            mainReference.join();
            for(int i=1;i<5;i++)
            {
                System.out.println("child thread"+"-"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){

        }
    }
    public static void main(String[] args) {
        mainReference=Thread.currentThread();
        joinMethod jm=new joinMethod();
        jm.start();
        

        try{
            for(int i=1;i<5;i++)
            {
                System.out.println("main thread"+"-"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){

        }
    }
}