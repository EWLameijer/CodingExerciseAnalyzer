package exercises;

import java.util.Scanner;

// TAGS int, Integer, Integer.parseInt(), Integer.toHexString(), Scanner, Scanner.next(), String, String.toUpperCase()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to convert a binary number to hexadecimal number.
Input Data:
Input a Binary Number: 1101
Expected Output

Hexadecimal value: D
** HINT: Check the Java standard library. You're working with whole numbers here, so Integer (the wrapper class of int,
   as int is a primitive and therefore cannot have any methods) may be of use :)
 */
public class BinaryToHexadecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a binary number: ");
        String binaryNumberAsString = in.next();

        int number = Integer.parseInt(binaryNumberAsString, 2);

        System.out.println("Hexadecimal value: " + Integer.toHexString(number).toUpperCase());
    }
}
