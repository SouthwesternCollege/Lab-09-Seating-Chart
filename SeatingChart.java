
import java.util.Scanner;

/**
 * Your program description here
 * @author Your name here
 */
public class SeatingChart {

    public static void fillEmpty(String[][] chart) {
        // TODO
    }

    public static void assignSeat(String[][] chart, int row, int col, String name) {
        // TODO
    }

    public static void printChart(String[][] chart) {
        // TODO
    }

    public static int countFilledSeats(String[][] chart) {
        return 0;
    }

    public static int countEmptySeats(String[][] chart) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter rows:");
        int rows = input.nextInt();

        System.out.println("Enter columns:");
        int cols = input.nextInt();

        String[][] chart = new String[rows][cols];

        fillEmpty(chart);

        System.out.println("How many students?");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Name:");
            String name = input.nextLine();

            System.out.println("Row:");
            int r = input.nextInt();

            System.out.println("Column:");
            int c = input.nextInt();
            input.nextLine();

            assignSeat(chart, r, c, name);
        }

        printChart(chart);

        System.out.println("Filled: " + countFilledSeats(chart));
        System.out.println("Empty: " + countEmptySeats(chart));
    }
}
