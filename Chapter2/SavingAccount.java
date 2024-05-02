package Chapter2;
/**
 *
 * class: Temperature
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 2.17.9 Write a program that prompts the user to enter a monthly saving amount and displays the account value after each of the first six months.  When displaying the account values, please use printf to print only two decimal places.
 * We will assume that the yearly interest is 5%. Please declare a constant variable for the monthly interest rate as follows in your program:
 * final double MONTHLY_RATE = 0.05/12;
 * The following are how to calculate the account value at the end of each month:
 * month1Value: monthlySaving * (1+MONTHLY_RATE)
 * month2Value: (monthly1Value + monthlySaving) *  (1+MONTHLY_RATE)
 * month3Value: (monthly2Value + monthlySaving) *  (1+MONTHLY_RATE)
 */
import java.util.Scanner;
public class SavingAccount {
    public static void main(String[] args) {
    final double MONTHLY_RATE = 0.05 / 12; // Monthly interest rate

    Scanner scanner = new Scanner(System.in);

    // Prompt user for input
    System.out.print("Enter the monthly saving amount: ");
    double monthlySaving = scanner.nextDouble();

    // Initialize account value
    double accountValue = 0.0;

    // Calculate and display account value for each of the first six months
    for (int month = 1; month <= 6; month++) {
        accountValue = (accountValue + monthlySaving) * (1 + MONTHLY_RATE);
        System.out.printf("Month %d: $%.2f%n", month, accountValue);
    }
    }
}
