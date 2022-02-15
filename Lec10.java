/*
AGENDA: here we are going to study about arrays.
ARRAYS are basically the collecton of variables of similar data types.
*/

import java.util.Scanner;
class Lec10{
    public static void main(String[] args){
        //Defining an array
        //type[] arrayName[]=new type[];   OR   type arrayName[]=new type[];
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter The size of an array");
        size=sc.nextInt();
        int[] marks=new int[size];

        for(int i=0;i<size;i++)
        {
            marks[i]=sc.nextInt();
        }

        System.out.println("Array Elements:");
        for(int i=0;i<size;i++)
        {
            System.out.print(marks[i]+" ");
        }
        // marks[0]=97;
        // marks[1]=98;
        // marks[2]=99;
        //System.out.println(marks[0]);

        

    
    }
}