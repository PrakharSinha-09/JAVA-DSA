/*
https://leetcode.com/problems/missing-number/
268. Missing Number
*/
 public class MissingNumber{
     static int missingnum(int arr[])
     {
        int i=0,index;
        while(i<arr.length)
        {
            index=arr[i];
            if(arr[i]<arr.length && arr[index]!=arr[i])
            {
                 int temp=arr[index];
                 arr[index]=arr[i];
                 arr[i]=temp;
            }
            else
            {
                i++;
            }
        }
       //Lets Search for first missing number
       int j;
       for(j=0;j<arr.length;j++)
       {
            if(arr[j]!=j)
            {
                return j;
            }
       }
       //Case 2 if n itself is missing.
       return arr.length;               
    }    
            
     public static void main(String[] args) {
         int arr[]={3,0,2,1,4};
         System.out.println(missingnum(arr));
     }
 }
 