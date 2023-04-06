package exercises;

// TAGS for-loops, operators-arithmetic, remainder-operator, while-loops

/* DESCRIPTION
Print every integer between 100 and 150 (exclusive, so start at 100 and end at 149, [100, 150> )
of which the sum of digits is an even number.

Sample output
101
103
105
107
109
110
// ... etcetera
 */

public class EvenSumOfDigits {
    public static void main(String[] args) {
        for (int i = 100; i < 150; i++) {
            int num = i;
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            if (sum % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
