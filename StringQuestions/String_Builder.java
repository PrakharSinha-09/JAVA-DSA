import javax.sql.rowset.spi.SyncResolver;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<27;i++)
        {
            char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
    } 
    //here changes are getting reflected in original object only that was created..thats the beauty of StringBuilder Class
    //hence memory is saved 
    System.out.println(builder.deleteCharAt(4));
    
}
