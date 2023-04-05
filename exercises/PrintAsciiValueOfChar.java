package exercises;

// TAGS ASCII, char

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to print the ascii value of a given character.
Expected Output

The ASCII value of Z is: 90
 */

public class PrintAsciiValueOfChar {
    public static void main(String[] String) {
        int asciiOfChar = 'Z'; // a char can be automatically cast to an int, and a char basically IS an ASCII-code
        System.out.println("The ASCII value of Z is: " + asciiOfChar);
    }
}
