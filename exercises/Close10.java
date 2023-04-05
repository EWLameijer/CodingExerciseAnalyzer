package exercises;

// TAGS if, int, Math.abs(), methods, operators-relational, parameters, return

/* DESCRIPTION
https://codingbat.com/prob/p172021
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
 */
public class Close10 {
    public static void main(String[] args) {
        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));
    }

    private static int close10(int firstNumber, int secondNumber) {
        int aDiff = Math.abs(firstNumber - 10);
        int bDiff = Math.abs(secondNumber - 10);

        if (aDiff < bDiff) {
            return firstNumber;
        }
        if (bDiff < aDiff) {
            return secondNumber;
        }
        return 0;  // i.e. aDiff == bDiff

        // Solution notes: aDiff/bDiff local vars clean the code up a bit.
        // Could have "else" before the second if and the return 0.
    }
}
