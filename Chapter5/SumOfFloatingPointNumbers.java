package Chapter5; /**
 * 5.0
 * Emilio Torres
 * 3/26/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 * Sum of Floating Point Numbers
 *
 * Create a method sum that takes two parameters,
 * both doubles. This method should return a
 * double. Do not use the keyword static.
 * Create code in the main method that calls
 * the sum method with two doubles, with two
 * ints and with one double and one int.
 * Which method gets called in each case.
 * Hint, you may want to put a print statement
 * into each method to help determine which
 * method is called. Why is the specific method
 * called?
 */

 import java.util.Scanner;
public class SumOfFloatingPointNumbers {
    public static void main(String[] args) {
        double num1, num2;
        int num3, num4;
        System.out.println("Enter two numbers with a decimal.");
        Scanner integer = new Scanner(System.in);
        num1 = integer.nextDouble();
        num2 = integer.nextDouble();
        System.out.println("Enter two numbers without a decimal.");
        num3 = integer.nextInt();
        num4 = integer.nextInt();
        SumOfFloatingPointNumbers N1 = new SumOfFloatingPointNumbers();

        double answer1 = N1.sum1(num1,num2);
        System.out.println("The result of sum1 is: " + answer1);

        double answer2 = N1.sum2(num1);
        System.out.println("The result of sum2 is: " + answer2);

        int answer3 = N1.sum3(num3,num4);
        System.out.println("The result of sum3 is: " + answer3);

        int answer4 = N1.sum4(num3);
        System.out.println("The result of sum4 is: " + answer3);

    }

    public double sum1(double num1, double num2){
        //Only the sum1 function is called.
        double result1;
        result1 = num1 + num2;
        return result1;
    }

    public double sum2(double num1){
        //Only the sum2 function is called.
        return num1;
    }

    public int sum3(int num3, int num4){
        //Only the sum3 function is called.
        int result2;
        result2 = num3 + num4;
        return result2;
    }

    public int sum4(int num4){
        //Only the sum4 function is called.
        return num4;
    }
}
