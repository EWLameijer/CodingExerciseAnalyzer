package exercises;

// TAGS Array.index, arrays, methods, operators-logical, operators-relational, parameters, return, String, String.equals()

/* DESCRIPTION
https://edabit.com/challenge/vzhWSMR2A6wDyFK2o
Similar Bread
Given two arrays, which represent two sandwiches, return whether both sandwiches use the same type of bread.
 The bread will always be found at the start and end of the array.

Examples
hasSameBread(
  new String[]{"white bread", "lettuce", "white bread"},
  new String[]{"white bread", "tomato", "white bread"}
) ➞ true

hasSameBread(
  new String[]{"brown bread", "chicken", "brown bread"},
  new String[]{"white bread", "chicken", "white bread"}
) ➞ false

hasSameBread(
  new String[]{"toast", "cheese", "toast"},
  new String[]{"brown bread", "cheese", "toast"}
) ➞ false

Notes
The arrays will always be three elements long.
The first piece of bread on one sandwich must be the same as the first piece of bread on the other sandwich.
 The same goes for the last piece of bread.
 */

public class SimilarBread {
    public static void main(String[] args) {
        System.out.println(hasSameBread(
                new String[]{"white bread", "lettuce", "white bread"},
                new String[]{"white bread", "tomato", "white bread"}
        ));

        System.out.println(hasSameBread(
                new String[]{"brown bread", "chicken", "brown bread"},
                new String[]{"white bread", "chicken", "white bread"}
        ));

        System.out.println(hasSameBread(
                new String[]{"toast", "cheese", "toast"},
                new String[]{"brown bread", "cheese", "toast"}
        ));
    }

    private static boolean hasSameBread(String[] firstBread, String[] secondBread) {
        return firstBread[0].equals(secondBread[0]) && firstBread[2].equals(secondBread[2]);
    }
}
