package Chapter5; /**
 * 5.0
 * Emilio Torres
 * 3/26/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 * Reverse String
 *
 * Create a method reverseString which takes
 * a String as a parameter and returns a
 * String with all the characters reversed.
 */

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String input){
        String reverse = "";
        for (int i  = input.length() -1; i  >=0 ; i ++) {
            reverse = reverse + input.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println("Please enter a string to reverse.");
        Scanner read = new Scanner(System.in);
        String input = read.nextLine();
        input = reverseString(input);
        System.out.println("The string reversed is: ");
        System.out.println(input);

    }
}
