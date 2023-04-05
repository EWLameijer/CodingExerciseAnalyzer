package exercises;

// TAGS if, methods, operators-relational, parameters, return, String, String.length(), String.substring(), String.toUpperCase(), String-concatenation

/* DESCRIPTION
https://codingbat.com/prob/p125268
Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
 */
public class EndUp {
    public static void main(String[] args) {
        System.out.println(endUp("Hello")  );
        System.out.println(endUp("hi there"));
        System.out.println(endUp("hi") );
    }

    private static String endUp(String text) {
        if (text.length() <= 3) return text.toUpperCase();
        int cut = text.length() - 3;
        String front = text.substring(0, cut);
        String back  = text.substring(cut);  // this takes from cut to the end

        return front + back.toUpperCase();
    }
}
