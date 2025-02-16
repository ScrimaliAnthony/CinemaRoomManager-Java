package cinema;

public class Cinema {

    public static void main(String[] args) {
        boolean isProgramContinue = true;
        int select;

        CinemaTheatre cinemaTheatre = new CinemaTheatre();

        while(isProgramContinue) {
            System.out.println(Display.menu());
            select = Menu.selectOption();

            switch(select) {
                case 0:
                    isProgramContinue = false;
                    break;
                case 1:
                    System.out.println(Display.cinemaTheatre(cinemaTheatre));
                    break;
                case 2:
                    System.out.println(Display.ticketPrice(cinemaTheatre));
                    break;
                case 3:
                    System.out.println(Display.numberOfPurchasedTickets(cinemaTheatre));
                    System.out.println(Display.percentageOfPurchasedTickets(cinemaTheatre));
                    System.out.println(Display.currentIncome(cinemaTheatre));
                    System.out.println(Display.calculateProfit(cinemaTheatre));
                    break;
                default:
                    System.out.println("You should enter a number between 0 and 3");
            }
        }
    }
}