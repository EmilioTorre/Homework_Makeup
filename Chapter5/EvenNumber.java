package Chapter5; /**
 * 5.0
 * Emilio Torres
 * 3/26/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 * Even Number
 *
 * Create a class that asks the user to enter
 * a number. Call a method isEven that returns
 * true or false if the number is even. The
 * return from isEven should be passed to
 * printEven which will print "The number is
 * even" if the number is even and "The number
 * is odd" if the number is odd. Determination
 * of what to print must be done based on the
 * return from the isEven method.
 */

import java.util.Scanner;
public class EvenNumber {
    public static void main(String[] args) {
        EvenNumber num1 = new EvenNumber();
        int number = num1.getNumber();
        boolean even = num1.isEven(number);
        num1.printEven(even);
    }

    //Method calling for integer
    public int getNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer.");
        return input.nextInt();
    }

    //Method checking if even
    public boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        else {
            return false;

        }
    }
    //Printing out my answer
    public void printEven(boolean even){
       if (even) {
           System.out.println("The number is even");
       }
       else{
            System.out.println("The number is odd.");
        }
    }
}
