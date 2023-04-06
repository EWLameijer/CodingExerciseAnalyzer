package exercises;

// TAGS for-loops, remainder-operator

/* DESCRIPTION
Print all multiples of 3 between 10 and 50 (so [10,50>, so including 10, excluding 50)

Sample output:
12
15
18
21
...
45
48

*/

public class MultiplesOf3 {
    public static void main(String[] args) {
        for (int i = 10; i < 50; i++) {
            if (i % 3 == 0) System.out.println(i);
        }
    }
}
