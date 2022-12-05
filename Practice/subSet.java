import java.util.ArrayList;
import java.util.List;

class subSet{
    static List<List<Integer>> sub(int arr[])
        {
            List<List<Integer>> outer=new ArrayList<>();
            outer.add(new ArrayList<>());
            for(int num :arr)
            {
                int n=outer.size();
                for(int i=0;i<n;i++)
                {
                    ArrayList<Integer> inner=new ArrayList<>(outer.get(i));
                    inner.add(num);
                    if(outer.contains(inner))
                    {
                        continue;
                    }

                    else
                    {
                        outer.add(inner);
                    }
                    
                }
            }

            return outer;
        }
  
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> outer=sub(arr); 
        System.out.println(outer);
    }
}