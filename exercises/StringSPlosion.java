package exercises;

// TAGS methods, parameters, return, String, String.length(), String.substring(), String-concatenation

/* DESCRIPTION
https://codingbat.com/prob/p117334
Given a non-empty string like "Code" return a string like "CCoCodCode".

stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
 */
public class StringSPlosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }

    private static String stringSplosion(String text) {
        String result = "";
        // On each iteration, add the substring of the chars 0..i
        for (int i = 0; i < text.length(); i++) {
            result = result + text.substring(0, i + 1);
        }
        return result;
    }
}
