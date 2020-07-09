/*
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
*/

import java.util.*;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String[] dividedStr = text.toLowerCase().split("");
        Set<String> counterList = new HashSet<>();
        String duplicateLetter;

        for(int i = 0; i < dividedStr.length; i++) {
            duplicateLetter = dividedStr[i];
            for(int j = 0; j < dividedStr.length;j++) {
                if(duplicateLetter.equals(dividedStr[j]) && i != j) counterList.add(dividedStr[j]);
            }
        }

        return counterList.size();
    }


    public static void main(String[] args) {
        System.out.println(duplicateCount("indivisibility"));
    }
}