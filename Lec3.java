/*
AGENDA: Condidtional Statements
->if-else
->if else if
->nested if else
->switch case with break statement
*/


import java.util.*;
class Lec3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter First Number");
        a=sc.nextInt();
        System.out.println("Enter Second Number");
        b=sc.nextInt();
        if(a>b){
            System.out.println("a is greater than b");
        }
        else if(a==b){
            System.out.println("Equal");
        }
        else{
            System.out.println("b is greater than a");
        }

        //Switch Statements
        char choice;
        System.out.println("Lets Greet!, Enter The choice \n a.Hello Peoples \n b.Namaste Peoples");
        choice=sc.next().charAt(0);

        switch(choice){                        //argument passed inside switch can be number/character/string.
            case 'a': System.out.println("Hello Peoples!");break;
            case 'b': System.out.println("Namaste Peoples!");break;
            default:System.out.println("Invalid Choice");
        }
    
    }
}