package Chapter4; /**
 * 4.11.1
 * Emilio Torres
 * 2/24/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 *
 * Exercise 1:
 * Write a program that prompts the user for an integer
 * and displays if the provided integer is a prime number
 * or not. A prime number is a number that is divisible
 * only by 1 and itself. First few prime numbers are
 * 2,3,5,7,11,13 and so on. Sample run is shown below
 * (Do not use Math.sqrt(x))
 * Instead, use this algorithm and make sure check numbers between 0 and 14.
 */
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner fact = new Scanner(System.in);
        //Prompts the user to input an integer.
        System.out.println("Please enter any integer");
        int integer = fact.nextInt();
        //Gives the output of whether the integer is prime or not.
        if (X(integer)) {
            System.out.println("The number " + integer + " is prime!");
        } else {
            System.out.println("The number " + integer + " is not prime!");
        }
    }


     //the private method checks if the integer is true.
    private static boolean X(int integer) {
        if (integer <= 1){
            return false;
        }
        for (int e = 2; e <= (integer * integer); e++){
            if (integer % e == 0){
                return false;
            }
        }
        return true;
    }
}
