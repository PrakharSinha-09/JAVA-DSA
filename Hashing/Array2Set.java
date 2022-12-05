import java.util.*;
import java.util.HashSet;

public class Array2Set {
    public static void main(String[] args) {
        int[] arr={22,4,5,5,6};
        
        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }

        System.out.println(hs.size());
        int[] ar1=new int[hs.size()];
        hs.toArray();

        
        
        // int i=0;
        // while(i!=hs.size())
        // {
        //     arr[i]=hs.
        // }
    } 
}
