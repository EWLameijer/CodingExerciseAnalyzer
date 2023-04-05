package exercises;

// TAGS boolean, if, methods, parameters, return, String, String.equals(), String.length(), String.substring()

/* DESCRIPTION
https://codingbat.com/prob/p191022
Given a string, return true if the string starts with "hi" and false otherwise.

startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */

public class StartHi {
    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("hello hi"));
    }

    private static boolean startHi(String text) {
        // First test if the string is not at least length 2
        // (so the substring() below does not go past the end).
        if (text.length() < 2) return false;

        // Pull out the string of the first two chars
        String firstTwo = text.substring(0, 2);

        // Test if it is equal to "hi"
        if (firstTwo.equals("hi")) {
            return true;
        } else {
            return false;
        }
        // This last part can be shortened to: return(firstTwo.equals("hi"));
    }
}
