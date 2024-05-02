package Chapter4; /**
 * 4.11.2
 * Emilio Torres
 * 2/24/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 *
 * Exercise 2:
 Write a program that prompts the user for student
 grades, calculates and displays the average grade
 in the class. The user should enter a character
 to stop providing values.
 */
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        //Prompts user to input grades
        System.out.println("Please input a grade to the nearest whole number.");
        Scanner grade = new Scanner(System.in);
        double x = 0;
        int y = 0;
        int z;
        //Runs the program for the inputted grades
        while (grade.hasNextInt()){
            z = grade.nextInt();
            x += z;
            y++;
        }
        //Finds the average
        double average = (double)((double)x/(double)y);
        System.out.println("The average student grade is " + average);
    }
}
