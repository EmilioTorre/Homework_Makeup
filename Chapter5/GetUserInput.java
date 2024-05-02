package Chapter5; /**
 * 5.0
 * Emilio Torres
 * 3/26/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 * Get User Input
 *
 * Write a method, getInput, that allows the
 * user to enter a String and returns this
 * value to be printed using your printString
 * method defined above. Again, do not use the
 * static keyword on your methods other than
 * main.
 */

import java.util.Scanner;
public class GetUserInput {

    public static String main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name.");
        String Name = input.nextLine();

        return Name;
    }
}
