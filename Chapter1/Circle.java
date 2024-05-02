package Chapter1;
/**
 *
 * class: Circle
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 1.15.15. Circle.java
 * Write a program named Circle.java that
 * displays the area and perimeter of a
 * Circle that has a radius of 9.5 using
 * the following formula:
 */
public class Circle {
    public static void main(String[] args) {
        double radius = 9.5;
        double area = radius * radius * Math.PI;
        double perimeter = 2 * radius * Math.PI;
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
