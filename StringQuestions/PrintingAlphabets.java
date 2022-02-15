import java.util.Arrays;

public class PrintingAlphabets {
    public static void main(String[] args) {
        String alpha="";
        for(int i=0;i<27;i++)
        {
            char ch=(char) ('a'+i);
            //System.out.println(ch);
            alpha=alpha+ch;                           //as there is no way possibility that string will change its data type...but char will and thus concatenation @ every concatenation.
        }
        System.out.println(alpha);
        System.out.println(alpha.indexOf("bcd"));
        

        //but this is not the optimal solution...can u feel why?
        //you got it right as after every iteration, concatenation is happening so each time new string object is getting created.
        //which has no reference variable pointing out to that particular string @ every iiteration...so there is huge waste of memory
        //as object consumes memory we know.
        //Time Complexity: 1+2+3+4+5+.....=n(n+1)/2 = O(n^2) whichh is very bad.

        //to overcome this drawback...StringBuilder class was introduced.

        StringBuilder builder=new StringBuilder();
        for(int i=0;i<27;i++)
        {
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);             //here changes are getting reflected in original object only that was created..thats the beauty of StringBuilder Class. hence memory is saved 

        System.out.println(builder.delete(0,5));      //original created object change with this 
        System.out.println(builder.reverse());        //now reversing through above created object.
        
    }                                                                   
}
