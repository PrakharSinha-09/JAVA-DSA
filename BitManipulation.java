/*
AGENDA: to work on bits--> BitManipulation
*/

import java.util.*;

public class BitManipulation {
    public static void main(String[] args) {

        //getBit method
        int n=5;     //0101
        int pos=2;
        int bitMask=1<<pos;

        if((bitMask & n)==0)
        {
            System.out.println("bit is zero");
        }
        else
        {
            System.out.println("bit is 1");
        }

        //setBit method
        int posi=1;
        int bitmask=1<<posi;
        int newNo= bitmask | n;
        System.out.println(newNo);

        //clearBit
        int posit=2;
        int bitmaskk=1<<posit;
        int notBitMask=~bitmaskk;
        int newNum= notBitMask | n;
        System.out.println(newNum);

        //updateBit
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper=1 -> set; oper=0 -> clear
        int m = 5;
       int post = 1;
      
       int bitMaski = 1<<post;
       if(oper == 1) {                   //to convert in 1
           //set
           int newNumber = bitMask | n;
           System.out.println(newNumber);
       } else {
        //clear
        int newBitMask = ~(bitMask);        //to convert in 0
        int newNumber = newBitMask & n;
        System.out.println(newNumber);
       }
 

    }
}
