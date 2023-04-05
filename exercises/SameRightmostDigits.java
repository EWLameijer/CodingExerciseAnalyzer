package exercises;

// TAGS methods, operators-logical, operators-relational, parameters, remainder-operator, return, Scanner, Scanner.nextInt()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
 Write a Java program that accepts three integers from the user and return true if two or more of them (integers )
  have the same rightmost digit. The integers are non-negative.
Sample Output:

Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true
 */

import java.util.Scanner;

public class SameRightmostDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int firstNumber = in.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = in.nextInt();
        System.out.print("Input the third number : ");
        int thirdNumber = in.nextInt();
        System.out.println("The result is: " + twoNumbersHaveSameLastDigit(firstNumber, secondNumber, thirdNumber));
    }

    public static boolean twoNumbersHaveSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber % 10 == secondNumber % 10 ||
                firstNumber % 10 == thirdNumber % 10 ||
                secondNumber % 10 == thirdNumber % 10;
    }
}
