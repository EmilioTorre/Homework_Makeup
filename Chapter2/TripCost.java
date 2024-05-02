package Chapter2;
/**
 *
 * class: Temperature
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 2.17.12 Write a program to calculate the cost of a trip. The program prompts user to enter the distance in miles of the trip, the car efficiency in miles per gallon, and the cost of gas in dollars per gallon. Please limit the print out of the cost to two decimal digits using printf.
 */
import java.util.Scanner;
public class TripCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the distance of the trip (in miles): ");
        double distance = scanner.nextDouble();

        System.out.print("Enter car efficiency (miles per gallon): ");
        double efficiency = scanner.nextDouble();

        System.out.print("Enter gas cost (dollars per gallon): ");
        double gasCost = scanner.nextDouble();

        // Calculate total cost
        double totalCost = (distance / efficiency) * gasCost;

        // Display cost with two decimal places
        System.out.printf("Total cost of the trip: $%.2f%n", totalCost);
    }
}
