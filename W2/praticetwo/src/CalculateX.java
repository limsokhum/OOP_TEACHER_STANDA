import java.util.Scanner;

public class CalculateX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of y: ");
        double y = scanner.nextDouble();

        System.out.print("Enter the value of z: ");
        double z = scanner.nextDouble();

        if (y == 0 || z == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            double x = 1 / ((1 / y) + (1 / z));

            System.out.println("The value of x is: " + x);
        }

        scanner.close();
    }
}
