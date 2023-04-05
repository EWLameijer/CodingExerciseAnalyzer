package exercises;

// TAGS for-loops, if, methods, parameters, return, String, String.equals(), String.length(), String.substring()

/* DESCRIPTION
https://codingbat.com/prob/p178318
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
 */
public class Last2 {
    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
    }

    private static int last2(String text) {
        // Screen out too-short string case.
        if (text.length() < 2) return 0;

        String end = text.substring(text.length() - 2);
        // Note: substring() with 1 value goes through the end of the string
        int count = 0;

        // Check each substring length 2 starting at i
        for (int i = 0; i < text.length() - 2; i++) {
            String sub = text.substring(i, i + 2);
            if (sub.equals(end)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }
}
