package Chapter4;

/**
 * 4.11.10
 * Emilio Torres
 * 2/29/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 *
 * Exercise 10:
 Write a program that creates the following pattern.

 ******
 *****
 ****
 ***
 **
 *

 */
public class StarPattern {
    public static void main(String[] args) {
        //this is the outer loop to decide the # of "*".
        for (int i = 6; i >= 1; i--){
            //inner loop will print *.
            for (int j = 0; j < i; j++){
                System.out.printf("*");
                }
            System.out.printf(" ");
        }
    }
}
