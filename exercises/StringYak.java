package exercises;

// TAGS for-loops, if, methods, parameters, return, String, String.charAt(), String.length(), String-concatenation

/* DESCRIPTION
https://codingbat.com/prob/p126212
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.

stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
 */
public class StringYak {
    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya"));
    }

    private static String stringYak(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            // Look for i starting a "yak" -- advance i in that case
            if (i + 2 < text.length() && text.charAt(i) == 'y' && text.charAt(i + 2) == 'k') {
                i = i + 2;
            } else { // Otherwise do the normal append
                result = result + text.charAt(i);
            }
        }

        return result;
    }
}
