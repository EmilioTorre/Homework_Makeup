package Chapter4; /**
 * 4.11.7
 * Emilio Torres
 * 2/27/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 *
 * Exercise 7:
 Write a program that prompts the user for
 two String values. The program should then
 display if string 1 is greater in length
 than string 2. The program should also
 display if string 1 appears after string 2
 in the lexicographic order or vice versa or
 if they are the same. Lastly, the program
 should display a sentence created by combining
 both the string values.

 Sample output for values "I love" and "GGC":
 String "I love" is longer than String "GGC"
 String "GGC" appears before String "I love" in lexicographic order
 New sentence created is "I love GGC"
 */
import java.util.Scanner;
public class LexicographicalOrder {
    public static void method1(String s1, String s2) {
        //tells whether s1 is greater than s2.
        if (s1.length()>s2.length()){
            System.out.println(s1 + " is longer than " + s2);
        }
        else{
            System.out.println(s1 + " is shorter than " + s2);
        }

    }
    public static void method2(String s1, String s2) {
        //tells whether s1 comes before or after s2.
        if (s1.compareTo(s2) < 0 ){
            System.out.println(s1 + " comes before " + s2);
        }
        else if (s1.compareTo(s2) == 0){
            System.out.println(s1 + " is equal to " + s2);
        }
        else {
            System.out.println(s1 + " comes after " + s2);
        }
    }
    public static void method3(String s1, String s2) {
        //combining both statements together.
            System.out.println(s1 + " " + s2);
    }

// initial code for user input.
    public static void main(String[] args) {
        Scanner E = new Scanner(System.in);
        String s1, s2;
        System.out.println("Please enter the first string.");
        s1 = E.nextLine();
        System.out.println("Please enter the second string.");
        s2 = E.nextLine();
        method1(s1,s2);
        method2(s1,s2);
        method3(s1,s2);
    }
}
