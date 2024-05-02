package Chapter2;
/**
 *
 * class: Temperature
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 2.17.2 Write a program that does the following:
 * creates variables named day, date, month, and year. The variable day will contain the day of the week (like Friday), and date will contain the day of the month (like the 13th).
 * Assign values to those variables that represent 2019 Labor Day’s date (9/2/2019, Monday).
 * Display the value of each variable on a line by itself. This is an intermediate step that is useful for checking that everything is working so far. Compile and run your program before moving on.
 * Finally, modify the program so that it displays the date in standard American format, for example: Thursday, July 16, 2015. 5. Modify the program so it also displays the date in European format.
 * American format:
 * Thursday, July 16, 2015
 * European format:
 * Thursday 16 July 2015
 * The final output should be in the following format. Note that the actual date should be for 2019 Labor Day.
 */
public class LaborDay {
    public static void main(String[] args) {
        // Step 1: Create variables
        String day = "Monday"; // Day of the week
        int date = 2; // Day of the month
        String month = "September"; // Month
        int year = 2019; // Year

        // Step 2: Display initial values
        System.out.println("Initial values:");
        System.out.println("Day: " + day);
        System.out.println("Date: " + date);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);

        // Step 3: Format and display the date
        System.out.println("\nFormatted date:");
        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
        System.out.println("European format: " + day + " " + date + " " + month + " " + year);
    }

}
