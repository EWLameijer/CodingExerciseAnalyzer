package exercises;

// TAGS if, methods, parameters, return, String, String.length(), String.substring()

/* DESCRIPTION
https://codingbat.com/prob/p183592
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
 */

public class Front22 {
    public static void main(String[] args) {
        System.out.println(front22("kitten"));
        System.out.println(front22("Ha") );
        System.out.println(front22("abc") );
    }

    private static String front22(String text) {
        // First figure the number of chars to take
        int take = 2;
        if (take > text.length()) {
            take = text.length();
        }

        String front = text.substring(0, take);
        return front + text + front;
    }
}
