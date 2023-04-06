package exercises;

// TAGS debugging, methods, parameters, return, String, String.equals(), String-concatenation

/* DESCRIPTION
https://edabit.com/challenge/fY3bzat74jGhLMepS
Emmy has written a function that returns a greeting to users. However, she's in love with Mubashir, and would like to greet him slightly differently. She added a special case in her function, but she made a mistake.

Can you help her?

Examples
greeting("Matt") ➞ "Hello, Matt!"
greeting("Helen") ➞ "Hello, Helen!"
greeting("Mubashir") ➞ "Hello, my Love!"

Notes
READ EVERY WORD CAREFULLY, CHARACTER BY CHARACTER!
Don't overthink this challenge; it's not supposed to be hard.

CODE

public class Program {
    public static void main(String[] args) {
        System.out.println(greeting("Mubashir"));
    }

    public static String greeting(String name) {
        return "Hello, " + name + "!";
        if(name == "Mubashir") {
            return "Hello, my Love!";
        }
    }
}

--> create a correct version of this program!
 */

public class HelloMyLoveBug {
    public static void main(String[] args) {
        System.out.println(greeting("Mubashir"));
    }

    public static String greeting(String name) {
        if (name == "Mubashir") {
            return "Hello, my Love!";
        } else return "Hello, " + name + "!";
        // note that usually you need to use .equals to compare Strings, this only works because both Mubashir's are
        // 'hardcoded'. If you'd get a name using scanner.next(), for example, == will fail!
        // of course, the problem was (as IntelliJ indicated) that the method stopped at the first return statement;
        // the second return statement is never reached
        // You can also do this using a ternary operator - the shortest yet still correct way would be
        // return name.equals("Mubashir") ? "Hello, my Love!" : "Hello, " + name + "!";
    }
}
