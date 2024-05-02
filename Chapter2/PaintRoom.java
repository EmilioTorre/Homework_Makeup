package Chapter2;
/**
 *
 * class: Temperature
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 2.17.7 Given the length, width and height of the room, number of windows and number doors, the program will calculate the gallons and quarts of paint are needed to paint the room. For gallons, print an integer value. For the quarts, print a real number, no need to round down to integer.
 * Assume that (1) ceiling is painted, (2) 1 gallon of paint covers about 350 square feet, (3) each window is 15 square feet, and (4) each door is 21 square feet.
 */
import java.util.Scanner;
public class PaintRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the length of the room (in feet): ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the room (in feet): ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the room (in feet): ");
        double height = scanner.nextDouble();

        System.out.print("Enter the number of windows: ");
        int numWindows = scanner.nextInt();

        System.out.print("Enter the number of doors: ");
        int numDoors = scanner.nextInt();

        // Calculate total surface area of walls (excluding windows and doors)
        double wallArea = 2 * (length * height + width * height);

        // Calculate area of windows and doors
        double windowArea = numWindows * 15;
        double doorArea = numDoors * 21;

        // Calculate remaining surface area after subtracting windows and doors
        double remainingArea = wallArea - (windowArea + doorArea);

        // Calculate gallons of paint needed (1 gallon covers 350 sq. ft.)
        int gallonsNeeded = (int) Math.ceil(remainingArea / 350.0);

        // Calculate remaining paint in quarts
        double remainingPaintQuarts = (remainingArea % 350) / 87.5; // 1 quart = 87.5 sq. ft.

        // Display results
        System.out.println("Gallons of paint needed: " + gallonsNeeded);
        System.out.printf("Remaining paint in quarts: %.2f%n", remainingPaintQuarts);
    }
}
