package Chapter2;
/**
 *
 * class: Time
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 2.17.3 The point of this exercise is to (1) use some of the arithmetic operators, and (2) start thinking about compound entities (like time of day) that are represented with multiple values.
 * Create a new program called Time.java. From now on, we won’t remind you to start with a small, working program, but you should.
 * Create variables named hour, minute, and second. Assign values to these variables that represent the time 30 seconds after 5:15pm. Use a 24-hour clock. For example, for 2pm, the value of hour is 14. Make the program calculate and display the number of seconds since midnight.
 * Calculate and display the number of seconds remaining in the day.
 * Calculate and display the percentage of the day that has passed. You might run into problems when computing percentages with integers, so consider using floating-point.
 * Hint: You might want to use additional variables to hold values during the computation. Variables that are used in a computation but never displayed are sometimes called “intermediate” or “temporary” variables.
 */
public class Time {
    public static void main(String[] args) {
        // Step 1: Create variables and assign values
        int hour = 17; // 5:15 PM
        int minute = 15;
        int second = 30; // 30 seconds after 5:15 PM

        // Step 2: Calculate total seconds since midnight
        int totalSecondsSinceMidnight = hour * 3600 + minute * 60 + second;

        // Step 3: Calculate seconds remaining in the day (86400 seconds in a day)
        int secondsRemaining = 86400 - totalSecondsSinceMidnight;

        // Step 4: Calculate percentage of the day passed
        double percentagePassed = (totalSecondsSinceMidnight * 100.0) / 86400.0;

        // Display results
        System.out.println("Time: " + hour + ":" + minute + ":" + second);
        System.out.println("Seconds since midnight: " + totalSecondsSinceMidnight);
        System.out.println("Seconds remaining in the day: " + secondsRemaining);
        System.out.println("Percentage of day passed: " + percentagePassed + "%");
    }
}
