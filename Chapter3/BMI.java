package Chapter3;
/**
 *
 * class: BMI
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 3.11.9 Write a program that computes and interprets the Body Mass Index (BMI). The program prompts the user to enter his/her weight in pounds and his/her height in inches. the program then calculates the bmi using the formula: BMI = Weight(kilograms)/(height(meters))2. To convert weight in pounds(p) to kilograms(kg) use the formula: weight(kg) = weight(p) * 0.4536. To convert inches(in) into meters(m) use the formula: height(m) = height(in) * 0.0254. The BMI interpretation is as follows:
 * BMI Interpretation
 * BMI	Interpretation
BMI < 18.5

Underweight

18.5 ≤ BMI < 25.0

Normal

25.0 ≤ BMI < 30.0

Overweight

BMI ≥ 30.0

Obese
*/
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightInches = scanner.nextDouble();

        // Convert weight to kilograms
        double weightKilograms = weightPounds * 0.4536;

        // Convert height to meters
        double heightMeters = heightInches * 0.0254;

        // Calculate BMI
        double bmi = weightKilograms / (heightMeters * heightMeters);

        // Interpretation
        String interpretation;
        if (bmi < 18.5) {
            interpretation = "Underweight";
        } else if (bmi < 25.0) {
            interpretation = "Normal";
        } else if (bmi < 30.0) {
            interpretation = "Overweight";
        } else {
            interpretation = "Obese";
        }

        // Display BMI and interpretation
        System.out.printf("BMI: %.2f%n", bmi);
        System.out.println("Interpretation: " + interpretation);
    }
}
