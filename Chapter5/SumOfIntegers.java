package Chapter5; /**
 * 5.0
 * Emilio Torres
 * 3/25/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 * Sum of Integers
 *
 * Create a method sum that takes two parameters, both integers.
 * Do not use the keyword static in this method declaration.
 * This method should return an integer. Create
 * code in your main method that calls this method.
 */
import java.util.Scanner;
public class SumOfIntegers {
    //creating a public int named Sum.
    public int Sum (int num1,int num2){
        return num1 + num2;
    }
    //creating a public int name GetNum.
    public int GetNum (Scanner integer){
        System.out.println("May you please input and integer.");
        return integer.nextInt();
    }
    //My main method that runs everything.

    public static void main(String[] args) {
        Scanner integer = new Scanner(System.in);
        SumOfIntegers numbers = new SumOfIntegers();
        int num1 = numbers.GetNum(integer);
        int num2 = numbers.GetNum(integer);
        System.out.println("The sum is: " + numbers.Sum(num1,num2));
    }
}
