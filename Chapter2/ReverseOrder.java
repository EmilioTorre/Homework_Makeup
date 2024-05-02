package Chapter2;
/**
 *
 * class: Temperature
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 2.17.8 Write a program that prompts the user to enter a number between 0 and 1000 (not including 1000) and print the digits in reverse order.
 */
import java.util.Scanner;
public class ReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number between 0 and 999: ");
        int number = scanner.nextInt();

        // Validate input range
        if (number < 0 || number >= 1000) {
            System.out.println("Invalid input. Please enter a number between 0 and 999.");
        }
        else {
            // Reverse the digits
            int reversedNumber = 0;
            while (number > 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }

            System.out.println("Reversed number: " + reversedNumber);
        }
    }
}
