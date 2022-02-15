import java.util.ArrayList;

public class Subsequence {
    static void subseq(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p+" ");
            return;
        }

        char ch=up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    //Returning an ArrayList

    static ArrayList<String> subse(String p,String up)
    {
        ArrayList<String> li=new ArrayList<>();
        if(up.isEmpty())
        {
            li.add(p);
            return li;    
        }

        ArrayList<String> lim=new ArrayList<>();
        ArrayList<String> lik=new ArrayList<>();
        char ch=up.charAt(0);
        lim=subse(p+ch, up.substring(1));
        lik=subse(p, up.substring(1));
        
        li.addAll(lim);
        li.addAll(lik);

        return li;
    }
    public static void main(String[] args) {
        //subseq("", "abc");
        System.out.println(subse("", "abc"));
    }
}
