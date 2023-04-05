package exercises;

// TAGS boolean, int, if, for-loops, methods, parameters, operators-logical, operators-relational, return, String, String.charAt()

/* DESCRIPTION
https://codingbat.com/prob/p173784
Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
public class StringE {
    public static void main(String[] args) {
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));
    }

    private static boolean stringE(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'e') count++;
            // alternately: str.substring(i, i+1).equals("e")
            // or for (char ch : text.toCharArray()) if (ch == 'e') count++;
        }

        return (count >= 1 && count <= 3);
    }
}
