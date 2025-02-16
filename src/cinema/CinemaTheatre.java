package cinema;

import java.util.Scanner;

public class CinemaTheatre {
    Scanner scanner = new Scanner(System.in);

    private final int rows;
    private final int cols;
    private final char[][] cinemaTheatre;
    private int currentIncome = 0;

    public CinemaTheatre() {
        int[] dimensions = askForDimensions();
        this.rows = dimensions[0];
        this.cols = dimensions[1];
        cinemaTheatre = new char[rows][cols];
        initializeSeats();
    }

    private int[] askForDimensions() {
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int cols = scanner.nextInt();
        return new int[]{rows, cols};
    }

    private void initializeSeats() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                cinemaTheatre[i][j] = 'S';
            }
        }
    }

    public static int calculateProfit(CinemaTheatre cinemaTheatre) {
        int rows = cinemaTheatre.getRows();
        int cols = cinemaTheatre.getCols();
        int totalSeats = rows * cols;
        int profit = 0;

        if (totalSeats <= 60) {
            profit = totalSeats * 10;
        } else {
            int frontHalfRows = rows / 2;
            int backHalfRows = rows - frontHalfRows;

            profit += frontHalfRows * cols * 10;
            profit += backHalfRows * cols * 8;
        }

        return profit;
    }

    public int ticketPrice() {
        int[] seatLocation = chooseSeat();
        int row = seatLocation[0];

        int rows = getRows();
        int cols = getCols();
        int totalSeats = rows * cols;

        if(totalSeats < 60) {
            increaseCurrentIncome(10);
            return 10;
        } else {
            int frontHalfRows = rows / 2;
            int backHalfRows = rows - frontHalfRows;

            if(row >= backHalfRows) {
                increaseCurrentIncome(8);
                return 8;
            } else {
                increaseCurrentIncome(10);
                return 10;
            }
        }
    }

    public int[] chooseSeat() {
        boolean isChoosing = true;
        int row = 0;
        int col = 0;
        while(isChoosing) {
            System.out.println("Enter a row number:");
            row = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            col = scanner.nextInt();

            if(row > rows || col > cols) {
                System.out.println("Wrong input!");
                continue;
            }
            if(cinemaTheatre[row - 1][col - 1] == 'B') {
                System.out.println("That ticket has already been purchased!");
            } else {
                cinemaTheatre[row - 1][col - 1] = 'B';
                isChoosing = false;
            }
        }
        return new int[]{row, col};
    }

    public int numberOfPurchasedTickets() {
        int nbPurchasedTickets = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(cinemaTheatre[i][j] == 'B') {
                    nbPurchasedTickets += 1;
                }
            }
        }
        return nbPurchasedTickets;
    }

    public float percentageOfPurchasedTickets() {
        float totalSeats = rows * cols;
        float nbPurchasedTickets = numberOfPurchasedTickets();
        float percentage = (nbPurchasedTickets / totalSeats) * 100;

        percentage = Math.round(percentage * 100) / 100f;

        return percentage;
    }

    public int increaseCurrentIncome(int ticketPrice) {
        return currentIncome += ticketPrice;
    }

    public int getCurrentIncome() {
        return currentIncome;
    }

    public char getCinemaTheatreSeat(int i, int j) {
        return cinemaTheatre[i][j];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public String getTitle() {
        return "Cinema:";
    }


}
