/*
Let's start with the number 10 and derive the sequence. 10 has digits 1 and 0. The next possible number that does not have a 1 or a 0 is 22. All other numbers between 10 and 22 have a 1 or a 0.
From 22, the next number that does not have a 2 is 11. Note that 30 is also a possibility because it is the next higher number that does not have a 2, but we must also look at possible lower numbers that are not already in the sequence.
From 11, the next number that does not have a 1 is 20, then 13, then 24 , then 15 and so on. Once a number appers in the series, it cannot appear again. You will be given an index number and your task will be return the element at that position. See test cases for more examples.
Note that the test range is n <= 500. Good luck!
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public static int findNum(int n) {

        List<Integer> passedNumbers = new ArrayList<>();

        boolean flag = false;

        if(n <= 10) {
            return n;
        }

        for(int num = 11, position = 10, previousNumber = 10, comeBackNum = 10; num <= 600; num++) {

            String[] dividedNumber = Integer.toString(num).split("");

            for(int i = 0; i < dividedNumber.length; i++) {
                if(Integer.toString(previousNumber).contains(dividedNumber[i])) {
                    flag = true;
                }
            }

            if(!flag && !passedNumbers.contains(num)) {
                if(++position == n) return num;
                passedNumbers.add(num);
                previousNumber = num;
                num = comeBackNum;
            }else {
                flag = false;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(Solution.findNum(500));
    }
}


/*String[] dividedPreviousNumber = Integer.toString(previousNumber).split("");
            for(int i = 0; i < dividedNumber.length; i++) {
                for(int j = 0; j < dividedPreviousNumber.length; j++) {
                    if(dividedNumber[i].equals(dividedPreviousNumber[j])) {
                        flag = true;
                    }
                }
            }*/