package cinema;

import java.util.Scanner;

public class CinemaTheatre {
    Scanner scanner = new Scanner(System.in);

    private final int rows;
    private final int cols;
    private final char[][] cinemaTheatre;

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
            return 10;
        } else {
            int frontHalfRows = rows / 2;
            int backHalfRows = rows - frontHalfRows;

            if(row >= backHalfRows) {
                return 8;
            } else {
                return 10;
            }
        }
    }

    public int[] chooseSeat() {
        System.out.println("Enter a row number:");
        int row = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int col = scanner.nextInt();
        cinemaTheatre[row - 1][col - 1] = 'B';
        return new int[]{row, col};
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
