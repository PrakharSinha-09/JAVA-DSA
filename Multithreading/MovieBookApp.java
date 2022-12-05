class BookSeats
{
    int total_seats=10;
    synchronized void bookSeat(int seats)
    {
        if(total_seats>=seats)
        {
            System.out.println("Seat  Booked Successfully!");
            total_seats=total_seats-seats;
            System.out.println("Seats Left"+ total_seats);
        }
        else{
            System.out.println("Booking Failed!");
            System.out.println("Seats Left"+ total_seats);
        }
    }
}

public class MovieBookApp extends Thread {
    static BookSeats b;
    int seats;
    public void run()
    {
        b.bookSeat(seats);
    }
    public static void main(String[] args) {
        b=new BookSeats();

        MovieBookApp amit=new MovieBookApp();
        amit.seats=7;
        amit.start();

        MovieBookApp deepak=new MovieBookApp();
        deepak.seats=7;
        deepak.start();
    }
}
