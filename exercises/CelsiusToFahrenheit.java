package exercises;

// TAGS operators-arithmetic, Scanner, Scanner.nextDouble()

/* DESCRIPTION
Make a program that converts temperatures in centigrade to temperatures in Fahrenheit.
Input:
Enter temperature in Centigrade: 30

Temperature in Fahrenheit is: 86.0
 */

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println("Enter temperature in Centigrade: ");
        Scanner in = new Scanner(System.in);
        double temperatureInC = in.nextDouble();
        double temperatureInF = 9 * temperatureInC / 5 + 32;
        System.out.println("Temperature in Fahrenheit is: " + temperatureInF);
    }
}
