package exercises;

// TAGS methods, operators-relational, parameters, return, String, String.length()

/* DESCRIPTION
https://edabit.com/challenge/a9Shdt64Ak2Hwq7oP
Compare Strings by Count of Characters
Create a function that takes two strings as arguments and return either true or false depending on whether the
total number of characters in the first string is equal to the total number of characters in the second string.

Examples
comp("AB", "CD") ➞ true
comp("ABC", "DE") ➞ false
comp("hello", "edabit") ➞ false
Notes
Don't forget to return the result.
 */

public class CompareStringsByCountOfCharacters {
    public static void main(String[] args) {
        System.out.println(comp("AB", "CD"));
        System.out.println(comp("ABC", "DE"));
        System.out.println(comp("hello", "edabit"));
    }

    private static boolean comp(String firstText, String secondText) {
        return firstText.length() == secondText.length();
    }
}
