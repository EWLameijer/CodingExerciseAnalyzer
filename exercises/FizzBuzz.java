package exercises;

// TAGS for-loops, methods, parameters, remainder-operator, return, String.isEmpty(), String-concatenation, System.out.print()

/* DESCRIPTION
Famous by for example the Coding Horror blogpost: Why Can't Programmer's ... Program?
https://blog.codinghorror.com/why-cant-programmers-program/

The problem: make a program that prints out the numbers from 1 to 100. HOWEVER, instead of printing just 1, 2, 3, .. 100
every number that is divisible by three should be replaced by Fizz, every number that is divisible by 5 by Buzz,
and every number that is divisible by 3 and 5 should be replaced by FizzBuzz

Desired output
1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 44 FizzBuzz 46 47 Fizz 49 Buzz Fizz 52 53 Fizz Buzz 56 Fizz 58 59 FizzBuzz 61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz 73 74 FizzBuzz 76 77 Fizz 79 Buzz Fizz 82 83 Fizz Buzz 86 Fizz 88 89 FizzBuzz 91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz
 */

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) System.out.print(fizzBuzz(i) + " ");
    }

    private static String fizzBuzz(int number) {
        String result = "";
        if (number % 3 == 0) result += "Fizz";
        if (number % 5 == 0) result += "Buzz";
        if (result.isEmpty()) return "" + number;
        else return result;
        // alternative: return result.isEmpty? ""+number : result
        // "" + number is an alternative to String.valueOf(number)
    }
}
