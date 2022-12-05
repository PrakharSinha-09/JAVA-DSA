import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class hello {
    /*
    static List<List<Integer>> subset(int arr[])
    {
        List<List<Integer>> outer=new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num: arr)
        {
            int n=outer.size();
            for(int i=0;i<n;i++)
            {
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    */

    //What if we have duplicate elements present in the array...
    static List<List<Integer>> subsetDuplicate(int arr[])            //took list<list<Integer>> because we have list of list of subsets....#feelKaro.
    {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int n: arr)
        {
            int a=outer.size();
            for(int i=0;i<a;i++)
            {
                ArrayList<Integer> inner=new ArrayList<>();
                inner.add(n);
                if(outer.contains(inner))
                {
                    continue;
                }
                outer.add(inner);
            
            }
        }
        return outer;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2};
        List<List<Integer>> ans =subsetDuplicate(arr);
        System.out.println(ans);
    }
}
