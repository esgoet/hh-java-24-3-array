import java.util.Scanner;

public class ScanUserInput {
    public static void main(String[] args) {
        // create scanner object from the Scanner class
        Scanner scanner = new Scanner(System.in);

        // instruct user
        System.out.println("Please enter a word:");

        // wait for user input
        String word = scanner.nextLine();

        // if user didn't write anything, keep asking for input
        while (word.isEmpty()) {
            // instruct user
            System.out.println("Try again:");

            // wait for user input
            word = scanner.nextLine();
        }

        // put out each letter from the user input individually
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

    }
}
