package exercises;

// TAGS boolean, if, methods, operators-logical, parameters, return

/* DESCRIPTION
https://codingbat.com/prob/p187868

Create a method, boolean sleepIn(boolean weekday, boolean vacation)

The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
 */
public class Sleepin {
    public static void main(String[] args) {
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    // shorter version (also suggested by IntelliJ)
    // public static boolean sleepIn2(boolean weekday, boolean vacation) { return !weekday || vacation;    }
}

// Solution notes: better to write "vacation" than "vacation == true"
// though they mean exactly the same thing.
// Likewise "!weekday" is better than "weekday == false".
// This all can be shortened to: return (!weekday || vacation);
// Here we just put the return-false last, or could use an if/else.

