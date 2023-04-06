package exercises;

// TAGS methods, parameters, return, String, String-concatenation

/* DESCRIPTION
https://edabit.com/challenge/ZuoKAgmH8G2vHtLzi
Write a function that returns the string "something" joined with a space " " and the given argument a.

Examples
giveMeSomething("is better than nothing") ➞ "something is better than nothing"
giveMeSomething("Bob Jane") ➞ "something Bob Jane"
giveMeSomething("something") ➞ "something something"

Notes: Assume an input is given.
 */

public class ReturnSomethingToMe {
    public static void main(String[] args) {
        System.out.println(giveMeSomething("is better than nothing"));
        System.out.println(giveMeSomething("Bob Jane"));
        System.out.println(giveMeSomething("something"));
    }

    private static String giveMeSomething(String text) {
        return "something " + text;
    }
}
