package exercises;

import java.util.Scanner;

// TAGS double, if, Math.sqrt(), operators-arithmetic, Scanner, Scanner.nextInt(), System.out.print()

/* DESCRIPTION
Find the roots of a quadratic equation, given its coefficients.

Example:
Enter the first coefficient: 4
Enter the second coefficient: 7
Enter the third coefficient: 2
The roots are real and distinct.
The root1 is: -0.3596117967977924
The root2 is: -1.3903882032022077
 */
public class QuadraticEquationRoots {
    public static void main(String[] args) {
        System.out.print("Enter the first coefficient: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextInt();
        System.out.print("Enter the second coefficient: ");
        double b = input.nextInt();
        System.out.print("Enter the third coefficient: ");
        double c = input.nextInt();

        if (a != 0.0) {
            double d = b * b - 4 * a * c;
            if (d == 0.0) {
                System.out.println("There is only one root.");
                double r = -b / (2 * a);
                System.out.println("The root is " + r);
            } else if (d > 0.0) {
                System.out.println("The roots are real and distinct.");
                double rootOfD = Math.sqrt(d);
                double r1 = (-b + rootOfD) / (2 * a);
                double r2 = (-b - rootOfD) / (2 * a);
                System.out.println("The root1 is: " + r1);
                System.out.println("The root2 is: " + r2);
            } else {
                System.out.println("The roots are imaginary.");
                double rp = -b / (2 * a);
                double ip = Math.sqrt(-d) / (2 * a);
                System.out.println("The root1 is: " + rp + "+ i" + ip);
                System.out.println("The root2 is: " + rp + "- i" + ip);
            }
        } else {
            System.out.println("Not a quadratic equation.");
        }
    }
}
