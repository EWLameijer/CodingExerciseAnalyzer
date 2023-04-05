package exercises;

// TAGS for-loops, System.out.printf

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to create and display unique (a certain digit cannot occur more than once in a number)
three-digit numbers using 1, 2, 3, 4. Also count how many three-digit numbers are there.
Expected Output

123
124
...

431
432
Total number of three-digit-numbers is 24
 */

public class CreateThreeDigitNumbers {
    public static void main(String[] args) {
        int count = 0;
        for (int firstDigit = 1; firstDigit <= 4; firstDigit++) {
            for (int secondDigit = 1; secondDigit <= 4; secondDigit++) {
                for (int thirdDigit = 1; thirdDigit <= 4; thirdDigit++) {
                    if (thirdDigit != firstDigit && thirdDigit != secondDigit && firstDigit != secondDigit) {
                        count++;
                        System.out.printf("%d%d%d%n", firstDigit, secondDigit, thirdDigit);
                    }
                }
            }
        }
        System.out.println("Total number of three-digit-numbers is " + count);
    }
}
