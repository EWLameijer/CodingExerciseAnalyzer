package exercises;

// TAGS methods, operators-arithmetic, operators-logical, parameters, remainder-operator, return Scanner,
// Scanner.nextInt(), System.out.print(), System.out.printf()

/* DESCRIPTION
The greatest common divisor is the largest whole number that you can divide two other numbers by. While the term might
not be familiar to you, you will have probably used it to simplify fractions when you were at school: 4/2 equals 2/1,
12/9 equals 4/3, 45/30 = 3/2. In all cases, you divide both the numerator and denominator by the 'greatest common
divisor': which are 2 for 4 and 2 (both 4 and 2 are divisible by 2). 3 in the case of 12 and 9 (12 and 9 are divisible
by 3), and 15 in the case of 45 and 30 (both 45 and 30 are divisible by 15)
https://en.wikipedia.org/wiki/Greatest_common_divisor

How to find the GCD? Wikipedia has some links, including to one to the Euclidian algorithm:
A more efficient method is the Euclidean algorithm, a variant in which the difference of the two numbers a and b is replaced by the remainder of the Euclidean division (also called division with remainder) of a by b.

Denoting this remainder as a mod b, the algorithm replaces (a, b) by (b, a mod b) repeatedly until the pair is (d, 0),
where d is the greatest common divisor.

This can be done in several ways, either by swapping values as you'd do for a Fibonacci, or by recursion

Example run:
Please enter the first number: 45
Please enter the second number: 30
The GCD of 45 and 30 is 15
 */

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.print("Please enter the first number: ");
        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt();
        System.out.print("Please enter the second number: ");
        int secondNumber = in.nextInt();
        int gcd = gcd(firstNumber, secondNumber);
        System.out.printf("The GCD of %d and %d is %d.", firstNumber, secondNumber, gcd);
    }

    private static int gcd(int firstNumber, int secondNumber) {
        if (secondNumber == 0) return firstNumber;
        else return gcd(secondNumber, firstNumber % secondNumber);
    }

    // Using iteration; as is typical, it is more code than the recursive solution, but possibly easier to understand.
//    private static int gcd(int firstNumber, int secondNumber) {
//        while (secondNumber > 0) {
//            int remainder = firstNumber % secondNumber;
//            firstNumber = secondNumber;
//            secondNumber = remainder;
//        }
//        return firstNumber;
//    }
}
