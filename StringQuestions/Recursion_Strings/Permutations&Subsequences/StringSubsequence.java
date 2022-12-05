import java.util.ArrayList;

/*
AGENDA: To print the subsequence of a given string
for ex- for "abc"
subsequences will be a,b,c,ab,bc,ac,abc
*/
class StringSubsequenc{
    static void subsequence(String p,String up)                  //up mans unprocessed string i.e., original string and p means processed string..means after manipulation results to be stored here
    {
        if(up.isEmpty())
        {
            System.out.print(p+" ");
            return;
        }

        char ch=up.charAt(0);
        subsequence(p+ch,up.substring(1));                        //Either take it thats why ch is added up.
        subsequence(p, up.substring(1));                          //Or Ignore it thus not added ch.
    }


    //Returning the array list for these subsequences.
    static ArrayList subSeqRet(String p,String up)
    {
        ArrayList<String> list=new ArrayList<>();

        if(up.isEmpty())                   //whenever we got the answer,just return the answer what we are getting at that point.
        {
            list.add(p);                  //thus added processed string and then returning. 
            return list;
        }

        char ch=up.charAt(0);
        ArrayList<String> left=subSeqRet(p+ch, up.substring(1));
        ArrayList<String> right=subSeqRet(p, up.substring(1));

        left.addAll(right);            //hey you are going out of recursion call..hey you are going above  can you take my answer call as well?

        return left;
    }

    //Susequeb=nce with their Ascii Codes
    static ArrayList subSeqAsciiRet(String p,String up)
    {
        ArrayList<String> list=new ArrayList<>();

        if(up.isEmpty())                   //whenever we got the answer,just return the answer what we are getting at that point.
        {
            list.add(p);                  //thus added processed string and then returning. 
            return list;
        }

        char ch=up.charAt(0);
        ArrayList<String> first=subSeqRet(p+ch, up.substring(1));
        ArrayList<String> second=subSeqRet(p, up.substring(1));
        ArrayList<String> third=subSeqRet(p+(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }
    
    public static void main(String[] args) {
        //subsequence("", "abc");
        //System.out.println(subSeqRet("", "abc"));
        System.out.println(subSeqAsciiRet("", "abc"));
    }
}