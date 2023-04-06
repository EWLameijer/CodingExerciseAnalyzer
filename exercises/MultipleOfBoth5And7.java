package exercises;

// TAGS remainder-operator, Scanner, Scanner.nextInt(), System.out.print()

/* DESCRIPTION
Check whether a given integer is a multiple of both 5 and 7.

Example:
Enter an integer: 35
35 is a multiple of both 5 and 7

Another example:
Enter an integer: 42
42 is not a multiple of both 5 and 7
 */


import java.util.Scanner;

public class MultipleOfBoth5And7 {

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if ((number % 5 == 0) && (number % 7 == 0)) {
            System.out.println(number + " is a multiple of both 5 and 7");
        } else {
            System.out.println(number + " is not a multiple of both 5 and 7");
        }
    }
}

