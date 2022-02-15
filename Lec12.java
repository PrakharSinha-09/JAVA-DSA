/*
AGENDA: Lets Study Strings 
*/

import java.util.*;
class Lec12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First and last name");
        String fName=sc.next();
        String lName=sc.next();
        String fullName=fName+" "+ lName;              //concatenating
        System.out.print(fullName+"\n");

        //printing each characters in string;
        
        for(int i=0;i<fullName.length();i++)
        {
            System.out.println(fullName.charAt(i));           //charAt() function enables us to access the particular character in string
        }

        //comparing using compareTo function
        /*
        case 1: if s1>s2  : it will print a +ve value.
        case 2: if s1==s2 : it will return 0;
        case 3: if s1<s2  : it will return -ve value
        */

        if(fName.compareTo(lName)==0){
            System.out.println("Strings Are Equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        //you might be wondering how we are able to compare strings..
        //think of hello and cello...which is greater? 
        //hello is greater as h comes after c so it has higher order...hence hello is greater than cello.

        if(fName==lName){                           //we will not copmare using == operator as it returns true only when both the strings have got the same memory allocation.
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
 
        if(fName.equals(lName)){                      //.equals() method can also be used.
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }

        //Substring

        String name=fullName.substring(6,fullName.length());           //this accept two arguments....one starting index and other ending index which is not inclusive.
        System.out.println(name);


        //String(objects) are immutable.........Commit TO Memory!
    }
}