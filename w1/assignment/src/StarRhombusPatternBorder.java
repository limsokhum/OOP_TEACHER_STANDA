import java.util.Scanner;

public class StarRhombusPatternWithBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows  ");
        int rows = scanner.nextInt();

        if (rows % 2 == 0) {
            System.out.println("Please umber of rows.");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < Math.abs(rows / 2 - i); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * (rows / 2 - Math.abs(rows / 2 - i)) + 1; j++) {
                if (j == 0 || j == 2 * (rows / 2 - Math.abs(rows / 2 - i))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
