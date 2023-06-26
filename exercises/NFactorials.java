package exercises;

import java.math.BigInteger;
import java.util.Scanner;

// TAGS BigInteger, BigInteger.multiply(), BigInteger.ONE,
// for-loops, int, operators-arithmetic, Scanner, Scanner.nextInt(), System.out.print()


/* DESCRIPTION
Ask the user for a number (say: 10) and calculate the first 10 factorials, which would be
1! = 1, 2! = 2, 3! = 6, 4! = 24, 5! = 120, 6! = 720, 7! = 5040, 8! = 40320, 9! = 362880, 10! = 3628800,

If you haven't encountered factorials before: the factorial is the number x number -1 x number - 2 .. 1
So 1! = 1, 2! = 2x1 = 2, 3! = 3 x 2 x 1 = 6, 4! = 4 x 3 x 2 x 1 = 24 etc.
See also https://en.wikipedia.org/wiki/Factorial

If you experiment, you see that the numbers first get bigger, as you'd expect, but 17! is negative!
(17! = -288522240, to be exact). While it should be 355687428096000. In fact even 16! and a few of the previous
factorials are incorrect; they are numbers larger than Integer.MAX_VALUE == 2147483647 (or 2 billion), so they
cannot be correctly stored in an int (this is also known as integer overflow,
 https://en.wikipedia.org/wiki/Integer_overflow)

You expected them to be negative? Well, integer overflow can also produce positive numbers, so if you want to guard
against it, you should know very well that the numbers you are generating are in the int range, or guard against it,
by using factorial = Math.multiplyExact(factorial, i);, which will show you in this case that things already go wrong
at 13! (which looks innocent at first glance '13! = 1932053504'. But actually, 13! is 6227020800)

Of course, I may have mentioned longs, but even a long cannot keep a factorial in check for very long - actually, it
will falter at 21!

So if you want really nice, big factorials, you need something bigger than long. "But long is already the biggest
integer primitive". Yes, it is, but there is a Java _class_ that can help where primitives falter: BigInteger
 (https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/math/BigInteger.html).

So make the program able to print all factorials up to 100 correctly!

Sample run:
Please enter the number of factorials you wish to calculate: 100
1! = 1, 2! = 2, 3! = 6, 4! = 24, 5! = 120, 6! = 720, 7! = 5040, 8! = 40320, 9! = 362880, 10! = 3628800, 11! = 39916800,
...
100! = 93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000,
 */
public class NFactorials {
    public static void main(String[] args) {
        System.out.print("Please enter the number of factorials you wish to calculate: ");
        Scanner in = new Scanner(System.in);
        int numberOfFactorials = in.nextInt();

        for (int number = 1; number <= numberOfFactorials; number++) {
            BigInteger factorial = BigInteger.ONE;
            for (int i = 1; i <= number; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            System.out.print(number + "! = " + factorial + ", ");
            // bonus: if you don't like the trailing comma (I don't) you can try
            // System.out.print(number + "! = " + factorial);
            // if (i < number) System.out.print(", ");
        }
    }
}
