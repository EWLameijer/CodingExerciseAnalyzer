package exercises;

// TAGS Scanner, Scanner.nextInt(), System.out.printf()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program that accepts an integer (n) and displays n + nn + nnn.
Sample Output:

Input number: 5
5 + 55 + 555
 */

import java.util.Scanner;

public class DisplayNumberPlusCopies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = in.nextInt();
        System.out.printf("%d + %d%d + %d%d%d\n", n, n, n, n, n, n);
    }
}
