package exercises;

// TAGS double, operators-arithmetic, System.out.printf()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.6 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class AreaAndPerimeterOfRectangle {
    public static void main(String[] strings) {

        final double width = 5.6;
        final double height = 8.5;

        double area = width * height;
        System.out.printf("Area is %.1f * %.1f = %.2f\n", width, height, area);
        double perimeter = 2 * (height + width);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f\n", height, width, perimeter);
    }
}
