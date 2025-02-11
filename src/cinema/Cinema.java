package cinema;

public class Cinema {

    public static void main(String[] args) {
        CinemaTheatre cinemaTheatre = new CinemaTheatre();
        System.out.println(Display.cinemaTheatre(cinemaTheatre));
        System.out.println(Display.ticketPrice(cinemaTheatre));
        System.out.println(Display.cinemaTheatre(cinemaTheatre));
    }
}