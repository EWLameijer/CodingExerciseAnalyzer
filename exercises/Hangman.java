package exercises;

import java.util.ArrayList;
import java.util.Scanner;

// TAGS ArrayList, ArrayList.add(), boolean, char, for-loops, foreach-loops, if, int, Scanner, String, String.charAt(),
// TAGS System.out.print() String.toUpperCase()

/* DESCRIPTION
Make a Hangman game
user 1 should enter a word
user 2 should see only underscores for each letter in the word, and should guess a letter
if a letter is correct, the underscore in the displayed word is replaced by the correct letter
if the word has been filled in completely, display the message that the user has won
if the word has not been filled in completely after a number of turns (say 10), display that the user has lost,
and show the word.
 */

public class Hangman {
    public static void main(String[] args) {
        System.out.println("Please enter a word");
        Scanner in = new Scanner(System.in);
        String wordToGuess = in.next().toUpperCase();
        ArrayList<Character> guessedLetters = new ArrayList<>();
        for (int turn = 1; turn <= 10; turn++) {
            System.out.println("Please guess a letter");
            char guess = in.next().toUpperCase().charAt(0); // quick and dirty just get first letter
            guessedLetters.add(guess);
            boolean guessed = true;
            for (char letter : wordToGuess.toCharArray()) {
                if (guessedLetters.contains(letter)) System.out.print(letter);
                else {
                    System.out.print('_');
                    guessed = false;
                }
                System.out.print(" ");
            }
            System.out.println();
            if (guessed) {
                System.out.println("Congratulations! You guessed the word!");
                return;
            }
        }
        System.out.println("Sorry - you didn't guess the word correctly in 10 turns. The correct word was '" + wordToGuess + "'.");
    }
}
