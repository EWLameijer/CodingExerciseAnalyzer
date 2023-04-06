package exercises;

// TAGS double, for-loops, int, operators-arithmetic, Scanner, Scanner.nextDouble(), Scanner.nextInt(), System.out.print()

/* DESCRIPTION
Write a program that averages numbers.

Example of run.
How many numbers do you want to average? 3
Enter a number: 1.5
Enter a number: 2
Enter a number: 2.3

The average is: 1.9333333333333333
 */

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you want to average? ");
        int count = in.nextInt();
        double sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter a number: ");
            double number = in.nextDouble();
            sum += number;
        }

        double avg = sum / count;
        System.out.println("\nThe average is: " + avg);
    }
}
