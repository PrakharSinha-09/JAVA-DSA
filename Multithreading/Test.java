/*
Agenda : Learning to create Threads by extending Thread Class.
 */
class Test extends Thread{
    public void run()
    {
        System.out.println("Thread Task");
    }
    
    public static void main(String[] args) {
        Test t=new Test();
        t.start();
        // t.start();            will lead to exception as thread once dead cannot be renewed.
        Test th=new Test();
        th.start();


    }
}