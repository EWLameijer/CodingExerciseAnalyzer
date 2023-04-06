package exercises;

// TAGS recursion

/* DESCRIPTION
Print the numbers from 8 to 0, using recursion.
 */

public class RecursiveCountdown {
    public static void main(String[] args) {
        countDownTillZero(8);
    }

    public static void countDownTillZero(int n) {
        System.out.println(n);
        if (n == 0) return;
        countDownTillZero(n - 1);
    }
}
