import java.util.Scanner;

public class RielsToDollarConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for the amount in Riels
        System.out.print("Enter the amount in Riels: ");
        double amountInRiels = scanner.nextDouble();

        // Conversion rate
        double conversionRate = 4000;

        // Convert Riels to Dollars
        double amountInDollars = amountInRiels / conversionRate;

        // Display the result
        System.out.println("Converted amount in Dollars: $" + amountInDollars);

        // Close the scanner
        scanner.close();
    }
}
