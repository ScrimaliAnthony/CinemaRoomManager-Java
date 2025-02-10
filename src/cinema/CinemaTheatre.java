package cinema;

import java.util.Scanner;

public class CinemaTheatre {
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

    public static int[] askForDimensions() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of seats in each row:");
        int cols = scanner.nextInt();
        return new int[]{rows, cols};
    }

    public void initializeSeats() {
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
