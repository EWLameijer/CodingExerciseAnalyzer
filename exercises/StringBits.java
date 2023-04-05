package exercises;

// TAGS for-loops, methods, parameters, return, String, String.charAt(), String.length(), String-concatenation


/* DESCRIPTION
https://codingbat.com/prob/p165666
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
 */
public class StringBits {
    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));
    }

    private static String stringBits(String text) {
        String result = "";
        // Note: the loop increments i by 2
        for (int i = 0; i < text.length(); i += 2) {
            result = result + text.charAt(i);
        }
        return result;
    }
}
