public class Example{

    static int divide(int a,int b) throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException("division with zero is not allowed");
        }

        return a/b;
    }
    public static void main(String[] args) {
        int a=5;
        int b=0;

        try{
            //System.out.println(divide(a, b));
            String name="Prakhar";
            if(name.equals("Prakhar"))
            {
                throw new CustomException("name is Prakhar");
            }
        }
        catch(CustomException e)
        {
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());         //will display message
        }
        catch(Exception e)                              //remember this is the parent class of exception so if you are specifying known exception you will have to writeit above this..obviously as under exception all exceptions will be covered
        {
            System.out.println("Default Exception");         //will display message
        }

        finally
        {
            System.out.println("No matter whether exception thrown or not it will always run");
        }
        
    }
}