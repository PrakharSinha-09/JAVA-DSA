import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class frequencyCount {
    /* 
    Bruteforce
    public static void frequencyCountss(int arr[], int N, int P)
    {
        
    // code here  ~ Bruteforce
     int[] count=new int[N];
     Arrays.fill(count,0);
     
     for(int i=0;i<N;i++)
     {
         for(int j=1;j<=P;j++)
         {
             if(arr[i]>N)
             {
                 continue;
             }
             if(arr[i]==j)
             {
                 count[j-1]+=1;
                 break;
                }
            }
        }
        
        for(int i=0;i<N;i++)
        {
         arr[i]=count[i];
        }
    }
    
    public static void main(String[] args) {
        int[] arr={2,4,5,6,8};
        int n=arr.length;
        int P=10;
        
        frequencyCountss(arr, n, P);
        System.out.println(Arrays.toString(arr));
        
    }
    */

    //Optimised
    public static void main(String args[]){  
   
        int arr[] = {10,5,10,15,10,5};
          int n = arr.length;
          Frequency(arr, n);
       }
     static void Frequency(int arr[], int n)
     {
         Map<Integer, Integer> map = new HashMap<>();
      
         for (int i = 0; i < n; i++)
         {
             if (map.containsKey(arr[i]))
             {
                 map.put(arr[i], map.get(arr[i]) + 1);
             }
             else
             {
                 map.put(arr[i], 1);
             }
         }
         // Traverse through map and print frequencies
         for (Map.Entry<Integer,Integer> entry : map.entrySet())
         {
             System.out.println(entry.getKey() + " " + entry.getValue());
         }
     }
     
}
