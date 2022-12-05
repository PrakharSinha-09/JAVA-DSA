import java.util.HashSet;
import java.util.Iterator;;

public class hashSet{

    public static void main(String[] args) {
        //Creation
        HashSet<Integer> sett=new HashSet<>();

        //INSERTION
        sett.add(1);
        sett.add(2);
        sett.add(3);
        sett.add(4);

        //searching in HashSet--> contains method
        if(sett.contains(12))
        {
            System.out.println("True");
        }
        else{
            System.err.println("false");
        }

        //Deleting 
        sett.remove(1);

        //size
        System.out.println(sett.size());
        System.out.println(sett);

        //Iterator interface is used to traverse the object of collections framework so, we'll be using it to traverse HashSet
        Iterator it=sett.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}