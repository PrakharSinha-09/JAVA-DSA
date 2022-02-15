/*
AGENDA: Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies.    
*/
import java.util.Scanner;

public class StringAnagrams {
    static boolean isAnagram(String c, String d) {
  
  String a=c.toLowerCase();
  String b=d.toLowerCase();
  int count=0;
  int count2=0;

  if(a.length()!=b.length())                      //if the length of two strings are not equal, they can no way anagram 
  {
      return false;
  }

  for(int i=0; i<a.length(); i++)
  {
      char ch=a.charAt(i);
      for(int j=0; j<a.length(); j++)
      {
          if(a.charAt(j)==ch)
          count++;
          if(b.charAt(j)==ch)
          count2++;
      }
      if(count!=count2)
      {
      return false; 
      }
  }
  return true;
}
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}