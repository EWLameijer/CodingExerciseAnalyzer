package exercises;

// TAGS ArrayList, debugging, for-loops, List, List.add(), methods, parameters, return

/* DESCRIPTION
https://edabit.com/challenge/sn9KfW72BBoT7eesC
Buggy Code (Part 5)
Mubashir created an infinite loop! Help him by fixing the code in the code tab to pass this challenge. Look at the
examples below to get an idea of what the function should do.

Examples
PrintArray(1) ➞ [1]

PrintArray(3) ➞ [1, 2, 3]

PrintArray(6) ➞ [1, 2, 3, 4, 5, 6]
Notes
READ EVERY WORD CAREFULLY, CHARACTER BY CHARACTER!
Don't overthink this challenge; it's not supposed to be hard.

class InfiniteLoop {
    public static void main(String[] args) {
        System.out.println(printArray(1));
        System.out.println(printArray(3));
        System.out.println(printArray(6));
    }

  public static List printArray(int number)
  {
    List array = new ArrayList<>();

    for(int count = 1; count <= number;) {
      array.add(count);
    }

    return array;
  }
}
 */

import java.util.ArrayList;
import java.util.List;

class InfiniteLoop {
    public static void main(String[] args) {
        System.out.println(printArray(1));
        System.out.println(printArray(3));
        System.out.println(printArray(6));
    }

    public static List printArray(int number) {
        List array = new ArrayList<>();
        // note: using List without <> is terrible programming style. Was needed in the late 90's, but nowadays
        // you always want List<Integer> or List<String> or List<Whatever>
        // In this case, you should use List<Integer> array = new ArrayList<>();

        for (int count = 1; count <= number; count++) { // of course, IntellJ spotted the bug. Use IDEA! "count was
            // not updated in the original
            array.add(count);
        }

        return array;
    }
}
