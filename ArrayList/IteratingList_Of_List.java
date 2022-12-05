import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IteratingList_Of_List{
    public static void main(String[] args) {
        List<List<Integer>> outer=new ArrayList<>();
        List<Integer> inner=new ArrayList<>();

        for(int i=1;i<10; i++){
            inner.add(i);
            outer.add(new ArrayList(inner));          
        }

        
        /*
        If you will add inner.add(outer) it will add reference to the list outer inside all elements of list inner, and since you are constantly changing the list outer, by adding more numbers, all elements in inner list will point to same outer, hence will contain like this [[1,2,3,4,5,6,7,8,.9], [1,2,3,4,5,6,7,8,9] .....] instead of [[1], [1,2], [1,2,3], ....[1,2,3,4,5,6,7,8,9]]
        */
        System.out.println(inner);
        System.out.println(outer);

        // for(List<Integer> innerList : outer) {
        //     for(Integer number : innerList) {
        //         System.out.println(number);
        //     }
        // }

        //Iterating a List
        for(int i=0;i<inner.size();i++)
        {
            System.out.println(inner.get(i));
        }

        //Using Iterator
        Iterator<Integer> it=inner.iterator();             //iteartor is under collections framework, which is in every class for performing iteration
        while(it.hasNext())
        {
            System.out.println("iterartor"+ it.next());
        }
    }
}