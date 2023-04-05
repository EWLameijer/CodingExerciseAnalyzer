package exercises;

import java.util.Scanner;

// TAGS Math.PI, Math.tan(), methods, operators-arithmetic, parameters, return, Scanner, Scanner.nextDouble

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to compute the area of a hexagon.
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6.0
Expected Output

The area of the hexagon is: 93.53074360871938
 */
public class AreaOfHexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        double side = input.nextDouble();
        System.out.println("The area of the hexagon is: " + hexagonArea(side));
    }

    public static double hexagonArea(double side) {
        return (6 * (side * side)) / (4 * Math.tan(Math.PI / 6));
    }
}
