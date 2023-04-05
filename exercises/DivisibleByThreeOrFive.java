package exercises;

// TAGS if, for-loops, remainder-operator, System.out.print()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
Sample Output:

Divisible by 3:
3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,

Divisible by 5:
5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90,
95,

Divisible by 3 & 5:
15, 30, 45, 60, 75, 90,
 */

public class DivisibleByThreeOrFive {
    public static void main(String[] args) {
        System.out.println("Divisible by 3: ");
        for (int number = 1; number < 100; number++) {
            if (number % 3 == 0)
                System.out.print(number + ", ");
        }

        System.out.println("\n\nDivisible by 5: ");
        for (int number = 1; number < 100; number++) {
            if (number % 5 == 0) System.out.print(number + ", ");
        }

        System.out.println("\n\nDivisible by 3 & 5: ");
        for (int number = 1; number < 100; number++) {
            if (number % 3 == 0 && number % 5 == 0) System.out.print(number + ", ");
        }
//        // NOTE: the trailing comma's don't look very nice, when you learn about ArrayLists and String.join, you can try
//        System.out.println("\n\nDivisible by 3 & 5: ");
//        List<String> divisibleBy3And5 = new ArrayList<>();
//        for (int number = 1; number < 100; number++) {
//            if (number % 3 == 0 && number % 5 == 0) divisibleBy3And5.add("" + number);
//        }
//        System.out.println(String.join(", ", divisibleBy3And5));
//        // NOTE 2: if you REALLY love a challenge, you can try to factor out the loop using varargs. But as in all cases
//        // if you can solve this in any way, however ugly, you are training those Java skills you need to be able to
//        // make the jump to professional programming
    }
}
