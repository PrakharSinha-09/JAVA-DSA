import java.util.ArrayList;

public class StringSubsequence {
    static ArrayList<String> subseq(String p,String up)
    {
        ArrayList<String> list=new ArrayList<>();
        if(up.isEmpty())
        {
           list.add(p);
           return list;
        }

        char ch=up.charAt(0);
        list.addAll(subseq(p+ch, up.substring(1)));
        list.addAll(subseq(p, up.substring(1)));

        return list;


    }
    public static void main(String[] args) {
        System.out.println(subseq("", "abc"));
    }
}
