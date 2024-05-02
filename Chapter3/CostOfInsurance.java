package Chapter3;
/**
 *
 * class: Temperature
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 3.11.6 Write a program to calculate the cost of car insurance based on the driver age and number of accidents. The base insurance cost is $300. if the driver age is below 27, there is a surcharge of $100. the additional surcharge for accidents is shown below:
 * Surcharge Per accidents
 * Number of accidents          Surcharge
 * 1                            $100
 * 2                            $150
 * 3                            $250
 * 4 or more                    $1000
 */
import java.util.Scanner;
public class CostOfInsurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Base insurance cost
        double baseCost = 300.0;

        // Prompt user for input
        System.out.print("Enter driver's age: ");
        int age = scanner.nextInt();

        System.out.print("Enter number of accidents: ");
        int accidents = scanner.nextInt();

        // Apply surcharges
        if (age < 27) {
            baseCost += 100.0;
        }
        if (accidents == 1) {
            baseCost += 100.0;
        } else if (accidents == 2) {
            baseCost += 150.0;
        } else if (accidents == 3) {
            baseCost += 250.0;
        } else if (accidents >= 4) {
            baseCost += 1000.0;
        }

        // Display the total cost
        System.out.printf("Total insurance cost: $%.2f%n", baseCost);
    }
}
