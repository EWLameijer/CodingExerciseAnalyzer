package exercises;

// TAGS methods, operators-arithmetic, operators-relational, parameters, return

/* DESCRIPTION
https://codingbat.com/prob/p154485
Given two int values, return their sum. Unless the two values are the same, then return double their sum.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
 */
public class SumDouble {
    public static void main(String[] args) {
        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));
    }

    private static int sumDouble(int firstNumber, int secondNumber) {
        // Store the sum in a local variable
        int sum = firstNumber + secondNumber;

        // Double it if a and b are the same
        if (firstNumber == secondNumber) {
            sum = sum * 2;
        }

        return sum;
    }
}
