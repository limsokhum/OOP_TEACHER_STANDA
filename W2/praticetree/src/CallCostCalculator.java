import java.util.Scanner;

public class CallCostCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for Time Start
        System.out.println("Enter Time Start:");
        int startHours = getInput("Hours: ");
        int startMinutes = getInput("Minutes: ");
        int startSeconds = getInput("Seconds: ");

        // Get input for Time End
        System.out.println("\nEnter Time End:");
        int endHours = getInput("Hours: ");
        int endMinutes = getInput("Minutes: ");
        int endSeconds = getInput("Seconds: ");

        // Calculate total seconds for Time Start and Time End
        long startTimeInSeconds = startHours * 3600 + startMinutes * 60 + startSeconds;
        long endTimeInSeconds = endHours * 3600 + endMinutes * 60 + endSeconds;

        // Calculate the duration of the call in seconds
        long callDurationInSeconds = endTimeInSeconds - startTimeInSeconds;

        // Calculate total minutes and cost of the call
        int totalMinutes = (int) Math.ceil(callDurationInSeconds / 60.0); // Round up to the nearest minute
        double callCost = totalMinutes * 0.05;

        // Display the result
        System.out.println("\nTotal Minutes Called: " + totalMinutes);
        System.out.println("Total Cost of the Call: $" + callCost);

        // Close the scanner
        scanner.close();
    }

    // Helper method to get input for hours, minutes, and seconds
    private static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }
}
