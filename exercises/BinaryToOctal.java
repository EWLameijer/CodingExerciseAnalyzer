package exercises;

// TAGS int, Integer, Integer.parseInt(), Integer.toOctalString(), Scanner, Scanner.next(), String

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to convert a binary number to a Octal number.
Input Data:
Input a Binary Number: 111
Expected Output

Octal number: 7
** HINT: Check the Java standard library. You're working with whole numbers here, so Integer (the wrapper class of int,
   as int is a primitive and therefore cannot have any methods) may be of use :)
 */

import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a Binary Number: ");
        String binaryNumberAsString = in.next();

        int number = Integer.parseInt(binaryNumberAsString, 2);

        System.out.println("Octal number: " + Integer.toOctalString(number));
    }
}
