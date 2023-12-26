import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");

        double width = scanner.nextDouble();

        System.out.print("Enter the height of the rectangle: ");

        double height = scanner.nextDouble();

        double perimeter = 2 * (width + height);

        double surfaceArea = width * height;

        System.out.println("Perimeter of the rectangle: " + perimeter+ "m");
        System.out.println("Surface area of the rectangle: " + surfaceArea+ "m^2");

        scanner.close();
    }
}
