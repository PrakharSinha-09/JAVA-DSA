// public class sleepDemo {
//     public static void main(String[] args) {
//         for(int i=0;i<5;i++)
//         {
//             try{
//                 Thread.sleep(2000);                    //why inside try catch? because sleep() method throw compiletime exception
//                 System.out.println(i);
//             }
//             catch(Exception e)
//             {
//                 System.out.println(e);
//             }
//         }
//     }
// }

class Test6 extends Thread{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            try{
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class sleepDemo{
    public static void main(String[] args) {
        Test6 t6=new Test6();                   //sent this thread for sleep for 1 seconds 
        t6.start();
    }
}
