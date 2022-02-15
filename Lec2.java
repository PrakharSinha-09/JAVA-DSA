/*
AGENDA for this lecture:
1- In this lecture we will see how we can print the output and take user input. 
2- variables in java
*/
import java.util.Scanner;
class Lec2{
    public static void main(String[] args){

        //Output
        System.out.println("Hello World! Lets Start With The Most Beautiful Programming Language");
        System.out.println("Hello World! Yes i meant JAVA");

        //Variables
        int a=9;
        int b=10;
        String name="Prakhar";

        //Use Input in Java
        //we need to import scanner class.
        Scanner sc=new Scanner(System.in);          
        int c;
        System.out.println("Taking User Input");
        c=sc.nextInt();
        System.out.println(c);

        String namee;
        System.out.println("Enter The String");
        namee=sc.nextLine();
        System.out.println(namee);
        
    }
}