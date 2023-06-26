package exercises;

// TAGS foreach-loops, List, List.of(), Scanner, Scanner.next(), String.charAt(), String.length(), System.exit(), System.out.print(), System.out.printf()

import java.util.List;
import java.util.Scanner;

/* DESCRIPTION
    https://www.funology.com/alphabet-animal-game/

    There is a game where someone must say an animal name (like 'ant') and the next player has to say the name of an
    animal that starts with the last letter of that animal (like 'termite'), a third player should mention an animal
    whose name starts with the last letter of THAT (like an 'eagle')

    Goal: create a game where you can enter an animal, and the program responds by naming an animal whose name starts
    with the last letter of the animal you mentioned, or "I don't know any animal whose name starts with '[letter]'.
     You win!" if the computer does not know any animal whose name starts with the correct letter.

    Example run 1:
    Name an animal: cat
    turtle!

    Example run 2:
    Name an animal: dog
    I don't know any animal whose name starts with 'g'. You win!

    Hint: some sample animal names: cat, dog, turtle.
 */
public class AlphabetAnimalGame {
    public static void main(String[] args) {
        List<String> animals = List.of("cat", "dog", "turtle");
        System.out.print("Name an animal: ");
        Scanner in = new Scanner(System.in);
        String playerAnimal = in.next();
        char lastLetter = playerAnimal.charAt(playerAnimal.length() - 1);
        for (String animal : animals) {
            if (animal.charAt(0) == lastLetter) {
                System.out.println(animal + "!");
                System.exit(0);
            }
        }
        System.out.printf("I don't know any animal whose name starts with '%c'. You win!\n", lastLetter);
    }
}
