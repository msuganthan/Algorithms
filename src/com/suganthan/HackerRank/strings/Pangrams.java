package com.suganthan.HackerRank.strings;

import java.util.Arrays;
import java.util.stream.Stream;

public class Pangrams {
    public static void main(String[] args) {
        System.out.println(pangrams(""));
    }

    static String pangrams(String s) {
        char[] chars = "All of the letters of the alphabet are present in the string.".toLowerCase().toCharArray();
        int arr[] = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 97 && chars[i] <= 122)
                arr[chars[i]-97]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1)
                return "not pangram";
            continue;
        }
        return "pangram";
    }
}
