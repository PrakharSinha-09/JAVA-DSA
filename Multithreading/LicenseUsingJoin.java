class Medical extends Thread{
    public void run()
    {
        System.out.println("Medical Started");
        try{
            Thread.sleep(2000);
        }
        catch(Exception e)
        {

        }
        System.out.println("Medical Completed");
    }
}

class TestDrive extends Thread{
    public void run()
    {
        System.out.println("TestDrive Starting");
        try{
            Thread.sleep(2000);
        }
        catch(Exception e)
        {

        }
        System.out.println("TestDrive Completed");
    }
}

class OfficerSign extends Thread{
    public void run()
    {
        System.out.println("Officer Signed!");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e)
        {

        }
        System.out.println("Congrats!, You have got your Driving License");
    }
}
public class LicenseUsingJoin {
    public static void main(String[] args) {
        Medical ml=new Medical();
        ml.start();
        try{
            ml.join();
        }
        catch(Exception e)
        {

        }

        TestDrive td=new TestDrive();
        td.start();
        try{
            td.join();
        }
        catch(Exception e)
        {

        }

        OfficerSign os=new OfficerSign();
        os.start();
    }
}
