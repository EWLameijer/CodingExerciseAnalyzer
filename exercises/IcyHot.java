package exercises;

// TAGS boolean, if, methods, operators-logical, operators-relational, parameters, return

/* DESCRIPTION
// https://codingbat.com/prob/p192082
Given two temperatures, return true if one is less than 0 and the other is greater than 100.

icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
 */

public class IcyHot {
    public static void main(String[] args) {
        System.out.println(icyHot(120, -1));
        System.out.println(icyHot(-1, 120));
        System.out.println(icyHot(2, 120) );
    }

    private static boolean icyHot(int firstTemperature, int secondTemperature) {
        if ((firstTemperature < 0 && secondTemperature > 100) || (firstTemperature > 100 && secondTemperature < 0)) {
            return true;
        } else {
            return false;
        }
        // Could be written as: return ((temp1 < 0 && ...));
    }
}
