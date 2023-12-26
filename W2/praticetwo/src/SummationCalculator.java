import java.util.Scanner;

public class SummationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end number: ");
        int end = scanner.nextInt();

        System.out.print("Enter the increment: ");
        int increment = scanner.nextInt();

        int summation = calculateSum(start, end, increment);
        System.out.println("The summation is: " + summation);

        scanner.close();
    }

    private static int calculateSum(int start, int end, int increment) {
        if (start > end) {
            return 0;
        } else {
            return start + calculateSum(start + increment, end, increment);
        }
    }
}
