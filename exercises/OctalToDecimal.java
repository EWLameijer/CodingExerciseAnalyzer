package exercises;

// TAGS int, Integer, Integer.parseInt(), Scanner, Scanner.next(), String

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to convert a octal number to a decimal number.
Input Data:
Input any octal number: 10
Expected Output

Equivalent decimal number: 8
** HINT: Check the Java standard library. You're working with whole numbers here, so Integer (the wrapper class of int,
   as int is a primitive and therefore cannot have any methods) may be of use :)
 */

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input any octal number: ");
        String octalNumberAsString = in.next();

        int number = Integer.parseInt(octalNumberAsString, 8);

        System.out.println("Equivalent decimal number: " + number);
    }
}
