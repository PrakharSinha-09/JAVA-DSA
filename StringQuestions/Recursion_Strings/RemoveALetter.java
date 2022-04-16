/*
AGENDA: To Remove all occurences of a letter from a string... using both iterative approach and recursive.
To remove the given substring from the string
*/
public class RemoveALetter {
    /*
    //Iterative Approach
    static void remove(String a)
    {
        String ans="";
        char[] ch=a.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!='a')
            {
                ans+=ch[i];
            }
        }
        System.out.println(ans);
        
    }
    */

    //Recursive Approach
    /*
    static void remove(String ans,String a)
    {
        if(a.isEmpty())                                      //if original string is empty... simply print ans and return.
        {
            System.out.println(ans);
            return;
        }

        char ch=a.charAt(0);                                 //first character of every function call

        if(ch=='a')
        {
            remove(ans, a.substring(1));                     //in every function call...original string is just removing first character.
        }
        else
        {
            remove(ans+ch, a.substring(1));                  //if ch!=a....we have to add it to answer variable.
        }
    }*/

    /*
    //Removing a Substring
    static String remove(String a)
    {
        if(a.isEmpty())                                      //if original string is empty... simply print ans and return.
        {
            return "";
        }
        
        if(a.startsWith("hello"))
        {
            return remove(a.substring(5));                     //if hello found remove it thats why substring is used and length of hello is passed.
        }
        else
        {
            return a.charAt(0)+remove(a.substring(1));        //this means i know you are going up cna youu add my answer also, yes obviously when return remove() is written it will go up and up , so ch is asking if u are going up can you add my answer also    
        }
    }
    */

    //What if we need to pass only one string in the argument and rest in function body...for that thing we need to have return type string as base condition will be encountered...function will get retured to the function from where it was called...and in b/w we are asking the retured result to add that character which is not equal to a.
    static String remove(String a)
    {
        if(a.isEmpty())                                      //if original string is empty... simply print ans and return.
        {
            return "";
        }
        char ch=a.charAt(0);

        if(ch=='a')
        {
            return remove(a.substring(1));                     //if hello found remove it thats why substring is used and length of hello is passed.
        }
        else
        {
            return ch+remove(a.substring(1));            
        }
    }
    public static void main(String[] args) {
        System.out.println(remove("baba"));
    }
}
