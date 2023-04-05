package exercises;

// TAGS Array.index, Array.length, arrays, for-loops, if, methods, operators-logical, operators-relational, parameters, return

/* DESCRIPTION
https://codingbat.com/prob/p110019
Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.

array667(new int[]{6, 6, 2}) → 1
array667(new int[]{6, 6, 2, 6}) → 1
array667(new int[]{6, 7, 2, 6}) → 1
 */

public class Array667 {
    public static void main(String[] args) {
        System.out.println(array667(new int[]{6, 6, 2}));
        System.out.println(array667(new int[]{6, 6, 2, 6}));
        System.out.println(array667(new int[]{6, 7, 2, 6}));
    }

    private static int array667(int[] numbers) {
        int count = 0;
        // Note: iterate to length-1, so can use i+1 in the loop
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 6) {
                if (numbers[i + 1] == 6 || numbers[i + 1] == 7) {
                    count++;
                }
            }
        }
        return count;
    }
}
