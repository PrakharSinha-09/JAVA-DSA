import java.io.*;
import java.util.*;

public class Java_EOF {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        int i = 0;
        while (sc.hasNextLine()) {       //The hasNextLine() is a method of Java Scanner class which is used to check if there is another line in the input of this scanner. It returns true if it finds another line, otherwise returns false.
            System.out.println(++i + " " + sc.nextLine());
        }
    }
}
