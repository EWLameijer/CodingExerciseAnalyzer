package exercises;

// TAGS if, methods, parameters, return, String, String.length(), String.substring(), String-concatenation

/* DESCRIPTION
https://codingbat.com/prob/p136351
Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
 */

public class Front3 {
    public static void main(String[] args) {
        System.out.println(front3("Java") );
        System.out.println(front3("Chocolate"));
        System.out.println(front3("abc"));
    }

    private static String front3(String text) {
        String front;

        if (text.length() >= 3) {
            front = text.substring(0, 3);
        }
        else {
            front = text;
        }
        // String front = text.length() >= 3? text.substring(0, 3) : text; would also work

        return front + front + front;
    }
}
