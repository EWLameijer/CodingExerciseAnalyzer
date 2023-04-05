package exercises;

// TAGS Scanner, Scanner.nextLine(), String, StringBuilder, StringBuilder.reverse()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT
HINT: To work with Strings, the StringBuilder class can also be handy...
 */

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String text = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(text);
        System.out.println("Reverse string: " + stringBuilder.reverse());
    }
}
