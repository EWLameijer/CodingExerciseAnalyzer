package exercises;

// TAGS operators-relational, Scanner, Scanner.nextInt(), System.out.printf()

import java.util.Scanner;

/* DESCRIPTION if, operators-relational, Scanner, Scanner.nextInt(), System.out.printf()
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to compare two numbers.
(test for ==, !=, >, >=, <, <=; only show those relationships that are TRUE)

Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39
25 < 39
25 <= 39
 */
public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first integer: ");
        int firstNumber = input.nextInt();

        System.out.print("Input second integer: ");
        int secondNumber = input.nextInt();

        if (firstNumber == secondNumber) System.out.printf("%d == %d\n", firstNumber, secondNumber);
        if (firstNumber != secondNumber) System.out.printf("%d != %d\n", firstNumber, secondNumber);
        if (firstNumber < secondNumber) System.out.printf("%d < %d\n", firstNumber, secondNumber);
        if (firstNumber > secondNumber) System.out.printf("%d > %d\n", firstNumber, secondNumber);
        if (firstNumber <= secondNumber) System.out.printf("%d <= %d\n", firstNumber, secondNumber);
        if (firstNumber >= secondNumber) System.out.printf("%d >= %d\n", firstNumber, secondNumber);
    }
}
