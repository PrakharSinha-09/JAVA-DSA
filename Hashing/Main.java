import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; 
public class Main {
    public void helper_fuction()
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
    
        int[] array1 = new int[size];
        int[] array2 = new int[size];

        for(int i=0;i<size;i++)
        {
            array1[i]=sc.nextInt();
            

        }               
        for(int i=0;i<size;i++)
        {
            array2[i]=sc.nextInt();

        }

        for (int i = 0,j=0; i < array1.length; i++,j++)
        {
            
                if(array1[i] == (array2[j]))
                {
                 
                 System.out.println("Common element is : "+(array1[i]));
                 }
        }
    
 
      
    }
    public static void main(String[] args) 
    {
         Main m=new Main();
         m.helper_fuction();
 
    }
}