package Chapter3;
/**
 *
 * class: Temperature
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 3.11.7  Write a Program that prompts the user to enter a string/word and prints them in alphabetical order.
 */
import java.util.Scanner;
import java.util.Arrays;
public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to an array of characters
        char[] charArray = input.toCharArray();

        // Sort the array in alphabetical order
        Arrays.sort(charArray);

        // Create a new string from the sorted array
        String sortedString = new String(charArray);

        // Display the sorted string
        System.out.println("Alphabetical order: " + sortedString);
    }
}
