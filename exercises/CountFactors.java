package exercises;

// TAGS for-loops, methods, operators-arithmetic, parameters, remainder-operator, return, Scanner, Scanner.nextInt(), System.out.print()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to accepts an integer and count the factors of the number.
Sample Output:

Input an integer: 25
3
 */

import java.util.Scanner;

public class CountFactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = in.nextInt();

        System.out.println(numberOfFactors(number));
    }

    public static int numberOfFactors(int number) {
        int factorCount = 0;
        int i = 1;
        for (; i * i < number; i++) {
            if (number % i == 0) factorCount += 2;
        }
        if (i * i == number) factorCount++;
        return factorCount;
    }
}
