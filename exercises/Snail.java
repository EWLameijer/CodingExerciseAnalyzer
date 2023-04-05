package exercises;

// TAGS Array.length, ArrayList, for-loops, HashSet, List, List.add, List.stream(), records, Set, Set.add(), Set.contains(), Set.isEmpty(),
// Set.remove(), Stream.mapToInt(), Stream.toArray(), while-loops

/* DESCRIPTION
https://www.codewars.com/kata/521c2db8ddc89b9b7a0000c1/train/java
Snail Sort
Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.

array = [[1,2,3],
         [4,5,6],
         [7,8,9]]
snail(array) #=> [1,2,3,6,9,8,7,4,5]
For better understanding, please follow the numbers of the next array consecutively:

array = [[1,2,3],
         [8,9,4],
         [7,6,5]]
snail(array) #=> [1,2,3,4,5,6,7,8,9]

NOTE: The idea is not sort the elements from the lowest value to the highest; the idea is to traverse the 2-d array in a clockwise snailshell pattern.

NOTE 2: The 0x0 (empty matrix) is represented as en empty array inside an array [[]].

NOTE 3: the tags SUGGEST a solution, but it is perfectly possible to do snail sort with just a couple of loops.
      The most important thing is that you think of a solution you find easy/logical and can implement,
      even if it is not the fanciest or shortest in existence (in this phase, as many lines of code per hour is
      way more important than finding the most elegant solution)
 */

import java.util.*; // for Set

public class Snail {

    public static void main(String[] args) {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] output = snail(input);
        System.out.println(Arrays.toString(output));
    }

    // snail sort: transform a 2D-array into a 1D-array with the first element being the top left corner of the 2D-array,
    // spiralling in clockwise towards the middle element.
    public static int[] snail(int[][] array) {
        List<Integer> sortedCoordinates = new ArrayList<>();
        var currentDirection = new Direction(1, 0);
        var currentCoordinate = new Coordinate(0, 0);
        Set<Coordinate> unexploredCoordinates = getAllCoordinates(array);
        while (!unexploredCoordinates.isEmpty()) {
            unexploredCoordinates.remove(currentCoordinate);
            sortedCoordinates.add(array[currentCoordinate.y][currentCoordinate.x]);
            if (!unexploredCoordinates.contains(currentCoordinate.plus(currentDirection)))
                currentDirection = currentDirection.turnRight();
            currentCoordinate = currentCoordinate.plus(currentDirection);
        }
        // https://stackoverflow.com/questions/718554/how-to-convert-an-arraylist-containing-integers-to-primitive-int-array
        return sortedCoordinates.stream().mapToInt(i -> i).toArray();
    }

    private static Set<Coordinate> getAllCoordinates(int[][] inputArray) {
        Set<Coordinate> allCoordinates = new HashSet<>();
        int xDimension = inputArray[0].length; // {{1,2,3},{4,5,6}} is an array[2][3]
        int yDimension = inputArray.length;
        for (int x = 0; x < xDimension; x++) {
            for (int y = 0; y < yDimension; y++) {
                allCoordinates.add(new Coordinate(x, y));
            }
        }
        return allCoordinates;
    }

    record Coordinate(int x, int y) {
        public Coordinate plus(Direction direction) {
            return new Coordinate(x + direction.dx(), y + direction.dy());
        }
    }

    record Direction(int dx, int dy) {
        public Direction turnRight() {
            return new Direction(-dy, dx);
        }
    }
}