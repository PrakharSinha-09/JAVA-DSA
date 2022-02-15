public class Enums {
    enum Week
    {
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;     
        //these are enum constants
        //they are publuc , static and final
        //since its final you cant create child enums
        //type is Week

        Week()
        {
            System.out.println("Constuctor called for"+ this);
        }
    }
    public static void main(String[] args) {
        Week week;
        week=Week.Monday;            //we cannnot access constructor explicitly...even if we try to access any one it will call the constructor for evry constant

        // for(Week day: Week.values())
        // {
        //     System.out.println(day);
        // }

        // System.out.println(week.ordinal());         //will return position of enum declaration here monday's position will be returned
    }
}
