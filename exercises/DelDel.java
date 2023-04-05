package exercises;

// TAGS methods, operators-logical, operators-relational, parameters, return, String, String.charAt(), String.length(), String.startsWith(), String.substring(), String-concatenation

/* DESCRIPTION
https://codingbat.com/prob/p100905
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
 */
public class DelDel {
    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));
    }

    private static String delDel(String text) {
        if (text.length() >= 4 && text.startsWith("del", 1)) {
            // First char + rest of string starting at 4
            return text.charAt(0) + text.substring(4);
        }
        // Otherwise return the original string.
        return text;
    }
}
