package Chapter4; /**
 * 4.11.5
 * Emilio Torres
 * 2/25/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 *
 * Exercise 5:
 Write a program that prompts the user for an
 integer value. The program should then calculate
 and print the factorial of the user provided value.
 Factorial of a number, n, written as n! is calculated
 as a product of all integers less than or equal
 to n. 5! = 5*4*3*2*1 = 120. 0! = 1. 1! = 1.
 */
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner factoral = new Scanner(System.in);
        //reading input from user.
        System.out.println("May you please enter an integer.");
        int x = factoral.nextInt();
        int y = 1, z = 1;
        //looping 1 to x
        while (z <= x) {
            //adding product to y
            y = y * z;
            z++;
        }
        //final statement
        System.out.println(" The factoral of " + x + "is " + y);
    }
}
