package exercises;

// TAGS operators-arithmetic, Scanner, Scanner.nextInt(), System.out.printf()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */

import java.util.Scanner;

public class InputTwoNumbersAndDoArithmetic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int firstNumber = in.nextInt();

        System.out.print("Input second number: ");
        int secondNumber = in.nextInt();

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        System.out.println(firstNumber + " mod " + secondNumber + " = " + (firstNumber % secondNumber));
        // note: System.out.printf would work quite fine here as well...
        // System.out.printf("%d mod %d = %d", firstNumber, secondNumber, firstNumber % secondNumber);
    }
}
