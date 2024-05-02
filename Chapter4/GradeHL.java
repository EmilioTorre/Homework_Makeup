package Chapter4; /**
 * 4.11.3
 * Emilio Torres
 * 2/25/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 *
 * Exercise 3:
 Write a program that prompts the user
 for student grades and displays the
 highest and lowest grades in the class.
 The user should enter a character
 to stop providing values.
 */
import java.util.Scanner;
public class GradeHL {
    public static void main(String[] args) {
        Scanner grades = new Scanner(System.in);
        double min = 100, max = -1;
        double grade;
        //Prompts user to enter grades.
        System.out.println("Enter student grades. Enter a character to stop.");

        while (true) {
            grade = grades.nextDouble();
            //check if grade is less than min
            if (grade < min) {
                min = grade;
            }
            //check if grade is greater than max
            if (grade > max) {
                max = grade;
            }
            //final results
            System.out.println("The highest grade is: " + max);
            System.out.println("the lowest grade is: " + min);
        }


    }
}
