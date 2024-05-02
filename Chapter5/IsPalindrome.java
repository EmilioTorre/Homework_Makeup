package Chapter5; /**
 * 5.0
 * Emilio Torres
 * 3/26/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 * Is Palindrome
 *
 * Create a method, isPalindrome, which returns
 * true if the String passed to it is a
 * palindrome and false if it is not.
 */

import java.util.Scanner;
public class IsPalindrome {
    public static void main(String[] args) {

        String input = "", reverse = "";
        boolean pass;
        Scanner enter = new Scanner(System.in);
        System.out.println("Please enter a string.");
        input = enter.nextLine();
        pass = IsPalindrome(input);
        if (pass){
            System.out.println(input + " is a Palindrome.");
        }
        else{
            System.out.println(input + " is not a Palindrome.");
        }
    }

    public static boolean IsPalindrome(String input) {
        String reverse = "";
        int count = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length() - 1; i++) {
            reverse += input.charAt((input.length() - 1) - i);
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != reverse.charAt(i))
                return false;
        }
                return true;
        }
    }

