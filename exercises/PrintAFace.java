package exercises;

// TAGS text-blocks

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to print a face. Go to the editor
Expected Output

 +"""""+
[| o o |]
 |  ^  |
 | '-' |
 +-----+
 */

public class PrintAFace {
    public static void main(String[] args) {
        System.out.println("""
                 +""\"""+
                [| o o |]
                 |  ^  |
                 | '-' |
                 +-----+
                 """);
    }
}
