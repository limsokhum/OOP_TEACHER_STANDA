import java.util.Scanner;

public class CountDigitsInFloatingPoint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for the floating-point number
        System.out.print("Enter a floating-point number: ");
        double inputNumber = scanner.nextDouble();

        // Convert the floating-point number to a string for easy manipulation
        String numberAsString = String.valueOf(inputNumber);

        // Split the string into integral and fractional parts
        String[] parts = numberAsString.split("\\.");

        // Count the number of digits in the integral and fractional parts
        int integralDigits = parts[0].length();
        int fractionalDigits = parts.length > 1 ? parts[1].length() : 0;

        // Display the result
        System.out.println("Number of digits in integral part: " + integralDigits);
        System.out.println("Number of digits in fractional part: " + fractionalDigits);

        // Close the scanner
        scanner.close();
    }
}
