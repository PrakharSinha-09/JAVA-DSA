/*
Agenda: To get the majority element in the array!
majority element in the array is the elemnt which is present more than N/2 times, were N is the length of the array.
here we will be using Moore' Voting algorithm as it is the most efficient algorithm..it ends up with O(N) time complexity and constant space complexity
*/
public class MajorityElement {

    static void majorityEelement(int[] arr)
    {
        int ansIndex=-1;
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ansIndex)
            {
                count++;
            }
            else
            {
                count--;
            }

            if(count==0)
            {
                ansIndex=arr[i];
                count=1;
            }
        }

        //int count1=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ansIndex)
            {
                count++;
            }
        }

        if(count>arr.length/2)
        {
            System.out.println("Majority Element= "+ ansIndex);
        }
    }
    public static void main(String[] args) {
        int[] arr={ 1, 1, 1, 1, 2, 3, 4};
        majorityEelement(arr);
    }
}
