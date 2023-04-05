package exercises;

// TAGS Character.toUpperCase(), Scanner, Scanner.hasNext(), Scanner.next(), Scanner.nextLine(), String.substring(),
// String.charAt(), String.trim(),
// string-concatenation

/* DESCRIPTION
Write a Java program to capitalize the first letter of each word in a sentence.
Sample Output:

Input a Sentence: the quick brown fox jumps over the lazy dog.
The Quick Brown Fox Jumps Over The Lazy Dog.
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class CapitalizeEachWordInASentence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = in.nextLine();

        String upperCasedLine = "";
        Scanner lineScan = new Scanner(line);
        while (lineScan.hasNext()) {
            String word = lineScan.next();
            upperCasedLine += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upperCasedLine.trim());

        /*
        // Another option is to use String.join on an ArrayList
        String[] words = line.split(" ");
        ArrayList<String> uppercaseWords = new ArrayList<>();
        for (String word : words) uppercaseWords.add(Character.toUpperCase(word.charAt(0)) + word.substring(1));
        System.out.println(String.join(" ", uppercaseWords));

        // A third option is to use a stream instead of a loop:
        var capitalized = String.join(" ", Stream.of(line.split(" ")).
                map(w -> Character.toUpperCase(w.charAt(0)) + w.substring(1)).toList());
        System.out.println(capitalized);
         */
    }
}
