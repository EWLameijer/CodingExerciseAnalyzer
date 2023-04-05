package exercises;

// TAGS boolean, Array.index, Array.length, arrays, for-loops, if, Math.abs(), methods, parameters, return

/* DESCRIPTION
https://codingbat.com/prob/p167430
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

has271(new int[]{1, 2, 7, 1}) → true
has271(new int[]{1, 2, 8, 1}) → false
has271(new int[]{2, 7, 1]}) → true
 */

public class Has271 {
    public static void main(String[] args) {
        System.out.println(has271(new int[]{1, 2, 7, 1}));
        System.out.println(has271(new int[]{1, 2, 8, 1}));
        System.out.println(has271(new int[]{2, 7, 1}));
    }

    private static boolean has271(int[] numbers) {
        // Iterate < length-2, so can use i+1 and i+2 in the loop.
        // Return true immediately when seeing 271.
        for (int i = 0; i < numbers.length - 2; i++) {
            int val = numbers[i];
            if (numbers[i + 1] == (val + 5) &&              // the "7" check
                    Math.abs(numbers[i + 2] - (val - 1)) <= 2) {  // the "1" check
                return true;
            }
        }

        // If we get here ... none found.
        return false;
    }
}
