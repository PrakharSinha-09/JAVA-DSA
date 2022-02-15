/*
AGENDA: tO convert uppercase to lowercase and upper case to lowercase in strings
*/
public class CaseConversion {
    public static void main(String[] args) {
        String na="ABCDE";
        char[] np=na.toCharArray();
        String ne="";

        for(int i=0;i<na.length();i++)
        {
            if(np[i]>'A' && np[i]<'Z')
            {
                np[i]=(char) (np[i]+31);                   //remeber to typecast into array
                ne=ne+np[i];
            }
        }
        System.out.println(ne);
    }
    
}
