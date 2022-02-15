/*
AGENDA: The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
Problem 1528 Leetcode.
https://leetcode.com/problems/shuffle-string/
*/

public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        String na=s.toLowerCase();
        /*
        char[] sa=na.toCharArray();
        char temp;

        for(int i=0;i<sa.length;i++)
        {
            if(i<indices[i])
            {
                temp=sa[i];
                sa[i]=sa[indices[i]];
                sa[indices[i]]=temp;
                //break;
            }
            
        }

        for(int i=0;i<sa.length;i++)
        {
            System.out.print(sa[i]);
        }
        //String B=String.valueOf(sa);
        */
        StringBuilder sb=new StringBuilder(na);
        for(int i=0;i<indices.length;i++)
        {
            sb.setCharAt(indices[i], s.charAt(i));;
        }
        return sb.toString();           //.toString() method is returned so that we get string finally....if we directly return sb...(just think once what you are returning...yes you are returning object...but we dont need it so converted to string)
    }
    public static void main(String[] args)
    {
        String s="aiohn";
        int[] indices={3,1,4,2,0};
        //System.out.println(restoreString(s,indices));
        System.out.println(restoreString(s,indices));

    }
}