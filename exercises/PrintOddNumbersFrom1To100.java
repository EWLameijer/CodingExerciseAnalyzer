package exercises;

// TAGS for-loops

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to print the odd numbers from 1 to 99. Prints one number per line.
Sample Output:

1
3
5
7
9
11
....

91
93
95
97
99
 */

public class PrintOddNumbersFrom1To100 {
    public static void main(String[] args) {
        for (int number = 1; number <= 99; number += 2) {
            System.out.println(number);
        }
    }
}
