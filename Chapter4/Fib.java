package Chapter4;

/**
 * 4.11.4
 * Emilio Torres
 * 2/25/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 *
 * Exercise 4:
 Write a program that prints the first 30 values
 in the Fibonacci series. A Fibonacci series begins
 with 0 and 1. The next number is then found by
 adding the previous two numbers. The first few
 numbers in the Fibonacci series are: 0,1,1,2,3,5,8,13
 and so on.
 */
public class Fib {
    public static void main(String[] args) {
        //starting input
        int x = 0;
        int y = 1;
        int z;
        //Display
        System.out.println(x);
        System.out.println(y);
        int E = 2;
        //boolean while loop
        while(E<30){
            z = x + y;
            x = y;
            y = z;
            System.out.println(z);
            E += 1;
        }
    }
}
