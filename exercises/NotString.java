package exercises;

// TAGS methods, operators-logical, operators-relational, parameters, return, String, String.equals(), String.length(), String.startsWith, String.substring, String-concatenation,

/* DESCRIPTION
https://codingbat.com/prob/p191914
Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
 */
public class NotString {
    public static void main(String[] args) {
        System.out.println(notString("candy"));
        System.out.println(notString("x") );
        System.out.println(notString("not bad"));
    }

    private static String notString(String text) {
        if (text.length() >= 3 && text.substring(0, 3).equals("not")) {
            return text;
        }
        // you can also use text.startsWith("not")

        return "not " + text;
    }
}
