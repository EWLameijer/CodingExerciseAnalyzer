package exercises;

import java.util.Scanner;

// TAGS operators-arithmetic, Scanner, Scanner.nextInt(), System.out.printf()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */
public class MultiplicationTableOfInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");
        int number = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
            // alternative System.out.printf("%d x %d = %d", number, i, number * i);
        }
    }
}
