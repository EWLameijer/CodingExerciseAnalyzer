package exercises;

// TAGS assignment

/* DESCRIPTION
Write a Java program to swap two variables.
Expected output:
Before swapping : a, b = 15, 27
After swapping : a, b = 27, 15
 */

public class SwapTwoVariables {
    public static void main(String[] args) {
        int a = 15;
        int b = 27;
        System.out.println("Before swapping : a, b = " + a + ", " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = " + a + ", " + b);
    }
}
