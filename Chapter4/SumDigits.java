package Chapter4; /**
 * 4.11.6
 * Emilio Torres
 * 2/25/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 *
 * Exercise 6:
 Write a program that accepts an integer from
 the user and displays the sum of the digits
 of the provided integer.

 Sample output for value 235:
 Sum of digits of 235 is 10
 */
import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
        //create a scanner and allow for user input.
        Scanner digit = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        int x = digit.nextInt();
        int y;
       // statement for boolean loop.
        for (y = 0; x != 0; x = x/10){
            System.out.println("The sum of digits of " + x + "is " + y);
        }
    }
}
