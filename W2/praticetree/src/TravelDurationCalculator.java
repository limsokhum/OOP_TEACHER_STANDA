import java.util.Scanner;

public class TravelDurationCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        int distanceInKm = 7;
        int averageSpeedInKmh = 30;

        // Get input for the traffic jam factor as a percentage
        System.out.print("Enter the traffic jam factor (as a percentage): ");
        int trafficJamFactor = scanner.nextInt();

        // Calculate adjusted speed based on traffic jam factor
        double adjustedSpeed = averageSpeedInKmh - (averageSpeedInKmh * (trafficJamFactor / 100.0));

        // Calculate duration in hours
        double travelTimeInHours = distanceInKm / adjustedSpeed;

        // Convert hours to HH:mm:ss format
        long hours = (long) travelTimeInHours;
        long minutes = (long) ((travelTimeInHours - hours) * 60);
        long seconds = (long) (((travelTimeInHours - hours) * 60 - minutes) * 60);

        // Display the result
        System.out.println("Estimated Travel Duration: " + String.format("%02d:%02d:%02d", hours, minutes, seconds));

        // Close the scanner
        scanner.close();
    }
}
