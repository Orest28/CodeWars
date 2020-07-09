/*Write a function that takes an integer as input,
and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.
Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class BitCounting {

    public static int countBits(int n) {
        String binaryStr = "";

        while(n / 2 != 0) {
            binaryStr = binaryStr.concat(Integer.toString(n%2));
            n /= 2;
        }

        binaryStr = binaryStr.concat(Integer.toString(n%2));

        return Math.toIntExact(Arrays.stream(binaryStr.split("")).filter(s -> s.equals("1")).count());
    }

    public static void main(String[] args) {
        System.out.println(countBits(7));
    }
}
