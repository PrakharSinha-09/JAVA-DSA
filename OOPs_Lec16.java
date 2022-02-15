import java.security.Permissions;

/*
AGENGDA: To learn about object oriented programming structure.
*/
class Pen
{
    String color;                             //this is the class(blueprint) pen, whic basically defines the structure of pen...noow if want to use these properties, we have to create an object of this class.
    String type;

    public void write()
    {
        System.out.println("Writing");
    }
}

class Student
{
    String name;
    int age;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student()                                     //non parameterized constructor
    {
        System.out.println("this is non parameterized parameter");
    }

    Student(String name,int age)                  //parameterized constructor
    {
        this.name=name;
        this.age=age;
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student stud2)                        //copy-constructor
    {
        this.name=stud2.name;
        this.age=stud2.age;
    }
}
public class OOPs_Lec16 {
    public static void main(String[] args) {
        Pen pen1=new Pen();                       //class instantiated i.e., object of class pen is created.
        pen1.write();                             //to use any fields or methods we have to use object name with (.) symbol.
        pen1.color="blue";
        pen1.type="ballpoint";
        System.out.println(pen1.color);

        Student stud=new Student("Prakhar",19);
        // stud.name="Prakhar";
        // stud.age=19;

        Student stud2=new Student(stud);
        stud2.printInfo();    
    }
}
