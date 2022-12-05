public class StringPallindrome {
    static boolean isPallidrome(String s)
    {
        if(s.length()==0)
        {
            return true;
        }
        String revStr=reverse(s);
        if(s.equals(revStr))
        {
            return true;
        }

        return false;
    }
    
    static String rev="";
    static String reverse(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }
        rev=reverse(s.substring(1)) + s.charAt(0);
        // System.out.print(s.charAt(0));
        // rev+=s.charAt(0);
        return rev;
        // System.out.println(rev);
        


    }
    public static void main(String[] args) {
        // System.out.println(check("abac"));
        System.out.println(isPallidrome("aba"));
    }
}
