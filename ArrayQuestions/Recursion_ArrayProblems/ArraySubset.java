import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySubset {
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
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();

        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++)
        {   
            start=0;
            //if current element and previous element is same then start=end+1;
            if(i>0 && arr[i]==arr[i-1])               //as we have used arr[i-1]...that is why we are having a check for i>0  otherwise it will throw index out of bound exception.
            {
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for(int j=start;j<n;j++)
            {
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
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
