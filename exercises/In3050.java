package exercises;

// TAGS boolean, if, methods, operators-logical, operators-relational, parameters, return

/* DESCRIPTION
https://codingbat.com/prob/p132134
Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.

in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
 */
public class In3050 {
    public static void main(String[] args) {
        System.out.println(in3050(30, 31));
        System.out.println(in3050(30, 41));
        System.out.println(in3050(40, 50));
    }

    private static boolean in3050(int firstNumber, int secondNumber) {
        if (firstNumber >= 30 && firstNumber <= 40 && secondNumber >= 30 && secondNumber <= 40) {
            return true;
        }
        if (firstNumber >= 40 && firstNumber <= 50 && secondNumber >= 40 && secondNumber <= 50) {
            return true;
        }
        return false;
        // This could be written as one very large expression,
        // connecting the two main parts with ||
    }
}
