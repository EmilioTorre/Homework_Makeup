package Chapter2;
/**
 *
 * class: Temperature
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 2.17.10 Write a program to calculate how many mile, feet, and inches a person walks a day, given the stride length in inches (the stride length is measured from heel to heel and determines how far you walk with each step), the number of steps per minute, and the minutes that person walks a day. Note that 1 mile is 5280 feet and 1 feet is 12 inches. In your program, there should be the following constants:
 * final int FEET_PER_MILE = 5280;
 * final int INCHES_PER_FEET = 12;
 * final int INCHES_PER_MILE = FEET_PER_MILE * INCHES_PER_FEET;
 */
import java.util.Scanner;
public class WalkingDistance {
    public static void main(String[] args) {
        final int FEET_PER_MILE = 5280;
        final int INCHES_PER_FEET = 12;
        final int INCHES_PER_MILE = FEET_PER_MILE * INCHES_PER_FEET;

        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the stride length in inches: ");
        int strideLengthInches = scanner.nextInt();

        System.out.print("Enter the average strides per minute: ");
        int avgStridesPerMinute = scanner.nextInt();

        System.out.print("Enter minutes walked: ");
        int minutesWalked = scanner.nextInt();

        // Calculate total inches walked
        int totalInches = strideLengthInches * avgStridesPerMinute * minutesWalked;

        // Convert to miles, feet, and remaining inches
        int totalMiles = totalInches / INCHES_PER_MILE;
        int remainingFeet = (totalInches % INCHES_PER_MILE) / INCHES_PER_FEET;
        int remainingInches = totalInches % INCHES_PER_FEET;

        // Display results
        System.out.println("Distance walked:");
        System.out.println("Miles: " + totalMiles);
        System.out.println("Feet: " + remainingFeet);
        System.out.println("Inches: " + remainingInches);
    }
}
