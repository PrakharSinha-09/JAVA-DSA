import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// class demo{
//     public  minimumTotal(List<List<Integer>> triangle) {

//         for(int i=0;i<triangle.size();i++)
//         {
//             int range=triangle.get(i).size();

//         }
//     }
// }

public class Solution {
    public static void main(String[] args) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();

        for (int i = 1; i<5; i++) {
            inner.add(i);
            outer.add(new ArrayList(inner));
        }

        System.out.println(outer.size());
        // System.out.println(Collections.min(inner));
        int sum=0;
        // List<Integer> range=new ArrayList<>();
        for (int i = 0; i < outer.size(); i++) {
            List<Integer> range=outer.get(i);
            System.out.println(range);
            for(int j=0;j<range.size();j++)
            {
                // sum+=Collections.min(range);
                // // System.out.print(sum+" ");
                // break;
                System.out.print(range);
                
            }

        }
        // System.out.println(sum);
        // System.out.println(range);
    }
}
