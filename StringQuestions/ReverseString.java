/*
AGENDA 1: REVERSing a string in stringbuilder class.

AGENDA 2: Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ 
in the original string with letter ‘i’. 

AGENDA 3: Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’.
Display that username to the user.

AGENDA 4: Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
*/

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        StringBuilder name=new StringBuilder("Hello");

        for(int i=0;i<name.length()/2;i++)
        {
            int front=i;
            int back=name.length()-1-i;
            char frontChar=name.charAt(front);
            char backChar=name.charAt(back);

            name.setCharAt(front,backChar);
            name.setCharAt(back, frontChar);
        }
        System.out.println(name);
    

        //AGENDA 2
        Scanner sc=new Scanner(System.in);
        String input;
        String result="";
        
        System.out.println("Enter a String");
        input=sc.next();
        
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='e')
            {
                result=result+'i';
            }
            else
            {
                result=result+input.charAt(i);
            }
        }
        System.out.println(result);
                                
        //AGENDA 3
        String email;
        String username;
        System.out.println("Enter Your email id");
        email=sc.next();
        username="";

        for(int i=0;i<email.length();i++)
        {
            if(email.charAt(i)=='@')
            {
                break;
            }
            else
            {
                username=username+email.charAt(i);
            }
        }
        System.out.println(username);

        //AGENDA 4
        int size;
        System.out.println("Enter the size of String");
        size=sc.nextInt();
        String na[]=new String[size];
        int totalLength=0;

        System.out.println("Insert the elements inside the string array");
        for(int i=0;i<na.length;i++)
        {
            na[i]=sc.next();
            totalLength=totalLength+na[i].length();
        }
        System.out.print("Combined Length= "+ totalLength);

        /*
        
public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] ch=A.toCharArray();
        char temp;
        int i=A.length();
        i--;
        int j=0;
        while(j<=i)
        {
            temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i--;
            j++;
        }
        for(int k=0;k<ch.length;k++)
        {
            System.out.print(ch[k]);
        }
        String B=String.valueOf(ch);
        if(A.equals(B))
        {
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("Not pallindrome");
        }
    }
}
       */
    }
}