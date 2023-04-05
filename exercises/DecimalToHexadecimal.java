package exercises;

// TAGS Integer.toHexString(), Scanner, Scanner.nextInt(), String.toUpperCase()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to convert a decimal number to hexadecimal number.
Input Data:
Input a decimal number: 15
Expected Output

Hexadecimal number is : F
** HINT: Check the Java standard library. You're working with whole numbers here, so Integer (the wrapper class of int,
   as int is a primitive and therefore cannot have any methods) may be of use :)
 */

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");
        int number = in.nextInt();
        System.out.println("Hexadecimal number is: " + Integer.toHexString(number).toUpperCase());
    }
}
