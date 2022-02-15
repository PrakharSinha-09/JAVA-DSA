
class shapes
{
    int a=10;
    void area()
    {
        System.out.println("Area iN Shapes");
    }

    void perimeter()
    {
        System.out.println("Perimeter iN Shapes");
    }
}

class triangle extends shapes
{
    void area()
    {
        System.out.println("Area of Triangle is 1/2*b*h");
    }
}

class square extends shapes
{
    int a=5;
    void area()
    {
        System.out.println("Area of square is side*side");
    }

    void perimeter()
    {
        System.out.println("Perimeter iN Square");
    }

    
}
public class mainn
{
    public static void main(String[] args) {
        shapes sh=new shapes();
        triangle tri=new triangle();
        square sq=new square();

        shapes sa=new square();
        sa.area();
        sa.perimeter();
        System.out.println(sa.a);        //remember variables never get overriden...means its a thing depends onf type of reference variables

    }
}