import java.io.*;
import java.util.*;
import java.security.*;


/*
Secure Hash Algorithm 2 (SHA-2) is a set of cryptographic hash functions designed by the National Security Agency (NSA).
It consists of six identical hashing algorithms (i.e., SHA-256, SHA-512, SHA-224, SHA-384, SHA-512/224, SHA-512/256)
with a variable digest size. SHA-256 is a -bit ( byte) hashing algorithm
which can calculate a hash code for an input of up to 264-1 bits. 
It undergoes  rounds of hashing and calculates a hash code that is a 64-digit hexadecimal number.
*/
public class CryptographicHashFunction {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner input = new Scanner(System.in);
        MessageDigest m = MessageDigest.getInstance("SHA-256");       //SHA stands for SECURE HASH ALGORITHM
        m.reset();
        m.update(input.nextLine().getBytes());
        for (byte i : m.digest()) {
            System.out.print(String.format("%02x", i));
        }
        System.out.println();
    }
}

