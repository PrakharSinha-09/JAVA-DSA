import java.util.Scanner;

class AgeRestriction extends Exception {
    AgeRestriction(String message)
    {
        System.out.println(message);
    }
}

public class CustomException {
    public static void main(String[] args) throws AgeRestriction {
        int age=17;
        if (age < 18) {
            throw new AgeRestriction("You Cannot Drive as You are under 18!");
        } else {
            System.out.println("Congrats! you are eligible for driving");
        }
    }

}
