package exercises;

// TAGS operators-arithmetic, operators-relational, Scanner, Scanner.nextInt(), System.out.print(), while-loops

/* DESCRIPTION
Write a program that displays a given integer in the reverse order.
Example:
Enter an integer: 4235
5324
 */

import java.util.Scanner;

public class ReverseAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int rev = 0;

        while (number != 0) {
            int digit = number % 10;
            rev = (rev * 10) + digit;
            number = number / 10;
        }

        System.out.println(rev);
    }
}
