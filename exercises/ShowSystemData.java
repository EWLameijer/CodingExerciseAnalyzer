package exercises;

// TAGS System.getProperty()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Get the java data from the Java runtime system (Hint: System.getProperty())

Should result in something like
Java Version: 17.0.1
Java Runtime Version: 17.0.1+12-39
Java Home: D:\Program Files\Java\jdk-17.0.1
Java Vendor: Oracle Corporation
Java Vendor URL: https://java.oracle.com/
Java Class Path: D:\Development\ITvitae\JavaExercises\target\classes
 */

public class ShowSystemData {
    public static void main(String[] args) {
        System.out.println("\nJava Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
    }
}
