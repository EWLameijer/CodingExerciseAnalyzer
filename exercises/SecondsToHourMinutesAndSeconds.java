package exercises;

// TAGS operators-arithmetic, remainder-operator, Scanner, Scanner.nextInt(), System.out.print()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to convert seconds to hour, minute and seconds.
Sample Output:

Input seconds: 86399
23:59:59
 */

import java.util.Scanner;

public class SecondsToHourMinutesAndSeconds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int totalTimeInSeconds = in.nextInt();
        int hours = totalTimeInSeconds / 3600;
        int secondsInRemainingHour = totalTimeInSeconds % 3600;
        int minutes = secondsInRemainingHour / 60;
        int seconds = secondsInRemainingHour % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
