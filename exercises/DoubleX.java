package exercises;

// TAGS boolean, methods, operators-relational, parameters, return, String, String.charAt(), String.indexOf(), String.length(), String.startsWith()

/* DESCRIPTION
https://codingbat.com/prob/p186759
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true

 */
public class DoubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
    }

    private static boolean doubleX(String text) {
        int i = text.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i + 1 >= text.length()) return false; // check i+1 in bounds?
        return text.charAt(i + 1) == 'x';

        // Another approach -- .startsWith() simplifies the logic
        // String x = str.substring(i);
        // return x.startsWith("xx");
    }
}
