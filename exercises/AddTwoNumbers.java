package exercises;

// TAGS operators-arithmetic, Scanner, Scanner.nextInt(), System.out.print(), System.out.println()

/* DESCRIPTION
https://www.codezclub.com/java-program-sum-two-numbers-input-value-keyboard/
Make a program that lets the user input two numbers, and then shows the result of adding them.

Example run:
Enter the first number: 3
Enter the second number: 5
The sum is: 8
 */

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = in.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = in.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("The sum is: " + sum);
    }
}
