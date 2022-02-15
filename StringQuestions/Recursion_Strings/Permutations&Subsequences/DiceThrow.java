import java.util.ArrayList;

/*
AGENDA: To return the all combinations possible to make the certain number.
*/
public class DiceThrow {
    static void diceCombinations(String p,int target)
    {
        if(target==0)
        {
            System.out.println(p);
            return;
        }

        for(int i=1;i<=6 && i<=target;i++)                       //i<=6 as dice maximum value is 6
        {
            diceCombinations(p+i, target-i);                     //here i should be less than target, as no. in processed must be less than target(very obvious)
        }
    }

    //Now Lets try to return an arrayList for the same.

    static ArrayList<String> diceCombi(String p,int target)
    {
        ArrayList<String> li=new ArrayList<>();
        if(target==0)
        {
            li.add(p);
            return li;
        }

        for(int i=1;i<=6 && i<=target;i++)
        {
            li.addAll(diceCombi(p+i, target-i));           
        }
        return li;
    }


    //What if, if the dice comes up with the custom face? no worries just add one more arguments int face and your loop uptill there!
    public static void main(String[] args) {
        diceCombinations("", 4);
        System.out.println(diceCombi("", 4));
    }
}
