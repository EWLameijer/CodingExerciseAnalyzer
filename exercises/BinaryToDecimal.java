package exercises;

// TAGS int, Integer, Integer.parseInt(), Scanner, Scanner.next(), String

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to convert a binary number to decimal number.
Input Data:
Input a binary number: 100
Expected Output

Decimal Number: 4
** HINT: Check the Java standard library. You're working with whole numbers here, so Integer (the wrapper class of int,
   as int is a primitive and therefore cannot have any methods) may be of use :)
 */

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a binary number: ");
        String binaryNumberAsString = in.next();

        int number = Integer.parseInt(binaryNumberAsString, 2);

        System.out.println("Decimal number: " + number);
    }
}
