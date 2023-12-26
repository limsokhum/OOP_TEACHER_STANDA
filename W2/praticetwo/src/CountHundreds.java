import java.util.Scanner;

public class CountHundreds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int countHundreds = countHundreds(number);

        System.out.println("The number of hundreds in " + number + " is: " + countHundreds);

        scanner.close();
    }

    private static int countHundreds(int number) {

        if (number < 0) {
            System.out.println("Error: Please enter a non-negative number.");
            System.exit(1);
        }

        return number / 100;
    }
}
