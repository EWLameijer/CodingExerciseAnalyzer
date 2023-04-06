package exercises;

// TAGS boolean, break, for-loops, if, Math.sqrt(), methods, operators-arithmetic, operators-logical, operators-relational,
// parameters, remainder-operator, return, Scanner, Scanner.nextInt(), System.out.print()

/* DESCRIPTION
Check whether a given number is a prime number.

Example run 1:
Enter an integer: 79
79 is a prime number

Example run 2:
Enter an integer: 21
21 is not a prime number
 */

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;

        for (int i = 3; i < Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
