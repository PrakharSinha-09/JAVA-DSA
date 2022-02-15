/*
AGENDA: Lets study about array list under collections framework
DESCRIPTION:
Java ArrayList class uses a dynamic array for storing the elements. 
It is like an array, but there is no size limit. We can add or remove elements anytime.

*/
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Syntax: ArrayList<DataType> list =new ArrayList<>(initial capcity);
        ArrayList<Integer> list =new ArrayList<>(5);
        list.add(33);
        list.add(35);
        list.add(37);
        list.add(33);
        list.add(35);
        list.add(37);
        list.add(39);
        System.out.println(list);
        System.out.println(list.contains(57));             //will return true false correspondingly
        list.set(1,50);
        System.out.println(list);

        //input
        for(int i=0;i<5;i++)
        {
            list.add(sc.nextInt());
        }

        //get item @ any index
        for(int i=0;i<5;i++)
        {
            System.out.println(list.get(i));                   //pass index here, list[index] syntax will not work here
        }

        System.out.println(list);
        
    }
}
