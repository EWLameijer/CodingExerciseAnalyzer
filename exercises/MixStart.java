package exercises;

// TAGS boolean, if, methods, operators-relational, parameters, return, String, String.equals(), String.length(), String.substring()

/* DESCRIPTION
https://codingbat.com/prob/p151713
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 */

public class MixStart {
    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("pix snacks"));
        System.out.println(mixStart("piz snacks"));
    }

    private static boolean mixStart(String text) {
        // Check if string is too small
        // (so substring() below does not go off the end)
        if (text.length() < 3) return false;

        // Pull out length 2 string for the "ix" part
        // (i.e. substring starting at index 1 and stopping just before 3).
        String two = text.substring(1, 3);

        if (two.equals("ix")) {
            return true;
        } else {
            return false;
        }
        // This last part can be shortened to just:
        // return(two.equals("ix"));
    }
}
