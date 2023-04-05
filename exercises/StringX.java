package exercises;

// TAGS for-loops, if, methods, operators-relational, parameters, return, String, String.charAt(), String.length(), String-concatenation

/* DESCRIPTION
https://codingbat.com/prob/p171260
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */
public class StringX {
    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }

    private static String stringX(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            // Only append the char if it is not the "x" case
            if (!(i > 0 && i < text.length() - 1 && text.charAt(i) == 'x')) {
                result += text.charAt(i);
            }
        }
        return result;
    }
}
