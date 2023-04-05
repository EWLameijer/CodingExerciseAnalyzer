package exercises;

// TAGS methods, operators-logical, operators-relational, parameters, return

/* DESCRIPTION
https://codingbat.com/prob/p178986
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 30, 7) → false
 */
public class HasTeen {
    public static void main(String[] args) {
        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(20, 19, 10));
        System.out.println(hasTeen(20, 30, 7));
    }

    private static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        // Here it is written as one big expression,
        // vs. a series of if-statements.
        return (firstNumber>=13 && firstNumber<=19) ||
                (secondNumber>=13 && secondNumber<=19) ||
                (thirdNumber>=13 && thirdNumber<=19);
    }

    // alternative 1
    // private static boolean isTeen(int number) { return number >= 13 && number <= 19}
    // private static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) { return
    // isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber)

    // alternative 2 (with varargs). Also works if there are 1, 2 or more than 3 arguments
//    private static boolean hasTeen(int... numbers) {
//        for (int number : numbers) {
//            if (number >= 13 && number <= 19) return true;
//        }
//        return false;
//    }
}
