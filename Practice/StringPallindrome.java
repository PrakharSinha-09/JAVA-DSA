public class StringPallindrome {
    public static void main(String[] args) {
        String sc= "ello";
        StringBuilder sb;
        boolean isPallindrome=false;
        for(int i=0;i<sc.length()/2;i++)
        {
            char front=sc.charAt(i);
            char last=sc.charAt(sc.length()-1-i);

            if(front!=last)
            {
                System.out.println("Not Pallindrome");
                isPallindrome=false;
                return;
            }
        }

        if(!isPallindrome)
        {
            System.out.println("pallindrome");
        }

    }
}
