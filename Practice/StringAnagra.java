import java.util.Scanner;

public class StringAnagra {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String");
        String na=sc.next();
        System.out.println("Enter Second string");
        String sa=sc.next();

        char temp;

        if(na.length()!=sa.length())
        {
            System.out.println("Not Anagrams");
        }

        else
        {
            int count=0;
            int count2=0;

            for(int i=0;i<na.length();i++)
            {
                temp=na.charAt(i);
                for(int j=0;j<na.length();j++)
                {
                    if(temp==na.charAt(j))
                    count++;
                    if(temp==sa.charAt(j))
                    count2++;
                }
            }
            if(count==count2)
            {
                System.out.println("Anagrams");
            }
        }  
    }
}
