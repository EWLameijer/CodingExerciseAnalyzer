package exercises;

// TAGS Array.length, Array.index, boolean, for-loops, methods, operators-logical, operators-relational, parameters, return, varargs

/* DESCRIPTION
https://codingbat.com/prob/p170221
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
Note: you can use a varargs argument to pass a sequence of integers (like 1, 2, 5) as an array
boolean noTriples(int... numbers)

noTriples(1, 1, 2, 2, 1) → true
noTriples(1, 1, 2, 2, 2, 1) → false
noTriples(1, 1, 1, 2, 2, 2, 1) → false
 */
public class NoTriples {
    public static void main(String[] args) {
        System.out.println(noTriples(1, 1, 2, 2, 1));
        System.out.println(noTriples(1, 1, 2, 2, 2, 1));
        System.out.println(noTriples(1, 1, 1, 2, 2, 2, 1));
    }

    private static boolean noTriples(int... numbers) {
        // Iterate < length-2, so can use i+1 and i+2 in the loop.
        // Return false immediately if every seeing a triple.
        for (int i = 0; i < numbers.length - 2; i++) {
            int first = numbers[i];
            if (numbers[i + 1] == first && numbers[i + 2] == first) return false;
        }

        // If we get here ... no triples.
        return true;
    }
}
