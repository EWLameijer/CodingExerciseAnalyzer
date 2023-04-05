package exercises;

// TAGS if, methods, operators-arithmetic, parameters, return, remainder-operator

/* DESCRIPTION
Write a Java program to find the number of values in a given range divisible by a given value.
For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
Sample Output:

5
// because 6, 9, 12, 15 and 18 form 5 values!
 */

public class FindDivisibleNumbers {
    public static void main(String[] args) {
        System.out.println(result(5, 20, 3));
    }

    public static int result(int x, int y, int p) {
        int timesDivisorFits = (y - x) / p;
        int bonusDueToExactFit;
        if (x % p == 0) bonusDueToExactFit = 1;
        else bonusDueToExactFit = 0; // could also be done using int bonusForExactFit = x % p == 0 ? 1 : 0;
        return timesDivisorFits + bonusDueToExactFit;
    }
}
