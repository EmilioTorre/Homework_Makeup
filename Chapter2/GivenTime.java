package Chapter2;
/**
 *
 * class: Temperature
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140
 * sec: 3 Spring 2024
 * May 1, 2024
 * 2.17.6 Write a program that convert a given total number of seconds into hours, minutes and seconds. It should (1) prompt the user for input, (2) read an integer from the keyboard, (3) calculate the result, and (4) display the output.
 * The following are two examples:
 * if the total number of seconds is 125, it is 0 hours, 2 minutes and 5 seconds.
 * If the total seconds is 7450, it is 2 hours, 4 minutes and 10 seconds.
 */
import java.util.Scanner;
public class GivenTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the total number of seconds: ");
        int totalSeconds = scanner.nextInt();

        // Calculate hours, minutes, and remaining seconds
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        // Display the result
        System.out.printf("Converted time: %d hours, %d minutes, %d seconds%n", hours, minutes, seconds);
    }
}
