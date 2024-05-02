package Chapter2;
/**
 *
 * class: Temperature
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * May 1, 2024
 * 2.17.5 Write a program that calculates the base area and volume of a cylinder, given the radius of the base circle and the length of the cylinder. Please use 3.1416 as the PI value.
 */
public class Cylinder {
    public static void main(String[] args) {
        // Prompt user for input
        System.out.print("Enter the radius of the cylinder base: ");
        double radius = 6.5;

        System.out.print("Enter the length of the cylinder: ");
        double length = 7.2;

        // Calculate base area (πr²)
        double baseArea = Math.PI * Math.pow(radius, 2);

        // Calculate volume (πr²h)
        double volume = baseArea * length;

        // Display results
        System.out.printf("Base Area of the Cylinder: %.2f square units%n", baseArea);
        System.out.printf("Volume of the Cylinder: %.2f cubic units%n", volume);
    }
}
