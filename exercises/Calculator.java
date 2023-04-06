package exercises;

// TAGS double, exceptions, operators-arithmetic, operators-logical, operators-relational, return, switch-expressions,
// Scanner, Scanner.nextDouble(), Scanner.nextInt()

/* DESCRIPTION
Create a simple calculator, where the user can choose addition, subtraction, multiplication and division.
After choosing an operation, the user should enter two numbers. The program then displays the result.
Don't forget to handle errors: if the user types 0 or -5 or 7, no calculation should take place!

HINT: Switch statements (or switch expressions) may be useful here.

Example run 1:

1. Addition
2. Subtraction
3. Multiplication
4. Division

Enter Your Choice : 2
Please enter the first number: 17.8
Please enter the second number: 4.5
The result is 13.3

Example run 2:
1. Addition
2. Subtraction
3. Multiplication
4. Division

Enter Your Choice : 5
5 is not a valid choice!
*/

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division\n");
        System.out.print("Enter Your Choice : ");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if (choice < 1 || choice > 4) {
            System.out.println(choice + " is not a valid choice!");
            return;
        }
        System.out.print("Please enter the first number: ");
        double firstNumber = in.nextDouble();
        System.out.print("Please enter the second number: ");
        double secondNumber = in.nextDouble();
        double result = switch (choice) {
            case 1 -> firstNumber + secondNumber;
            case 2 -> firstNumber - secondNumber;
            case 3 -> firstNumber * secondNumber;
            case 4 -> firstNumber / secondNumber;
            default -> throw new IllegalArgumentException(choice + " is not a valid choice!");
        };
        System.out.println("The result is " + result);
    }
}
