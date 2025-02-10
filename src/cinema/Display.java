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

        return builder.append("Total income:\n$").append(CinemaTheatre.calculateProfit(cinemaTheatre)).toString();
    }
}