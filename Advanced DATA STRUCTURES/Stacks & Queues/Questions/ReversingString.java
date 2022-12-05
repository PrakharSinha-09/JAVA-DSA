
import java.util.Stack;

class ReversingString{

    public static void main(String[] args) {
        
        Stack<Character> stk=new Stack<>();
        String str="Hello";
        char str1[]=str.toCharArray();
        for(char ch: str1){
            stk.push(ch);  
        }
        
        String revStr="";

        for(int i=stk.size()-1;i>=0;i--){
            revStr+=stk.pop();
        }

        System.out.println(revStr);
        
    }
}
