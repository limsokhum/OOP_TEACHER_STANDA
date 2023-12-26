import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a piece of text: ");
        String inputText = scanner.nextLine();

        System.out.print("Enter specific letters to check: ");
        String specificLetters = scanner.nextLine();

        specificLetters = specificLetters.toLowerCase();

        String[] words = inputText.split("\\s+");

        int count = 0;

        System.out.println("Words containing specified letters:");

        for (String word : words) {
            if (containsSpecificLetters(word.toLowerCase(), specificLetters)) {
                System.out.println(word);
                count++;
            }
        }

        System.out.println("Total number of words containing specified letters: " + count);

        scanner.close();
    }

    private static boolean containsSpecificLetters(String word, String specificLetters) {
        for (char letter : specificLetters.toCharArray()) {
            if (word.contains(String.valueOf(letter))) {
                return true;
            }
        }
        return false;
    }
}
