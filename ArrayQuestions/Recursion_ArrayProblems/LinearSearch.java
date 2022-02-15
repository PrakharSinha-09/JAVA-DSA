import java.util.ArrayList;

/*
AGENDA: Linear Search Using Recursion....return false if element not found else true..
Returning index no. of the target element if found.
if the element has multiple occurence , it may return all the index.
*/
public class LinearSearch {
    static boolean search(int[] arr,int target,int index)
    {
        if(index==arr.length)
        {
            return false;
        }
        return arr[index]==target || search(arr, target, index+1);
    }

    static int searchPos(int[] arr,int target,int index)
    {
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        else
        {
            return searchPos(arr, target, index+1);
        }
    }

    static ArrayList<Integer> list=new ArrayList<>();              //for multiple occurence...creating an arraylist....everytime we get arr[index]==target...just add that index to the list.
    static void findAllIndex(int[] arr,int target,int index)
    {
        if(index==arr.length)
        {
            return;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }


    //returning an ArrayList.

    static ArrayList findAllindex(int[] arr,int target,int index,ArrayList<Integer> list)          //this is the most optimal way if we have multiple occuereces of a target element....as only one object is getting created and everytime that very object is getting moified
    {
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        return findAllindex(arr, target, index+1, list);
    }

    static ArrayList findAllindex2(int[] arr,int target,int index)
    {
        ArrayList<Integer> list=new ArrayList<>();

        if(index==arr.length)                          //if index reached the value of arr.length simply return the list as we don't have anything to do after.
        {
            return list;
        }

        //this wil contain answer for that function call only...which is pretty straightforward
        if(arr[index]==target)
        {
            list.add(index);
        }
        
        ArrayList<Integer> ansFromBelowCalls=findAllindex2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);          //hey you are going out of recursion call..hey you are going above  can you take my answer call as well?

        return list;        			//got confused why not returning the function itself... we are returning it after adding in list so that @ whatever index we get the target value it can be added to the arrayList.
    }

    public static void main(String[] args) {
        int arr[]={3,2,18,18,19};
        int target=18;
        boolean find=search(arr, target, 0);
        int find1=searchPos(arr, target, 0);
        System.out.println(find);
        System.out.println(find1);
        findAllIndex(arr, target, 0);
        System.out.println(list);

        ArrayList<Integer> ans=findAllindex(arr, target, 0, new ArrayList<>());
        System.out.println(ans);           //this new arrayList will remain same throughout.

        System.out.println(findAllindex2(arr, target, 0));
    }
}
