import java.util.ArrayList;
import java.util.Arrays;

/*
AGENDA: Intro To Recursion....Amongst the Most important concept in any programming language out there.
lets Go!
*/
public class NumberExample{
    static void print(int n)
    {
        if(n==5)
        {
            System.out.println("5");
            return;
        }
        System.out.println(n);              //1 2 3 4 5
        print(n+1);
        System.out.println(n);              //5 4 3 2 1
    }


    //Returning int the form of arrayList.
    static ArrayList<Integer> prints(int n)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(n==5)
        {
            list.add(n);
            return list;
        }
        //list.addAll(prints(n+1));
        list.add(n);
        ArrayList<Integer> lim=prints(n+1);
        list.addAll(lim);
        return list;
       
    }

    static int[] linear(int[] arr,int target)
    {
        int[] nums=new int[10];
        int i=0;
        int j=0;
        for(i=0;i<arr.length;i++)
        {
            if(j<arr.length)
            {
                if(arr[i]==target)
                {
                    nums[j]=i;
                    j++;
                }
            }
            
        }
        return nums;
    }
    public static void main(String[] args) {
        System.out.println(prints(1));
        int arr[]={2,4,5,6,4,3};
        int target=4;
        System.out.println(Arrays.toString(linear(arr, target)));
    }
}