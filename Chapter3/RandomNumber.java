package Chapter3;
/**
 *
 * class: Temperature
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 3.11.1 Write a program that generates a random integer between 0 and 10, and ask the user to guess the generated number. if the user enters the correct number, the program will print Horray you guessed the number. Otherwise the program prints You Lost!!. Hint: you can use Math.random() to generate a random number as follows:
 * int rand = (int)(Math.random() * 11);
 */
import java.util.Scanner;
public class RandomNumber {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Generate a random number between 0 and 10
    int rand = (int) (Math.random() * 11);

    // Prompt user for input
    System.out.print("Guess the number (between 0 and 10): ");
    int userGuess = scanner.nextInt();

    // Check if user's guess is correct
    if (userGuess == rand) {
        System.out.println("Hooray! You guessed the number.");
    }
    else {
        System.out.println("You lost! The correct number was " + rand + ".");
    }
}
}
