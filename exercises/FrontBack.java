package exercises;

// TAGS methods, parameters, return, String, String.charAt(), String.length(), String.substring(), String-concatenation

/* DESCRIPTION
https://codingbat.com/prob/p123384
Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */

public class FrontBack {
    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }

    private static String frontBack(String text) {
        if (text.length() <= 1) return text;

        String mid = text.substring(1, text.length() - 1);

        // last + mid + first
        return text.charAt(text.length() - 1) + mid + text.charAt(0);
    }
}
