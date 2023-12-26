import java.util.Scanner;

public class PrintRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Print the top border
        for (int i = 0; i < columns; i++) {
            System.out.print("* ");
        }
        System.out.println();  // Move to the next line

        // Print the sides with inner content
        for (int i = 0; i < rows - 2; i++) {
            System.out.print("* ");  // Left border

            // Print spaces for inner content
            for (int j = 0; j < columns - 2; j++) {
                System.out.print("  ");
            }

            System.out.println("*");  // Right border
        }

        // Print the bottom border
        for (int i = 0; i < columns; i++) {
            System.out.print("* ");
        }
    }
}
