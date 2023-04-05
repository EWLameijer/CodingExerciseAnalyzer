package exercises;

// TAGS methods, operators-logical, operators-relational, parameters, String, String.charAt(), String-concatenation

/* DESCRIPTION
https://codingbat.com/prob/p199720
Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 */
public class StartOz {
    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
    }

    private static String startOz(String text) {
        String result = "";

        if (text.length() >= 1 && text.charAt(0) == 'o') {
            result = result + text.charAt(0);
        }

        if (text.length() >= 2 && text.charAt(1) == 'z') {
            result = result + text.charAt(1);
        }

        return result;
    }
}
