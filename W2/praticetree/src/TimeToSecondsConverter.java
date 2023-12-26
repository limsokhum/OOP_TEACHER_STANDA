import java.util.Scanner;

public class TimeToSecondsConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for hours, minutes, and seconds from the user
        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();

        // Convert hours, minutes, and seconds to total seconds
        long totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        // Display the result
        System.out.println("Number of seconds: "+hours +"x"+"3600"+"+"+minutes+"x"+"60" +"="+ totalSeconds);

        // Close the scanner
        scanner.close();
    }
}
