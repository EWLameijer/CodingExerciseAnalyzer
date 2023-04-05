package exercises;

// TAGS for-loops, Math.min(), methods, operators-relational, parameters, return, String, String.length(), String.substring(), String-concatenation

/* DESCRIPTION
https://codingbat.com/prob/p101475
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */
public class FrontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
    }

    private static String frontTimes(String text, int number) {
        int frontLen = 3;
        if (frontLen > text.length()) {
            frontLen = text.length();
        }
        // int frontLen = Math.min(3, text.length()); would also be possible
        String front = text.substring(0, frontLen);

        String result = "";
        for (int i = 0; i < number; i++) {
            result = result + front;
        }
        return result;
    }
}
