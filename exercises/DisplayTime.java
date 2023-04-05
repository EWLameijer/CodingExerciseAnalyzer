package exercises;

// TAGS System, System.currentTimeMillis(), System.out.printf()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to display the system time.
Sample Output:

Current Date time: Sun Apr 02 16:16:01 CEST 2023
HINT: check formatting strings for datetimes, and since this exercise mentions SYSTEM time, the System class as well...
 */

public class DisplayTime {
    public static void main(String[] args) {
        System.out.printf("Current Date time: %tc", System.currentTimeMillis());
    }
}
