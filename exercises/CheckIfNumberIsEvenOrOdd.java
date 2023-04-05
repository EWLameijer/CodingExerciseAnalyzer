package exercises;

// TAGS if, remainder-operator, Scanner, Scanner.nextInt()

import java.util.Scanner;

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd.
Sample Output:

Input a number: 20
1
 */
public class CheckIfNumberIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = in.nextInt();
        int answer;
        if (number % 2 == 0) {
            answer = 1;
        } else {
            answer = 0;
        }
        System.out.println(answer);
        // NOTE: previous five lines can also be done with the ternary operator: int answer = number % 2 == 0 ? 1 : 0;
    }
}
