package Chapter5; /**
 * 5.0
 * Emilio Torres
 * 3/25/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 * Sum of numbers:
 * Create a method named sum that takes two numbers
 * and returns the sum of these two numbers.
 *
 */
import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner mode = new Scanner(System.in);
        System.out.println("May you please input a number: ");
        num1 = mode.nextInt();
        System.out.println("May you please input another number: ");
        num2 = mode.nextInt();
        num3 = num3(num1,num2);
        System.out.println("the sum of the two numbers is: " + num3);

    }
    //my method that calculates the sum.
    public static int num3(int num1, int num2){
        int num3 = num1 + num2;
        return num3;
    }
}
