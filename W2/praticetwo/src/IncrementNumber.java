import java.util.Scanner;

public class IncrementNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pleas input a positive number: ");
        int inputNumber = scanner.nextInt();

        int resultNumber = inputNumber + 1;

        System.out.println("I got " +  resultNumber +  " I am luckier");

        scanner.close();
    }
}
