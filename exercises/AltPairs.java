package exercises;

// TAGS if, for-loops, methods, operators-relational, parameters, return, String, String.length(), String-concatenation
/* DESCRIPTION
https://codingbat.com/prob/p121596
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
 */

public class AltPairs {
    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }

    private static String altPairs(String text) {
        String result = "";

        // Run i by 4 to hit 0, 4, 8, ...
        for (int i = 0; i < text.length(); i += 4) {
            // Append the chars between i and i+2
            int end = i + 2;
            if (end > text.length()) {
                end = text.length();
            }
            result = result + text.substring(i, end);
        }

        return result;
    }
}
