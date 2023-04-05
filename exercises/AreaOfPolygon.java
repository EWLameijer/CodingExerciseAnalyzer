package exercises;

// TAGS Math.PI, Math.tan(), methods, operators-arithmetic, parameters, return, Scanner, Scanner.nextDouble(), Scanner.nextInt(),

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to compute the area of a polygon.
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output

The area is: 130.82084798405722
 */

import java.util.Scanner;

public class AreaOfPolygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon: ");
        int numberOfSides = input.nextInt();
        System.out.print("Input the length of one of the sides: ");
        double side = input.nextDouble();
        System.out.println("The area is: " + polygonArea(numberOfSides, side));
    }

    public static double polygonArea(int ns, double side) {
        return (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
    }
}
