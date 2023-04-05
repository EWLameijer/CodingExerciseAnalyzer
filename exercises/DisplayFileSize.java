package exercises;

// TAGS Files, Files.size(), Paths, Paths.get(), Scanner, Scanner.next(), System.out.printf(), try-catch

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to find the size of a specified file.
Sample Output:

Give the name of a file: C:\config.ini
C:\config.ini : 153 bytes

ideally, also handle the case that the file is not found.
HINT: For many utility methods around files, look at the Files API! (or google how to find the size of a file in Java :))
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class DisplayFileSize {
    public static void main(String[] args) {
        System.out.print("Give the name of a file: ");
        Scanner in = new Scanner(System.in);
        String filename = in.next();
        try {
            System.out.printf("%s : %d bytes", filename, Files.size(Paths.get(filename)));
        } catch (IOException e) {
            System.out.println("Error: " + filename + " does not seem to exist!");
        }
    }
}
