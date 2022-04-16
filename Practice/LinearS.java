import java.util.ArrayList;
import java.util.List;

public class LinearS {

    static ArrayList<Integer> linearSearch(int arr[],int index,int target)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        if(index==arr.length)
        {
            return ans;
        }

        if(target==arr[index])
        {
            ans.add(index);
        }

        ArrayList<Integer> list1=linearSearch(arr, index+1, target);
        ans.addAll(list1);

        return ans;
    }
    public static void main(String[] args) {
        int []arr={3,4,5,6,7,8,7};
        int target=7;
        ArrayList<Integer> result=linearSearch(arr, 0, target);
        System.out.println(result);
    }
}
