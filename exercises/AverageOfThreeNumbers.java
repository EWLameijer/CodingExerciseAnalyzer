package exercises;

// TAGS operators-arithmetic, Scanner, Scanner.nextInt()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program that takes three numbers as input to calculate and print the average of the numbers
 */

import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int firstNumber = in.nextInt();

        System.out.print("Input second number: ");
        int secondNumber = in.nextInt();

        System.out.print("Input third number: ");
        int thirdNumber = in.nextInt();

        System.out.println("The average of the three numbers is: " + (firstNumber + secondNumber + thirdNumber) / 3);
    }
}
