/*
Question:- You Are Given A String Of lowercase characters Your task is to rearrange(reorder) in such a way that no djacent characters are the same.You have to return the rearranged string.if there exists more than one solution , you can return any of them.If there is no such string , You have to return "No Solution".If Your returned value is correct, the program will print "CORRECT" else "INCORRECT".
*/ 
public class Question {
    static String rearrange(String a)
    {
        String ans="";
        char[] arr=a.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(i<arr.length)
            {
                if(arr[i]==arr[i+1] || arr[i]==arr[i-1])
                {
                    
                }
            }
            
        }
    }
}
