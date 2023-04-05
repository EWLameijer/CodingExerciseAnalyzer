package exercises;

// TAGS operators-arithmetic, operators-logical, operators-relational, Scanner, Scanner.nextInt(), System.out.print()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program that asks for three integers, then prints "true" if the sum of any two of the integers
is equal to the third integer.
Sample Output:

Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true
 */

import java.util.Scanner;

public class SumOfTwoIntegersEqualToAThirdInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int firstNumber = in.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = in.nextInt();
        System.out.print("Input the third number : ");
        int thirdNumber = in.nextInt();
        System.out.println("The result is: " + sumOfTwoEqualsThird(firstNumber, secondNumber, thirdNumber));
    }

    public static boolean sumOfTwoEqualsThird(int firstNumber, int secondNumber, int thirdNumber) {
        // note: this could also be achieved by sorting the numbers and checking whether the sum of the first two numbers equals the last number
        return (firstNumber + secondNumber == thirdNumber ||
                secondNumber + thirdNumber == firstNumber ||
                thirdNumber + firstNumber == secondNumber);
    }
}
