package Chapter2;
/**
 *
 * class: Temperature
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 2.17.1 Write a program to convert 100 Fahrenheit to the corresponding temperature in Celsius. User proper variable names for the temperature in Fahrenheit and thee temperature in Celsius. Include a proper arithmetic expression to do the conversion.
 */
public class Temperature {
    public static void main(String[] args) {
        // Variable for temperature in Fahrenheit
        double tempFahrenheit = 100;

        // Conversion formula from Fahrenheit to Celsius
        double tempCelsius = (tempFahrenheit - 32) * 5/9;

        // Display the temperature in Celsius
        System.out.println(tempFahrenheit + " degrees Fahrenheit is equal to " + tempCelsius + " degrees Celsius.");
    }
}
