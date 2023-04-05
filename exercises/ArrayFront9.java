package exercises;

// TAGS Array.index, Array.length, arrays, boolean, for-loops, if, methods, operators-relational, parameters, return

/* DESCRIPTION
https://codingbat.com/prob/p186031
Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.

arrayFront9(new int[]{1, 2, 9, 3, 4}) → true
arrayFront9(new int[]{1, 2, 3, 4, 9}) → false
arrayFront9(new int[]{1, 2, 3, 4, 5}) → false
 */
public class ArrayFront9 {
    public static void main(String[] args) {
        System.out.println(arrayFront9(new int[]{1, 2, 9, 3, 4}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 9}));
        System.out.println(arrayFront9(new int[]{1, 2, 3, 4, 5}));
    }

    private static boolean arrayFront9(int[] numbers) {
        // First figure the end for the loop
        int end = numbers.length;
        if (end > 4) end = 4;

        for (int i = 0; i < end; i++) {
            if (numbers[i] == 9) return true;
        }

        return false;
    }
}
