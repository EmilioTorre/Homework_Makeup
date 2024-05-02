package Chapter3;
/**
 *
 * class: Temperature
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 3.11.2 Write a program that prompts the user to enter the radius of a circle and calculates the area for that circle. The program should check the entered number. if the entered number is negative, the program prints Invalid Entry, the radius should be positive and quits. Otherwise, the program should calculate the area of the circle and prints The area of a circle with radius "the radius value entered by the user" is "The calculated value of the circle area". (Hint: Circle area = π * radius * radius)
 */
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the radius of a circle: ");
        double radius = scanner.nextDouble();

        if (radius < 0) {
            System.out.println("Invalid Entry. The radius should be positive.");
        } else {
            // Calculate the area of the circle
            double area = Math.PI * Math.pow(radius, 2);
            System.out.printf("The area of a circle with radius %.2f is %.2f%n", radius, area);
        }
    }
}
