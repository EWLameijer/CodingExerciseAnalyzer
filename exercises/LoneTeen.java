package exercises;

// TAGS boolean, methods, operators-logical, operators-relational, parameters, return

/* DESCRIPTION
https://codingbat.com/prob/p165701
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.

loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
*/
public class LoneTeen {
    public static void main(String[] args) {
        System.out.println(loneTeen(13, 99));
        System.out.println(loneTeen(21, 19));
        System.out.println(loneTeen(13, 13));
    }

    private static boolean loneTeen(int firstAge, int secondAge) {
        // Store teen-ness in boolean local vars first. Boolean local
        // vars like this are a little rare, but here they work great.
        boolean aTeen = (firstAge >= 13 && firstAge <= 19);
        boolean bTeen = (secondAge >= 13 && secondAge <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
        // Translation: one or the other, but not both.
        // Alternately could use the Java xor operator (^), but it's obscure.
    }
}
