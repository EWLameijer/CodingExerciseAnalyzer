package exercises;

// TAGS classes, constructors, methods, parameters, private, public, getters, return,
// setters, Scanner, Scanner.nextInt(), System.out.print()

/* DESCRIPTION
Ask the user for two numbers, assign them to variables, then swap those variables (so if firstNumber starts at 2 and
secondNumber starts at 7, then after the swap firstNumber should be 7 and secondNumber should be 2).

To make this extra difficult, swap them via a method!

Of course, a method static void swap(int a, int b) { int temp = a; a =b; b =temp; } would NOT work because
you cannot change the value of parameters. So you should make a kind of Pair object that houses the a and b; since
you can modify the _contents_ of an object given as parameter to a method.

So the easiest would be to make a separate Pair class to contain the a and b values, and create a method
void swap(Pair pair)

HINT: try to make Pair a proper Java class, with private fields, a constructor, and public getters and setters.
IntelliJ (Alt+Insert) can help a lot with that!

Sample run:
Enter the value for a: 2
Enter the value for b: 7
a is now: 7
b is now: 2
 */

import java.util.Scanner;

class Pair {
    private int firstNumber;
    private int secondNumber;

    public Pair(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
}

public class SwapTwoNumbersUsingAMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value for a: ");
        int a = in.nextInt();
        System.out.print("Enter the value for b: ");
        int b = in.nextInt();
        Pair pair = new Pair(a, b);
        swap(pair);
        System.out.println("a is now: " + pair.getFirstNumber());
        System.out.println("b is now: " + pair.getSecondNumber());
    }

    private static void swap(Pair pair) {
        int temp = pair.getFirstNumber();
        pair.setFirstNumber(pair.getSecondNumber());
        pair.setSecondNumber(temp);
    }
}
