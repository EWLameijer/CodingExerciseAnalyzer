package exercises;

// TAGS ArrayList, char, for-loops, foreach-loops, if, HashMap, List, List.add(), List.contains(), Map, Map.get(),
// Map.keySet(), Map.put(), methods, parameters,
// return, Scanner, Scanner.nextLine(), String.toCharArray(), String.toLowerCase(), System.out.print(), ternary-operator

/* DESCRIPTION
Make a program that creates a histogram of characters (letters and digits) in a sentence given by the user. Uppercase
letters are counted as their lowercase variants (so 1 'A' and 2 'a' lead to 3 'a's)

Example run:
Please give a sentence to analyze: I'll give you 121 golden dubloons!
           *  *
           *  *
   ** * *  * **     *      *
 * ** * *  * **   * **  *  **
abcdefghijklmnopqrstuvwxyz0123456789
 */

import java.util.*;

public class CharacterHistogram {
    public static void main(String[] args) {
        System.out.print("Please give a sentence to analyze: ");
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        showHistogram(sentence);
    }

    private static void showHistogram(String sentence) {
        List<Character> relevantChars = createListOfRelevantCharacters();
        Map<Character, Integer> counts = countCharacters(sentence, relevantChars);
        displayHistogram(relevantChars, counts);
    }

    private static List<Character> createListOfRelevantCharacters() {
        List<Character> relevantChars = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z'; ch++) relevantChars.add(ch);
        for (char ch = '0'; ch <= '9'; ch++) relevantChars.add(ch);
        return relevantChars;
    }

    private static void displayHistogram(List<Character> relevantChars, Map<Character, Integer> counts) {
        int highestCount = getHighestCount(counts);
        for (int count = highestCount; count > 0; count--) {
            for (char ch : relevantChars) {
                char display = counts.get(ch) >= count ? '*' : ' ';
                System.out.print(display);
            }
            System.out.println();
        }

        // lambda's work in the above loop, but are not much of an improvement:
        // int finalCount = count;
        // var line = relevantChars.stream().map(ch -> counts.get(ch) >= finalCount ? "*" : " ").collect(Collectors.joining());

        for (char ch : relevantChars) System.out.print(ch);
    }

    private static int getHighestCount(Map<Character, Integer> counts) {
        int highestCount = 0;
        for (char key : counts.keySet()) {
            int currentCount = counts.get(key);
            if (currentCount > highestCount) highestCount = currentCount;
        }
        return highestCount;
        // If you can use streams, you can use
        // return counts.values().stream().max(Integer::compare).orElse(0);
        // of course, it is not worth then to make this a separate method
    }

    private static Map<Character, Integer> countCharacters(String sentence, List<Character> relevantChars) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char ch : relevantChars) counts.put(ch, 0);
        for (char ch : sentence.toLowerCase().toCharArray()) {
            if (relevantChars.contains(ch)) counts.put(ch, counts.get(ch) + 1);
        }
        return counts;
    }
}
