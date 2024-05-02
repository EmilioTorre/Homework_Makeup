package Chapter1;
/**
 *
 * class: MaleStudent
 * @author: Emilio Torres
 * @version: 1.0
 * Course name: ITEC 2140 sec. 3 Spring 2024
 * Written: May 1, 2024
 * 1.15.14. MaleStudent.java
 * Assume that there are 389 students in a small middle school.
 * There are 175 female students.
 * Write a program named MaleStudent.java to
 * compute how many students are male in this
 * middle school.
 */
public class MaleStudent {
    public static void main(String[] args) {
        int students = 389;
        int females = 175;
        int males = students - females;
        System.out.println(males);
    }
}
