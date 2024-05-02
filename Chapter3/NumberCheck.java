package Chapter3;
/**
 *
 * class: Temperature
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 3.11.4 Write a program that prompts the user to enter a number and check the following:
 * if the number is divisible by 3 and 5, the program prints the number is a multiple of 3 and a multiple of 5
 * if the number is divisible by 3 or 5, the program prints the number is a multiple of either 3 or 5.
 * if the number is divisible by only one of the numbers, the program prints the number is divisible by either 3 or 5 but not both.
 */
import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check divisibility
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        if (divisibleBy3 && divisibleBy5) {
            System.out.println("The number is a multiple of 3 and a multiple of 5.");
        } else if (divisibleBy3 || divisibleBy5) {
            System.out.println("The number is a multiple of either 3 or 5.");
        } else {
            System.out.println("The number is divisible by either 3 or 5 but not both.");
        }
    }
}
