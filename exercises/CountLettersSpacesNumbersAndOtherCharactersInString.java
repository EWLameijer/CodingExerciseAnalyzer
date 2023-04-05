package exercises;

// TAGS Character.isDigit(), Character.isLetter(), Character.isSpaceChar(), methods, parameters, return, String.charAt(), String.length()

/* DESCRIPTION
https://www.w3resource.com/java-exercises/basic/index.php
Write a Java program to count the letters, spaces, digits and other characters of an input string.
Expected Output

The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letters: 23
spaces: 9
digits: 10
other: 6
 */

public class CountLettersSpacesNumbersAndOtherCharactersInString {
    public static void main(String[] args) {
        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        count(test);
    }

    public static void count(String text) {
        int letterCount = 0;
        int spaceCount = 0;
        int digitCount = 0;
        int otherCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isSpaceChar(ch)) {
                spaceCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("The string is : " + text);
        System.out.println("letters: " + letterCount);
        System.out.println("spaces: " + spaceCount);
        System.out.println("numbers: " + digitCount);
        System.out.println("other: " + otherCount);
    }
}
