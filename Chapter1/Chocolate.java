package Chapter1;
/**
 *
 * class: Chocolate
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 1.15.10. Chocolate.java
 * Assume there are 9 bags of chocolate bars.
 * Each bag has two chocolate bars. The bag is big enough
 * to have three chocolate bars. If you want to take all the
 * chocolates out of each bag and add three chocolate bars
 * to each bag, how many bags will you need? Write a program
 * to compute the number of bags you will need to add
 * three chocolates instead of two chocolates.
 */
public class Chocolate {
    public static void main(String[] args) {
        int bars = 9;
        int Bag = 3;
        System.out.println("You will need " + bars/Bag + " bags.");


    }
}
