import java.util.Scanner;

public class StarRhombusPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        if (rows % 2 == 0) {
            System.out.println("Please number of rows.");
            return;
        }

        for (int i = 0; i < rows / 2 + 1; i++) {

            for (int j = 0; j < rows / 2 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = rows / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < rows / 2 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
