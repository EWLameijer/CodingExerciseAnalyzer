package exercises;

// TAGS double, for-loops, int, operators-arithmetic, Scanner, Scanner.nextDouble(), Scanner.nextInt(), System.out.print()

/* DESCRIPTION
Write a program that calculates the product of a given number of numbers

Example of run.
How many numbers do you want to multiply together? 3
Enter a number: 2
Enter a number: 3.5
Enter a number: 5

The product is: 35.0
*/

import java.util.Scanner;

public class CalculateProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you want to multiply together? ");
        int count = in.nextInt();
        double product = 1;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter a number: ");
            double number = in.nextDouble();
            product *= number;
        }
        System.out.println("\nThe product is: " + product);
    }
}
