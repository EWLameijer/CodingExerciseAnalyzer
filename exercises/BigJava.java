package exercises;

// TAGS text_blocks

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to display the following pattern. Go to the editor
Sample Pattern :

   J    a   v     v  a
   J   a a   v   v  a a
J  J  aaaaa   V V  aaaaa
 JJ  a     a   V  a     a
 */

public class BigJava {
    public static void main(String[] args) {
        System.out.println("""
                   J    a   v     v  a 
                   J   a a   v   v  a a
                J  J  aaaaa   V V  aaaaa
                 JJ  a     a   V  a     a""");
        // note: this is called the "text blocks feature" in Java
        // see also https://www.baeldung.com/java-multiline-string
    }
}
