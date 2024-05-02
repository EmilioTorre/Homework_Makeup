package Chapter4; /**
 * 4.11.9
 * Emilio Torres
 * 2/29/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 *
 * Exercise 9:
 Write a program that prompts the user for a String value and a character value. The program should then find the last
 occurrence of the provided character in the provided String and display the corresponding index. If the character
 is not found in the String, display -1.

 Sample output for values "Hello, World!" and 'l':
 Last occurrence of character 'l' in "Hello World" is at index 10

 Sample output for values "Hello, World!" and 'g':
 Last occurrence of character 'g' in "Hello World" is at index -1
 */
import java.util.Scanner;
public class LastOccurence {
    public static void main(String[] args) {
        Scanner E = new Scanner(System.in);
        //Prompts user for a string value.
        System.out.println("Please enter a string value.");
        String x = E.nextLine();
        //Prompts for character to find.
        System.out.println("Please enter a character that you want to find in the string.");
        String character = E.nextLine();
        //Final outcome.
        System.out.println("The last index of " + character + " is " + x.lastIndexOf(character));
    }
}
