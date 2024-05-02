package Chapter4; /**
 * 4.11.8
 * Emilio Torres
 * 2/29/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 *
 * Exercise 8:
 Write a program that accepts a String value
 from the user and displays the reverse of that value.

 Sample output for value "Hello, World!":
 Reverse of "Hello, World!" is "!dlroW ,olleH"
 For additional challenge, determine if the String and its reverse are equal and display a message explaining the result.

 Sample output for value "Hello, World!":
 String value "Hello, World!" and its reverse "!dlroW ,olleH" are not equal
 */
import java.util.Scanner;
public class ReverseString {
    public static String reverse(String str){
        if (str.length() == 0){
            return "";
        }
        else{
            return str.charAt(str.length() - 1) + reverse(str.substring(0,str.length() - 1));
        }
    }

    public static void main(String[] args) {
        Scanner E = new Scanner(System.in);
        //Prompts user to enter a string.
        System.out.println("Please enter a sting: ");
        String str = E.nextLine();
        //string is being reversed.
        String reverseString = reverse(str);
        System.out.println("When reversed: " + reverseString);
        // If statement for whether it is equal or not.
        if (str.equals(reverseString)){
            System.out.println("String and it's reverse are equal!");
        }
        else{
            System.out.println("String and its reverse are not equal!");
        }
    }
}
