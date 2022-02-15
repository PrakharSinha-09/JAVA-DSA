import java.util.Arrays;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr=new int[]{3,4,5,6,7,8};
    Human(int age,String name)
    {
        this.age=age;
        this.name=name;
    }

    Human(Human other)
    {
        this.age=other.age;
        this.name=other.name;
    }

    public Object clone() throws CloneNotSupportedException
    {
        //return super.clone();            //this is shallow copy
        //now deep copy
        Human twin=(Human)super.clone();       //this is actually a deep copy

        //make a deep copy
        twin.arr=new int[twin.arr.length];
        for(int i=0;i<twin.arr.length;i++)
        {
            twin.arr[i]=this.arr[i];
        }

        return twin;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Prakhar=new Human(19,"Prakhar Sinha");
        //Human Prabal=new Human(Prakhar);                //Actually making copy of Prakhar...obviously as we are passing Prakhar's Reference in Prabal
                                                        //this is called object cloning, well this is taking too much time because of new keyword

        Human Prabal=(Human)Prakhar.clone();
        System.out.println(Prabal.age);

        System.out.println(Arrays.toString(Prakhar.arr));

        Prabal.arr[0]=100;
        System.out.println(Arrays.toString(Prabal.arr));
        System.out.println(Arrays.toString(Prakhar.arr));

    }
}