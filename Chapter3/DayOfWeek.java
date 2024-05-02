package Chapter3;
/**
 *
 * class: Temperature
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 3.11.5 Write a program that prompts the user to enter the day of the week as an integer between 1 and 7, for Sunday through Saturday, and prints week day for entries 1 through 5 inclusive, and weekend for 6 and 7. for all other entries, the program prints invalid week day.
 */
import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7) representing the day of the week: ");
        int dayOfWeek = scanner.nextInt();

        if (dayOfWeek >= 1 && dayOfWeek <= 5) {
            System.out.println("Weekday");
        } else if (dayOfWeek == 6 || dayOfWeek == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid weekday");
        }
    }
}
