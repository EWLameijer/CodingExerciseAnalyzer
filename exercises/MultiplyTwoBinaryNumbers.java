package exercises;

// TAGS int, Integer.parseInt(), Integer.toBinaryString(), operators-arithmetic, Scanner, Scanner.next(), String

/* DESCRIPTION
Write a Java program to multiply two binary numbers.
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output

Product of two binary numbers: 110
** HINT: it can be fun to make your own method to convert a number or String to a binary number. But one thing to
** learn on the road to becoming a professional is that Java has LOTS of useful methods already inbuilt. Check
** the wrapper class of int, Integer! :)
 */

import java.util.Scanner;

public class MultiplyTwoBinaryNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the first binary number: ");
        String firstNumberAsString = in.next();
        System.out.print("Input the second binary number: ");
        String secondNumberAsString = in.next();

        int firstNumber = Integer.parseInt(firstNumberAsString, 2);
        int secondNumber = Integer.parseInt(secondNumberAsString, 2);

        int product = firstNumber * secondNumber;
        System.out.println("Product of two binary numbers: " + Integer.toBinaryString(product));
    }
}
