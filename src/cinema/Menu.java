package cinema;

import java.util.Scanner;

public class Menu {

    private Menu() {}

    public static int selectOption() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
