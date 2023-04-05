package exercises;

// TAGS double, operators-arithmetic, Math.acos(), Math.cos(), Math.sin(), Math.toRadians(), methods, parameters, return, Scanner, Scanner.nextDouble()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to compute the distance between two points on the surface of earth.
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
Input the latitude of coordinate 1: 25
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
Expected Output

The distance between those points is: 1480.0848451069087 km
 */

import java.util.Scanner;

public class DistanceBetweenPointsOnSurfaceOfEarth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate 1: ");
        double firstLatitude = input.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double firstLongitude = input.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double secondLatitude = input.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double secondLongitude = input.nextDouble();

        System.out.println("The distance between those points is: " +
                distanceBetweenLatLong(firstLatitude, firstLongitude, secondLatitude, secondLongitude) + " km");
    }

    // Points will be converted to radians before calculation
    public static double distanceBetweenLatLong(double firstLatitude, double firstLongitude, double secondLatitude, double secondLongitude) {
        firstLatitude = Math.toRadians(firstLatitude);
        firstLongitude = Math.toRadians(firstLongitude);
        secondLatitude = Math.toRadians(secondLatitude);
        secondLongitude = Math.toRadians(secondLongitude);

        double earthRadius = 6371.01; //Kilometers
        return earthRadius * Math.acos(Math.sin(firstLatitude) * Math.sin(secondLatitude) +
                Math.cos(firstLatitude) * Math.cos(secondLatitude) * Math.cos(firstLongitude - secondLongitude));
    }
}
