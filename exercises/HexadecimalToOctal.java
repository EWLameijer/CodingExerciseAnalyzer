package exercises;

// TAGS int, Integer, Integer.parseInt(), Integer.toOctalString(), Scanner, Scanner.next(), String

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to convert a hexadecimal to a octal number.
Input Data:
Input a hexadecimal number: 40
Expected Output

Equivalent octal number: 100
** HINT: Check the Java standard library. You're working with whole numbers here, so Integer (the wrapper class of int,
   as int is a primitive and therefore cannot have any methods) may be of use :)
 */

import java.util.Scanner;

public class HexadecimalToOctal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a hexadecimal number: ");
        String hexadecimalNumberAsString = in.next();

        int number = Integer.parseInt(hexadecimalNumberAsString, 16);

        System.out.println("Equivalent octal number: " + Integer.toOctalString(number));
    }
}
