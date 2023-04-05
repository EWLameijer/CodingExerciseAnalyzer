package exercises;

// TAGS methods, parameters, operators-logical, operators-relational, return, Scanner, Scanner.nextBoolean(), Scanner.nextInt(), System.out.print

/* DESCRIPTION
Write a Java program that accepts three integers from the user and return true if the second number is greater than
 the first number and the third number is greater than second number. If "abc" is true second number does not need to be
 greater than first number.
Sample Output:

Input the first number : 5
Input the second number: 10
Input the third number : 15
Relax the ordering requirement for the first two numbers (true/false): true
The result is: true
 */

import java.util.Scanner;

public class MostlyAscendingTriple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int firstNumber = in.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = in.nextInt();
        System.out.print("Input the third number : ");
        int thirdNumber = in.nextInt();
        System.out.print("Relax the ordering requirement for the first two numbers (true/false): ");
        boolean relaxOrdering = in.nextBoolean();
        System.out.println("The result is: " + test(firstNumber, secondNumber, thirdNumber, relaxOrdering));
    }

    public static boolean test(int firstNumber, int secondNumber, int thirdNumber, boolean relaxOrderingOfFirstTwoNumbers) {
        if (relaxOrderingOfFirstTwoNumbers) return thirdNumber > secondNumber;
        return secondNumber > firstNumber && thirdNumber > secondNumber;
    }
}
