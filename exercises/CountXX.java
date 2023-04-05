package exercises;

// TAGS for-loops, if, methods, parameters, return, String, String.length(), String.startsWith()

/* DESCRIPTION
https://codingbat.com/prob/p194667
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
 */
public class CountXX {
    public static void main(String[] args) {
        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
    }

    private static int countXX(String text) {
        int count = 0;
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.startsWith("xx", i)) count++;
        }
        return count;
    }
}
