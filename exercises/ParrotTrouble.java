package exercises;

// TAGS boolean, int, methods, operators-logical, parameters, return,

/* DESCRIPTION
https://codingbat.com/prob/p140449
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false
 */

public class ParrotTrouble {
    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 6) );
        System.out.println(parrotTrouble(true, 7) );
        System.out.println(parrotTrouble(false, 6));
    }

    private static boolean parrotTrouble(boolean isTalking, int hour) {
        return (isTalking && (hour < 7 || hour > 20));
        // Need extra parenthesis around the || clause
        // since && binds more tightly than ||
        // && is like arithmetic *, || is like arithmetic +
    }
}
