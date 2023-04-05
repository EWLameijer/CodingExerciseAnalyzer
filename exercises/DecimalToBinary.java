package exercises;

// TAGS Integer.toBinaryString(), operators-arithmetic, operators-relational, remainder-operator, Scanner, Scanner.nextInt(), StringBuilder(), StringBuilder.insert(), while-loops

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to convert a decimal number to binary number.
Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101

**Challenge: it is really easy to do this with the Integer class in Java, but it is kind of a rite of passage to write
  your own routine. So if you dare: try both routes
 */

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a Decimal Number : ");
        int number = in.nextInt();
        System.out.println("Binary number is: " + Integer.toBinaryString(number));

        // bonus
        StringBuilder binaryString = new StringBuilder();
        while (number > 0) {
            binaryString.insert(0, number % 2);
            number /= 2;
        }
        System.out.println("Binary number is: " + binaryString);
    }
}
