package exercises;

// TAGS double, operators-arithmetic

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to compute a specified formula. Go to the editor
Specified Formula :
4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
Expected Output
2.9760461760461765
 */

public class DoubleArithmeticContinued {
    public static void main(String[] args) {
        double result = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
        System.out.println(result);
        // bonus: 4.0 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...) and so on will converge to pi. It could be interesting
        // to create a for loop (or something) that converges to 3.1415... How many steps does it take to get to say
        // 3.14?
    }
}
