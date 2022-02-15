
class Students
{
    int rno;
    String name;
    float marks;

    Students()
    {
        this.rno=10;
        this.name="Prakhar Sinha";
        this.marks=91.4f;
    }

    Students(int rno,String naam,float mark)
    {
        this();                          //this keyword can also be used to call another constructor....this is bascically replacing Students();
        this.rno=rno;
        this.name=naam;
        this.marks=mark;
    }
    Students(Students other)                     //Passing object over here.
    {
        this.name=other.name;                   //this will be replaced by refernce variable you know thus it will assign same properties to this new object 
        this.rno=other.rno;
        this.marks=other.marks;
    }
}

public class Main
{
    public static void main(String[] args) {
        //Students[] stu=new Students[5];
        //System.out.println(stu[0].marks);

        Students prakhar=new Students();           //prakhar refernce will be refered by "this" inside constructor....through this we can achieve generics that is thee use of constructor
        System.out.println(prakhar.rno);

        Students prabal=new Students();
        System.out.println(prabal.marks);

        Students random=new Students(prakhar);
        System.out.println(random.name);

        Students rohan=new Students(21,"Rohan",39.3f);

        final Students kunal=new Students();
        kunal.name="othername"; 
        //when a non primintive is final you cannot reassingn it
       // kunal=new Students();          //this reassignment is not possible.
        
    }
}