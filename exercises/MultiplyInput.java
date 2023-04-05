package exercises;

// TAGS operators-arithmetic, Scanner, Scanner.nextInt(), System.out.printf()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
 */

import java.util.Scanner;

public class MultiplyInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int firstNumber = in.nextInt();

        System.out.print("Input second number: ");
        int secondNumber = in.nextInt();

        System.out.println(firstNumber + " x " + secondNumber + " = " + firstNumber * secondNumber);
        // alternative System.out.printf("%d x %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);
    }
}
