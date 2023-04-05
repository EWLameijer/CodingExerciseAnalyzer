package exercises;

// TAGS Integer.parseInt, Scanner, Scanner.nextLine(), System.out.print()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to convert a string to an integer in Java.
Sample Output:

Input a number(string): 25
The integer value is: 25
 */

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String numberAsString = in.nextLine();
        int result = Integer.parseInt(numberAsString);
        System.out.println("The integer value is: " + result);
    }
}
