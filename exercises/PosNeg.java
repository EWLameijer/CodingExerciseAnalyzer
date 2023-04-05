package exercises;

// TAGS boolean, if, int, methods, operators-logical, operators-relational, parameters, return

/* DESCRIPTION
https://codingbat.com/prob/p159227
Given 2 int values, return true if one is negative and one is positive.
Except if the parameter "negative" is true, then return true only if both are negative.

posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
 */

public class PosNeg {
    public static void main(String[] args) {
        System.out.println(posNeg(1, -1, false));
        System.out.println(posNeg(-1, 1, false));
        System.out.println(posNeg(-4, -5, true));
    }

    private static boolean posNeg(int firstNumber, int secondNumber, boolean negative) {
        if (negative) {
            return (firstNumber < 0 && secondNumber < 0);
        }
        else {
            return ((firstNumber < 0 && secondNumber > 0) || (firstNumber > 0 && secondNumber < 0));
        }
    }
}
