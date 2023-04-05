package exercises;

// TAGS Integer.toOctalString(), Scanner, Scanner.nextInt()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to convert a decimal number to octal number. G
Input Data:
Input a Decimal Number: 15
Expected Output

Octal number is: 17
** HINT: Check the Java standard library. You're working with whole numbers here, so Integer (the wrapper class of int,
   as int is a primitive and therefore cannot have any methods) may be of use :) Of course, feel free to write your
   own implementation if you want...
 */

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");
        int number = in.nextInt();

        System.out.println("Octal number is: " + Integer.toOctalString(number));
    }
}
