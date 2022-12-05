/*
Agenda: to see the working of threading with multiple tasks from multiple thread.
*/

class Test1 extends Thread{
    public void run()
    {
        System.out.println("Task 1");
    }
}

class Test2 extends Thread{
    public void run()
    {
        System.out.println("Task 2");
    }
}
public class ThreadingCase3 {
    public static void main(String[] args) {
        Test1 t1=new Test1();
        Test2 t2=new Test2();

        t1.start();
        t2.start();

    }
}
