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
        return text.startsWith("ix", 1);
    }
}
