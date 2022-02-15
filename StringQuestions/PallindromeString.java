public class PallindromeString {
    static boolean isPallindrome(String str)
    {
        if(str==null || str.length()==0)
        {
            return true;
        }
        str=str.toLowerCase();

        for(int i=0;i<str.length()/2;i++)
        {
            char front=str.charAt(i);
            char end=str.charAt(str.length()-1-i);

            if(front!=end)
            {
                return false;
            }
        }
        return true;
    }
    

    
    public static void main(String[] args) {
        String str="abccba";
        System.out.println(isPallindrome(str));
    }
    
}
