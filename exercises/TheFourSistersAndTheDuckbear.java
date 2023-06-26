package exercises;

// TAGS operators-arithmetic, remainder-operator, Scanner, Scanner.nextInt(), System.out.print(), System.out.println()

import java.util.Scanner;

/* DESCRIPTION
From RB Whitaker's "C# Player's Guide" - adjusted to Java

The Four Sisters and the Duckbear

Four sisters own a chocolate farm and collect chocolate eggs laid by chocolate
chickens every day. But more often than not, the number of eggs is not evenly
divisible among the sisters, and everybody knows you cannot split a chocolate egg into
pieces without ruining it. The arguments have grown more heated over time. The town is
tired of hearing the four sisters complain, and Chandra, the town’s Arbiter, has
finally come up with a plan everybody can agree to. All four sisters get an equal
number of chocolate eggs every day, and the remainder is fed to their pet duckbear.
All that is left is to have some skilled Programmer build a program to tell them how
much each sister and the duckbear should get.

Objectives:
- Create a program that lets the user enter the number of chocolate eggs gathered
that day.
- Using / and %, compute how many eggs each sister should get and how many are
left over for the duckbear.

Answer this question: What are the total egg counts where the duckbear gets
more than each sister does? You can use the program you created to help you
find the answer.

To study if you find this difficult yet:
Take another look at W3 schools Java Operators (https://www.w3schools.com/java/java_operators.asp)
 */
public class TheFourSistersAndTheDuckbear {
    public static void main(String[] args) {
        System.out.print("Please enter the number of chocolate eggs gathered: ");
        Scanner in = new Scanner(System.in);
        int numEggs = in.nextInt();
        int eggsPerSister = numEggs / 4;
        System.out.println("Each sister gets " + eggsPerSister + " egg(s).");
        int eggsForTheDuckbear = numEggs % 4;
        System.out.println("The duckbear gets " + eggsForTheDuckbear + " egg(s).");
        /*
        for (int eggs = 0; eggs < 100; eggs++ ) if (eggs % 4 > eggs /4)
            System.out.println("The duckbear gets more eggs at " + eggs + " eggs total.");
            // shows that the duckbear gets more eggs than any sister at a 1, 2, 3, 6, 7, and 11 eggs total.
         */
    }
}
