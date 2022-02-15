/*
AGENDA: To search for a character in a string.
*/
public class SearchingiNString {

    static boolean search(String str,char elem)
    {
        if(str.length()==0)
        {
            return false;
        }
        for(int i=0;i<str.length();i++)
        {
            if(elem==str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String name="Prakhar";
        char ele='m';
        boolean searching;
        searching=search(name,ele);
        System.out.println(searching);
    }
}
