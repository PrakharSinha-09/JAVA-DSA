/*
AGENDA: To study inheritance and its types
*/

class Box
{
    private double l;
    double h;
    double w;
//    double weight;

    static void greeting() {
        System.out.println("Hey, I am in Box class. Greetings!");
    }

    public double getL() {
        return l;
    }

    Box () {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    Box (double side) {
        // super(); Object class
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w) {
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
}

class BoxWeight extends Box
{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

//    @Override
   

    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        // used to initialise values present in parent class
        super(l, h, w); // what is this? call the parent class constructor
//        System.out.println(super.weight);
        this.weight = weight;
    }
}

class BoxPrice extends BoxWeight
{
    double cost;
    BoxPrice()
    {
        super();
        this.cost=-1;
    }

    BoxPrice(BoxPrice other)
    {
        super(other);
        this.cost=other.cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }

    
}
class Inheritance{

    public static void main(String[] args) {
        // Box box5 = new BoxWeight(2, 3, 4, 8);
        // System.out.println(box5.w);

        BoxPrice box=new BoxPrice();
        System.out.println(box.cost);   
    }
}