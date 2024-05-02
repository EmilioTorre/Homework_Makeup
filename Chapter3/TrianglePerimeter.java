package Chapter3;
/**
 *
 * class: Temperature
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 3.11.8 Write a program that prompts the user to enter the length of the three edges of a triangle. The program calculates the perimeter of the triangle if the input is valid, otherwise it prints invalid input. The input is valid if the sum of every pair of two edges is greater than the remaining edge.
 */
import java.util.Scanner;
public class TrianglePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of edge 1: ");
        double edge1 = scanner.nextDouble();

        System.out.print("Enter the length of edge 2: ");
        double edge2 = scanner.nextDouble();

        System.out.print("Enter the length of edge 3: ");
        double edge3 = scanner.nextDouble();

        if (edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1) {
            double perimeter = edge1 + edge2 + edge3;
            System.out.printf("Perimeter of the triangle: %.2f%n", perimeter);
        } else {
            System.out.println("Invalid input. The sum of any two edges must be greater than the remaining edge.");
        }
    }
}
