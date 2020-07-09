/*You have an array of numbers.
Your task is to sort ascending odd numbers but even numbers must be on their places.
Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.*/


import java.util.*;
import java.util.stream.Collectors;

public class Kata {

    public static int[] sortArray(int[] array) {

        List<Integer> positions = new ArrayList<>();
        List<Integer> values = new ArrayList<>();

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                positions.add(i);
                values.add(array[i]);
            }
        }

        List<Integer> sortedValues = values.stream().sorted().collect(Collectors.toList());

        for(int i = 0; i < sortedValues.size(); i++) {
            array[positions.get(i)] = sortedValues.get(i);
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{ 5, 3, 1, 8, 0 })));
    }
}
