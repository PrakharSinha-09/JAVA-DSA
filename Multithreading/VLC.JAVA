/*
Agenda: to see the working of threading with multiple tasks from multiple thread.
*/
class Video extends Thread{
    public void run()
    {
        System.out.println("Playing Video");
    }
}

class Music extends Thread{
    public void run()
    {
        System.out.println("Playing Music Parallely");
    }
}

class ProgressBar extends Thread{
    public void run()
    {
        System.out.println("Prgress Bar running");
    }
}

class Timer extends Thread{
    public void run()
    {
        System.out.println("Timer Runnning");
    }
}

public class VLC{
    public static void main(String[] args) {
        Video vi=new Video();
        vi.start();

        Music mu=new Music();
        mu.start();

        ProgressBar pb=new ProgressBar();
        pb.start();

        Timer tm=new Timer();
        tm.start();
    }
}