import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

//When we need to store data in key-value pairs we use this data structure.

public class hashMap {
    public static void main(String[] args) {

        //Creation
        HashMap<String,Integer> map1=new HashMap<>();   ///where map1 is the name of collection

        //Insertion
        map1.put("India", 150);
        map1.put("USA", 150);
        map1.put("Chinaa", 190);
        map1.put("China1", 190);
        map1.put("China2", 190);
        map1.put("China3", 190);
        map1.put("China4", 190);
        map1.put("China5", 190);
        map1.put("China6", 190);
        map1.put("China7", 190);
        map1.put("China8", 190);
        map1.put("China9", 190);
        map1.put("China10", 190);
        map1.put("China27", 190);
        map1.put("China56", 190);
        map1.put("China90", 190);
        map1.put("China93330", 190);
        map1.put("Chin330", 190);
        
        //if our HashMap already contains the key we are going to reinsert, then it will update the existing value othewise, if it dosen't exist, it will put the pair

        
        //Search Operation
        //.containsKey(key) will return true, if the key is present otherwise false
        /* 
        if(map1.containsKey("India")){
            System.out.println("Key is Present");
        }
        else{
            System.out.println("Not Present");
        }

        //extracting the value at a provided key
        System.out.println(map1.get("India"));
        System.out.println(map1.get("Japan"));       //will return null, if the key is not present 
        */

        //Iteration in HashMap using Map.Entry<String,Integer> e :map1.entrySet(), this variable e will contain key-value pair both
        //saare entries ka set banaya
        //remember how we used to write the for each loop, in the same manner we are writing it here too!
        for(Map.Entry<String,Integer> e :map1.entrySet())
        {
            // System.out.println(e.getKey());
            // System.out.println(e.getValue());
            if(e.getValue()==150)
            {
                System.out.println(e.getKey());
            }
        }

        /* 
        //way 2 to iterate 
        Set<String> keys=map1.keySet();
        for(String key:keys)
        {
            System.out.println(key+" "+map1.get(key));
        }

        //removing a pair
        map1.remove("China");
        System.out.println(map1);
        */
    }
}
