package Chapter2;
/**
 *
 * class: Temperature
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 2.17.4 Write a program that converts a temperature from Celsius to Fahrenheit. It should
 * prompt the user for input,
 * read a double value from the keyboard,
 * calculate the result,
 * format the output to one decimal place using printf.
 * Here is the formula. Be careful not to use integer division! F = 9/5 C + 32
 */
import java.util.Scanner;
public class TemperatureConversion {
    public static void main(String[] args) {
        // Prompt for input
        System.out.print("Enter temperature in Celsius: ");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        scanner.close();

        // Calculate Fahrenheit
        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        // Display result with one decimal place
        System.out.printf("Temperature in Fahrenheit: %.1f%n", fahrenheit);
    }
}
