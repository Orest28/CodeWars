/*
	In this simple Kata your task is to create a function that turns a string into a Mexican Wave.
	You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MexicanWave {
    public static String[] wave(String str) {
        if(str.length() == 0) return str.split("");
        List<String> waves = new ArrayList<>();
        String[] splittedStr = str.split("");
        for(int i = 0; i < splittedStr.length; i++) {
            if(!splittedStr[i].equals(" ")) waves.add(str.substring(0,i).concat(str.substring(i,i+1).toUpperCase()).concat(str.substring(i+1)));
        }

        return waves.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(wave("hello")));
    }
}
