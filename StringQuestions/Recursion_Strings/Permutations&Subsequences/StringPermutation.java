import java.util.ArrayList;

public class StringPermutation {
    static void permute(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p+" ");
            return;
        }

        char ch=up.charAt(0);

        for(int i=0;i<p.length()+1;i++)
        {
            String first=p.substring(0,i);
            String second=p.substring(i, p.length());
            permute(first+ch+second, up.substring(1));
        }
    }


    //Same problem returning an arrayList this time.
    static ArrayList<String> permutationList(String p,String up)
    {
        ArrayList<String> list=new ArrayList<>();            //obviously this list is local to this function call...that means every time it is called, new fresh list will be created and every function call will hold only its value that is why .addAll method is used eventuallly(understood already!) 
        if(up.isEmpty())
        {
            list.add(p);
            return list;
        }

        char ch=up.charAt(0);
        for(int i=0;i<p.length()+1;i++)
        {
            String f=p.substring(0, i); 
            String s=p.substring(i,p.length());
            list.addAll(permutationList(f+ch+s, up.substring(1)));
        }
        return list;
    }

    //Now Lets Count no. of permutations.

    static int permutationsCount(String p,String up)
    {
        if(up.isEmpty())
        {
            return 1;                                 //as 0!=1
        }

        char ch=up.charAt(0);
        int count =0;

        for(int i=0;i<p.length()+1;i++)
        {
            String first=p.substring(0,i);
            String second=p.substring(i, p.length());
            count=count+permutationsCount(first+ch+second, up.substring(1));
        }
        return count;                //see notes to know why returning count.
    }
    public static void main(String[] args) {
        permute("", "abc");
        ArrayList<String> ans=permutationList("", "abc");
        System.out.println(ans);
        System.out.println(permutationsCount("", "abc"));
    }
}
