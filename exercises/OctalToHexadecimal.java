package exercises;

// TAGS int, Integer, Integer.parseInt(), Integer.toHexString(), Scanner, Scanner.next(), String

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to convert a octal number to a hexadecimal number.
Input Data:
Input a octal number : 100
Expected Output

Equivalent hexadecimal number: 40
** HINT: Check the Java standard library. You're working with whole numbers here, so Integer (the wrapper class of int,
   as int is a primitive and therefore cannot have any methods) may be of use :)
 */

import java.util.Scanner;

public class OctalToHexadecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a octal number: ");
        String octalNumberAsString = in.next();

        int number = Integer.parseInt(octalNumberAsString, 8);

        System.out.println("Equivalent hexadecimal number: " + Integer.toHexString(number));
    }
}
