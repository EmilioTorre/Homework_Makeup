package Chapter3;
/**
 *
 * class: BMI
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 3.11.10 Write a program that simulates the fall-through by using switch statements. This program will classify an alphabet randomly generated (set up to generate characters A through z) between and print whether it is in the first four letters and a vowel or a consonant or not an alphabet character. You must not use the break statement for every case statement. Here are a few sample runs.

Sample 1: The alphabet 'y' is a consonant
Sample 2: The alphabet 'U' is a vowel
Sample 3: The alphabet '[' is not an alphabet character
Sample 4: The alphabet 'b' is in the first four letters
The alphabet 'b' is a consonant
*/
import java.util.Random;
public class FallThrough {
    public static void main(String[] args) {
        Random random = new Random();
        char alphabet = (char) (random.nextInt(26) + 'a'); // Generate a random lowercase alphabet

        System.out.println("The alphabet '" + alphabet + "' is " + classifyAlphabet(alphabet));
    }

    public static String classifyAlphabet(char ch) {
        if (!Character.isLetter(ch)) {
            return "not an alphabet character";
        }

        ch = Character.toLowerCase(ch); // Convert to lowercase for easy comparison

        if (ch >= 'a' && ch <= 'd') {
            return "in the first four letters";
        } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "a vowel";
        } else {
            return "a consonant";
        }
    }
}
