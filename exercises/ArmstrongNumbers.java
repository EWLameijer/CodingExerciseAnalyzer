package exercises;

// TAGS casting, if, Math.pow(), operators-arithmetic, Scanner, Scanner.nextInt(), String.length(), System.out.print(), while-loops

import java.util.Scanner;

/* DESCRIPTION
https://www.codezclub.com/java-program-check-number-armstrong-or-not/
An Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits
is equal to the number itself.

For example:
Three Digits Armstrong number is 153, 1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 153

Four Digits Armstrong number is 1634, 1 ^ 4 + 6 ^ 4 + 3 ^ 4 + 4 ^ 4 + = 1634

and So on...

Example run 1:
Enter the number which you want to check: 1634
This number is an Armstrong number.

Example run 2:
Enter the number which you want to check: 1635
This number is not an Armstrong number.
*/

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.print("Enter the number which you want to check: ");
        Scanner in = new Scanner(System.in);
        int originalNumber = in.nextInt();

        int numberLength = ("" + originalNumber).length();
        int armstrongNumber = 0;
        int number = originalNumber;
        while (number > 0) {
            int currentDigit = number % 10;
            number /= 10;
            armstrongNumber += (int) Math.pow(currentDigit, numberLength);
        }

        if (armstrongNumber == originalNumber) System.out.println("This number is an Armstrong number.");
        else System.out.println("This number is not an Armstrong number.");
    }
}
