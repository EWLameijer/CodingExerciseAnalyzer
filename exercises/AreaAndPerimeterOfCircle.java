package exercises;

// TAGS double, Math.PI, operators-arithmetic

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */

public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {
        double radius = 7.5;
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
