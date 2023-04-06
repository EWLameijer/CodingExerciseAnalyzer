package exercises;

// TAGS Math.sqrt(), operators-logical, operators-arithmetic, Scanner, Scanner.nextInt(), System.out.print()

/* DESCRIPTION
Calculate the area of a triangle based on the length of its sides (you can find the formula after some googling).
If the triangle cannot exist (one side is longer that the other two combined) report so.

Input 1:
Enter the length of the first side: 2
Enter the length of the second side: 3
Enter the length of the third side: 4
Output 1:
The area of the triangle is: 2.9047375096555625

Input 2:
Enter the length of the first side: 2
Enter the length of the second side: 3
Enter the length of the third side: 6

Output 2:
Such a triangle does not exist!

HINT: if you can't easily find the formula, try https://www.cuemath.com/measurement/area-of-triangle-with-3-sides/
 */

import java.util.Scanner;

public class AreaOfTriangleBasedOnSides {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the first side: ");
        int a = in.nextInt();

        System.out.print("Enter the length of the second side: ");
        int b = in.nextInt();

        System.out.print("Enter the length of the third side: ");
        int c = in.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("The area of the triangle is: " + area);
        } else System.out.println("Such a triangle does not exist!");
    }
}
