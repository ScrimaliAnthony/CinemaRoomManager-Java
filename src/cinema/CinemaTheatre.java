package cinema;

import java.util.Arrays;

public class CinemaTheatre {
    private int rows = 7;
    private int cols = 8;
    private String title = "Cinema:";
    private char seats = 'S';
    private final char[][] cinemaTheatre = new char[rows][cols];

    public CinemaTheatre() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                cinemaTheatre[i][j] = seats;
            }
        }
    }

    public char[][] getCinemaTheatre() {
        return cinemaTheatre;
    }

    public char getCinemaTheatreSeat(int i, int j) {
        return cinemaTheatre[i][j];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public char getSeats() {
        return seats;
    }

    public void setSeats(char seats) {
        this.seats = seats;
    }
}
