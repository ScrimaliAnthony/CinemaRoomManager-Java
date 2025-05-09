package cinema;

public class Display {

    private Display() {}

    public static String cinemaTheatre(CinemaTheatre cinemaTheatre) {
        StringBuilder builder = new StringBuilder();

        builder.append(cinemaTheatre.getTitle()).append("\n").append("  ");
        for(int i = 1; i <= cinemaTheatre.getCols(); i++) {
            builder.append(i).append(" ");
        }
        builder.append("\n");

        for (int i = 0; i < cinemaTheatre.getRows(); i++) {
            builder.append(i + 1).append(" ");
            for (int j = 0; j < cinemaTheatre.getCols(); j++) {
                builder.append(cinemaTheatre.getCinemaTheatreSeat(i, j)).append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    public static String calculateProfit(CinemaTheatre cinemaTheatre) {
        StringBuilder builder = new StringBuilder();

        return builder.append("Total income: $").append(CinemaTheatre.calculateProfit(cinemaTheatre)).toString();
    }

    public static String ticketPrice(CinemaTheatre cinemaTheatre) {
        StringBuilder builder = new StringBuilder();

        return builder.append("Ticket price: $").append(cinemaTheatre.ticketPrice()).toString();
    }

    public static String numberOfPurchasedTickets(CinemaTheatre cinemaTheatre) {
        return "Number of purchased tickets: " + cinemaTheatre.numberOfPurchasedTickets();
    }

    public static String percentageOfPurchasedTickets(CinemaTheatre cinemaTheatre) {
        float percentage = cinemaTheatre.percentageOfPurchasedTickets();
        return String.format("Percentage: %.2f%%", percentage);
    }

    public static String currentIncome(CinemaTheatre cinemaTheatre) {
        return "Current income: $" + cinemaTheatre.getCurrentIncome();
    }

    public static String menu() {

        return """
                1. Show the seats
                2. Buy a ticket
                3. Statistics
                0. Exit
                """;
    }
}