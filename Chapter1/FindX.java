package Chapter1;
/**
 *
 * class: FindX
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 1.15.13. FindX.java
 * Write a program named FindX.java to compute the number X based on the following formula: 5 + 19 + X + 47 = 194
 */
public class FindX {
    public static void main(String[] args) {
        System.out.println("Find x: 5 + 19 + X + 47 = 194");
        int X = (194 - 47 - 19 -5);
        System.out.println(X);
    }
}
