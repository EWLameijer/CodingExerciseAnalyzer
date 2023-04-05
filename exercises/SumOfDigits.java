package exercises;

// TAGS methods, parameters, operators-arithmetic, remainder-operator, return, Scanner, Scanner.nextInt(), while-loops

import java.util.Scanner;

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program and compute the sum of the digits of an integer.
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7
 */
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = input.nextInt();
        System.out.println("The sum of the digits is: " + sumDigits(number));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
