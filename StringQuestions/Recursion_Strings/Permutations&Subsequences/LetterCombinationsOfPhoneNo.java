import java.util.ArrayList;

/*
AGENDA: Letter Combinations Of A Phone Number
LeetCode Prob. 17(Google)
*/
public class LetterCombinationsOfPhoneNo{
    /*
    static void letterCombo(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';           //this will convert 'char' into (integer)....to covert 1&2 from string to integer

        for(int i=(digit-1)*3;i<digit*3;i++)
        {
            char ch=(char)('a'+i);                         //to get a,b,c from 1.
            letterCombo(p+ch, up.substring(1));
        }

    }

    //Lets try to return an arrayList of the combnations possible. of the same question.
    static ArrayList<String> letterCombi(String p,String up)
    {
        ArrayList<String> list=new ArrayList<>();
        if(up.isEmpty())
        {
            list.add(p);                  //whenever you find your answer, just add up to the list and return the list.
            return list;
        }
        int digit=up.charAt(0)-'0';           

        for(int i=(digit-1)*3;i<digit*3;i++)
        {
            char ch=(char)('a'+i);                       
            ArrayList<String> lim=letterCombi(p+ch, up.substring(1));
            list.addAll(lim);
        }

        return list;
    }
    */

    public static ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> li=new ArrayList<>();
        if(digits.isEmpty())
        {
            //li.add(p);
            return li;
        }
        
        int dig=digits.charAt(0)-'0';
        
        ArrayList<String> lim=new ArrayList<>();
        for(int i=(dig-1)*3;i<dig*3;i++)
        {
            char ch=(char)('a'+i);
            lim=letterCombinations(digits.substring(1));
            li.addAll(lim);
        }
        return li;
    }

    public static void main(String[] args) {
        // letterCombo("", "12");
        // System.out.println(letterCombi("","12"));
        System.out.println(letterCombinations("12"));
    }
}