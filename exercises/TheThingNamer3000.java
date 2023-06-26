package exercises;

// TAGS block-comments, line-comments, Scanner, Scanner.next(), String, string-concatenation, System.in, System.out.println()

/* DESCRIPTION
// From RB Whitaker's "C# Player's Guide" - adjusted to Java

The Thing Namer 3000
As you walk through the city of Commenton, admiring its forward-slash-based
architectural buildings, a young man approaches you in a panic. “I dropped my Thing
Namer 3000 and broke it. I think it’s mostly working, but all my variable names got
reset! I don’t understand what they do!” He shows you the following program:
System.out.println("What kind of thing are we talking about?");
Scanner input = new Scanner(System.in);
String a = input.next();
System.out.println("How would you describe it? Big? Azure? Tattered?");
String b = input.next();
String c = "of Doom";
String d = "3000";
System.out.println("The " + b + " " + a + " of " + c + " " + d + "!");
“You gotta help me figure it out!”
Objectives:
- Rebuild the program above on your computer.
- Add comments near each of the four variables that describe what they store. You must use at least one of each comment type (// and /* ).
- Find the bug in the text displayed and fix it.
- Answer this question: Aside from comments, what else could you do to make this code more understandable?

To study if you find this difficult yet:

W3 schools Java Comments (https://www.w3schools.com/java/java_comments.asp)
 */

import java.util.Scanner;

public class TheThingNamer3000 {
    public static void main(String[] args) {
        System.out.println("What kind of thing are we talking about?");
        Scanner input = new Scanner(System.in);
        String a = input.next(); // get the kind of thing (preferably concrete noun, like "Bike" or "Book"
        System.out.println("How would you describe it? Big? Azure? Tattered?");
        String b = input.next();
        String c = "Doom";
        String d = "3000";
        /*
        Showing the final result, like "The Blue Waffle of Doom 3000!"
         */
        System.out.println("The " + b + " " + a + " of " + c + " " + d + "!"); // fixed bug: one too many "of's"
        // using good variable things, like "objectName, adjective of version instead of "a", "b" and "d" would be of
        // great help!
    }
}
