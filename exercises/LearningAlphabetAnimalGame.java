package exercises;

// TAGS ArrayList, ArrayList.add(), char, do-loops, foreach-loops, if, List, List.of(), methods, operators-logical,
// Optional, Optional.empty(), Optional.isEmpty(), Optional.of(), parameters, return, Scanner, Scanner.next(),
// String.charAt(), String.equalsIgnoreCase(), System.in, System.out.print(), System.out.printf()

/* DESCRIPTION
    https://www.funology.com/alphabet-animal-game/
    There is a game where someone must say an animal name (like 'ant') and the next player has to say the name of an
    animal that starts with the last letter of that animal (like 'termite'), a third player should mention an animal
    whose name starts with the last letter of THAT (like an 'eagle')

    Goal: create a game where you can enter an animal, and the program responds by naming an animal whose name starts
    with the last letter of the animal you mentioned.
    If the program does not know an appropriate animal, it should say "I don't know any animal whose name starts with
    '[letter]'. You win! What would have been a good answer?"
    The player can then enter an animal name.
    The game then asks whether the player wants to play again.
    Let's also extend the game that if the computer replies, the player should mention another animal.

    Example run
    Name an animal: dog
    I don't know any animal whose name starts with 'g'. You win! What would have been a good answer? goldfish
    Do you want to play again? yes
    Name an animal: dog
    goldfish!
    Your turn! hawk
    I don't know any animal whose name starts with 'k'. You win! What would have been a good answer? koala
    Do you want to play again? no
    Thank you for playing!

    Hint: some sample animal names: cat, dog, turtle.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

// note: usually I would make a second class if the main program exceeds one page of code; that would however
// make this exercise more complicated to put on the list. Just be aware that usually for programs that get to
// this level of length and complexity, you make something like class Program { public static void main(String[] args) {
// var game = new AnimalGame();
// game.play();
//
// Then you can simply have a specialized AnimalGame class without any (or at least many) static methods and fields,
// which should also be easier to split up in other classes, if need be.
public class LearningAlphabetAnimalGame {
    private static final List<String> animals = new ArrayList<>(List.of("cat", "dog", "turtle"));

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            playGame();
            System.out.print("Do you want to play again? ");
            String answer = in.next();
            if (!answer.equalsIgnoreCase("yes")) break;
        } while (true);
        System.out.println("Thank you for playing!");
    }

    private static void playGame() {
        System.out.print("Name an animal: ");

        do {
            String playerAnimal = in.next();
            char lastLetter = playerAnimal.charAt(playerAnimal.length() - 1);
            Optional<String> foundAnimal = getAnimal(lastLetter);
            if (foundAnimal.isEmpty()) {
                askForGoodReply(lastLetter);
                return;
            } else {
                System.out.println(foundAnimal.get() + "!");
                System.out.print("Your turn! ");
                // note: a nice extension would be to check the animal name the player gives, or give the PLAYER
                // the ability to give up. For now, this program is long enough, though.
            }
        } while (true);
    }

    private static void askForGoodReply(char firstLetter) {
        System.out.printf("I don't know any animal whose name starts with '%c'. You win! ", firstLetter);
        System.out.print("What would have been a good answer? ");
        String newAnimal = in.next();
        animals.add(newAnimal);
    }

    // note: you can also return String and return null if you don't find an animal, but
    // in modern Java, using Optional<Type> if you may not get an answer is better, as the compiler
    // will then warn you if you try to use a possibly empty value; whereas returning null just
    // gives a chance of the compiler not warning you and your code throwing a NullPointerException at runtime.
    private static Optional<String> getAnimal(char lastLetter) {
        for (String animal : animals) {
            if (animal.charAt(0) == lastLetter) {
                return Optional.of(animal);
            }
        }
        return Optional.empty();
        // alternative:
        // return animals.stream().filter(name -> name.charAt(0) == lastLetter).findFirst();
    }
}

