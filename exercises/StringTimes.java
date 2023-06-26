package exercises;

// TAGS for-loops, methods, parameters, return, String, String-concatenation

/* DESCRIPTION
https://codingbat.com/prob/p142270
Given a string and a non-negative int n, return a larger string that is n copies of the original string.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */
public class StringTimes {
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));
    }

    private static String stringTimes(String text, int numberOfTimes) {
        return text.repeat(numberOfTimes);
    }
}
