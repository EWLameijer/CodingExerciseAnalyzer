package exercises;

// TAGS methods, parameters, return, String, String.length(), String.substring, String-concatenation

/* DESCRIPTION
// https://codingbat.com/prob/p161642
Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
 */

public class BackAround {
    public static void main(String[] args) {
        System.out.println(backAround("cat"));
        System.out.println(backAround("Hello"));
        System.out.println(backAround("a"));
    }

    private static String backAround(String text) {
        String last = text.substring(text.length() - 1);
        return last + text + last;
    }
}
