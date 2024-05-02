package Chapter2;
/**
 *
 * class: Temperature
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 2.17.11 Write a program that prompts user to enter the weight in pounds (real value) and height in feet and inches (both integers) and then calculates the BMI of the person. Please limit the print out of the BMI value to two decimal digits using printf.
 * Note that
 * 1 kilogram is 2.2 pounds.
 * 1 inch is 0.0254 meters.
 * Your program first need to convert pounds to kilograms (i.e. pounds/2.2) and inches to meters (i.e. inches * 0.0254) and then use the following formula to calculate BMI:
 * kilogram / (meter)^2
*/
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        System.out.print("Enter height in feet: ");
        int heightFeet = scanner.nextInt();

        System.out.print("Enter height in inches: ");
        int heightInches = scanner.nextInt();

        // Convert weight to kilograms
        double weightKilograms = weightPounds / 2.2;

        // Convert height to meters
        double heightMeters = (heightFeet * 0.3048) + (heightInches * 0.0254);

        // Calculate BMI
        double bmi = weightKilograms / (heightMeters * heightMeters);

        // Display BMI with two decimal places
        System.out.printf("BMI: %.2f%n", bmi);
    }
}
