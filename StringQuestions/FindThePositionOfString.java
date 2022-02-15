/*
AGENDA: finding the value of string.
        example: coding
        output=52    (3+15+4+9+14+7=52)...sum of position of the alphabets of given string taking 'a' as 1 and so on. 
*/
public class FindThePositionOfString {
    public static void main(String[] args) {
        String na="abc";
        String la=na.toLowerCase();
        char[] ch=la.toCharArray();
        int count=0,value=0;
        int sum=0;


        // for(int i=0;i<na.length();i++)
        // {
        //     for(char cha='a';cha<='z';cha++)
        //     {
        //         if(ch[i]==cha)
        //         {
        //             sum=sum+(int) cha;                 //(typecasting to int) is optional as compiler itself has implpicitly typecasted
        //             break;
        //         }
        //     }
        // }

        System.out.println(sum);
        for(int i=0;i<na.length();i++)
        {
            for(char cha='a';cha<='z';cha++)
            {
                if(ch[i]==cha)
                {
                    count++;
                    break;
                }
                else
                {
                    count++;
                }
            }
            value=value+count;
            count=0;
        }
        System.out.println("The Value of the given string is " +value);
    }
}
