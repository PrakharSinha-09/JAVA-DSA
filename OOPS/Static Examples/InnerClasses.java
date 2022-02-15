// class Test{
//     static String name;
//     public Test(String name)
//     {
//         this.name=name;
//     }
// }

public class InnerClasses {

    static class Test{                                  //making this class static means that this class is actually not dependent on the objects of outer class
        String name;                                  //that means to access this inner class we dont need to create the object of outer classs...hence it was posssible for us to instantiate it directly.
        public Test(String name)
        {
            this.name=name;
        }
    }

    public static void main(String[] args) {
        Test a=new Test("Prakhar");               //we 
        Test b=new Test("Prabal");

         
        System.out.println(a.name);
        System.out.println(b.name);

    }
}
