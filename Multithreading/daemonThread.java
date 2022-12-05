class daemonn extends Thread{
    public void run()
    {
        System.out.println("Daemon Thread");
    }
}
public class daemonThread {
    public static void main(String[] args) {
         System.out.println("Daemon Thread Demo");                   //but if there is no content in main, it won't start the thread, as daemon thread provides service to its parent thread...if there is nothing in the parent thread , what comes the us of starting the thread
        daemonn dd=new daemonn();
        dd.setDaemon(true);
        dd.start(); 

    }
}
