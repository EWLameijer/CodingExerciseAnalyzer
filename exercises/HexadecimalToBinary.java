package exercises;

// TAGS int, Integer, Integer.parseInt(), Integer.toBinaryString(), Scanner, Scanner.next(), String

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to convert a hexadecimal to a binary number.
Input Data:
Enter Hexadecimal Number: 37
Expected Output

Equivalent Binary Number is: 110111
** HINT: Check the Java standard library. You're working with whole numbers here, so Integer (the wrapper class of int,
   as int is a primitive and therefore cannot have any methods) may be of use :)
 */

import java.util.Scanner;

public class HexadecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Hexadecimal Number: ");
        String hexadecimalNumberAsString = in.next();

        int number = Integer.parseInt(hexadecimalNumberAsString, 16);

        System.out.println("Equivalent Binary Number is: " + Integer.toBinaryString(number));
    }
}

