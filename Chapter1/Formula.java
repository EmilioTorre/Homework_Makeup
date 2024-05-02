package Chapter1;
/**
 *
 * class: Formula
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 1.15.7. Write a program named Formula.java that displays the result of
 * (5.6*5.6-4*6.2*5.1)/(2*7.8-3*5.6)
 *
 */
public class Formula {
    public static void main(String[] args) {
        // Define the mathematical expression
        double result = ((5.6 * 5.6) - (4 * 6.2 *5.1))/ ((2 * 7.8) - (3*5.6));

        // Display the result
        System.out.println("The result of the expression is: " + result);
    }
}
