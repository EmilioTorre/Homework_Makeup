package Chapter1;
/**
 *
 * class: Cycle
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 1.15.12. Cycle.java
 * In the Cycle shop, there are 10 bicycles and X numbers of tricycles. Assume that you count the number of wheels of the bicycles and there are 47 wheels of the bicycles and tricycles. How many of tricycle does this Cycle shop have? Write a program named Cycle.java and compute the total number tricycles at the shop.
 */
public class Cycle {
    public static void main(String[] args) {
        int bicycles = 10;
        int biWheels = 2;
        int triWheels = 3;
        int wheels = 47;
        int totalTriWheels = wheels - (biWheels * bicycles);
        int tricycles = totalTriWheels / triWheels;
        System.out.println(tricycles);

    }
}
