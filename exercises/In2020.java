package exercises;

// TAGS methods, operators-logical, operators-relational, parameters, return

/* DESCRIPTION
https://codingbat.com/prob/p144535
Given 2 int values, return true if either of them is in the range 10..20 inclusive.

in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
 */
public class In2020 {
    public static void main(String[] args) {
        System.out.println(in1020(12, 99));
        System.out.println(in1020(21, 12));
        System.out.println(in1020(8, 99) );
    }

    private static boolean in1020(int firstNumber, int secondNumber) {
        return ((firstNumber >= 10 && firstNumber <= 20) || (secondNumber >= 10 && secondNumber <= 20));
    }
}
