package exercises;

// TAGS boolean, byte, char, double, float, int, long, short, String, String-concatenation, System.out.println()

/* DESCRIPTION
// From RB Whitaker's "C# Player's Guide" - adjusted to Java
The Variable Shop
You see an old shopkeeper struggling to stack up variables in a window display. “Hoowee! All these variable types sure are exciting but setting them all up to show them
off to excited new programmers like yourself is a lot of work for these aching bones,”
she says. “You wouldn’t mind helping me set up this program with one variable of every
type, would you?”

Objectives:
- Build a program with a variable of all eight primitive Java types (as well as the 'text' type).
- Assign each of them a value using a literal of the correct type.
- Use System.out.println to display the contents of each variable.

To study if you find this difficult yet:
W3 schools Java Data Types - https://www.w3schools.com/java/java_data_types.asp
 */

public class TheVariableShop {
    public static void main(String[] args) {

        boolean iLikeCake = true;
        System.out.println("Do I like cake? " + iLikeCake);

        byte populationOfNeighboursFamily = 4; // note: you almost never use a byte or short or float in practice, but you should know their names!
        System.out.println("Number of people living next door: " + populationOfNeighboursFamily);

        short populationOfMaartensdijk = 4880;
        System.out.println("Number of people living in Maartensdijk: " + populationOfMaartensdijk);

        int populationOfTheNetherlands = 17_867_200; // note that you can use underscores to make long numbers more readable
        System.out.println("Number of people living in the Netherlands: " + populationOfTheNetherlands);

        long populationOfTheWorld = 8_033_065_973L; /* a suffix "L" or "l" needed to show that this is really a 'long' .
            that can store numbers up to  9,223,372,036,854,775,807 (an int can only store numbers up to 2_147_483_647,
            or a little more than 2 billion. Most developers prefer "L" to "l", as "l" can be more easily confused with
            "1" in code listings */
        System.out.println("Number of people living in the world: " + populationOfTheWorld);

        float averageHeightOfMenInNetherlands = 183.78F; /* without the 'f', this would be a double; just as int is the type that will be assigned
          to a whole number by default (in var x = 10; x will be an int, even if it would conveniently fit in a byte or a short)
          double is the standard type for non-whole numbers. Again, one can use 'f' or 'F' as suffix. Floats are rarely used in enterprise software,
          they only have a small advantage when having huge collections of numbers, but in most cases doubles are small and fast enough, and a lot more
          precise! */
        System.out.println("The average height of men in the Netherlands: " + averageHeightOfMenInNetherlands);

        double averageHeightOfWomenInNetherlands = 170.36;
        System.out.println("The average height of women in the Netherlands: " + averageHeightOfWomenInNetherlands);

        char myFavoriteLetter = 'E'; /* also works with 123 or 18273 instead of 'A' or '%', as a char is actually a positive number that is merely
            displayed as a letter on screen! */
        System.out.println("My favorite letter is '" + myFavoriteLetter + "'.");

        String myFavoriteWord = "neon"; /* if you need more than one letter, use a String instead of a char. Also note
            that a String requires DOUBLE quotes ("), chars like 'w' are surrounded by SINGLE quotes (as it is only
             a single letter. So 'e' is a char ('e'), while "e" is a String of length one.
             Why does String start with a capital instead of a lowercase letter like char? Because String is a so-called
             reference type, which can have a special value (null) and on which you can call methods, like "e".toUpperCase().
             You can't do those things with char: char x = null; won't compile, nor can you do something like 'q'.toUpperCase(),
             to make a char into uppercase you need something like Character.toUpperCase('q');.
             */
        System.out.println("My favorite word is '" + myFavoriteWord + "'.");
    }
}
