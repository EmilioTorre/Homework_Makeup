package Chapter1;
/**
 *
 * class: SpeedLight
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * SpeedLight.java
 * The speed of sound is approximately 340 meter per second.
 * Assume that you just saw a lightning flash
 * and heard the sound of thunder 5 seconds
 * later. Write a program named
 * SpeedLight.java that calculate the
 * distance to a lightning strike based on the
 * time elapsed between the flash and the
 * sound of thunder.
 *
 */
public class SpeedLight {
    public static void main(String[] args) {
        int light = 340;
        int thunder = 5;
        System.out.println(light/thunder);
    }
}
