package com.suganthan.crckcodingInterviews.arraysAndString;

import java.util.Arrays;

/**
 * From the book cracking the coding interview
 * Given two strings, write a method to decide of one is a permutation of the other.
 * Created by msuganthan on 7/7/18.
 */
public class CheckPermutation {

    public static void main(String[] args) {
        System.out.println(isEquals("Suganthan", "Sugnantha"));
    }

    static boolean isEquals(String s, String t) {
        if(s.length() != t.length())
            return false;

        int[] letters = new int[128];
        //count the number of each char in first array
        for (char c: s.toCharArray()) {
            letters[c]++;
        }
        for (char c: t.toCharArray()) {
            letters[c]--;
            if(letters[c] < 0) {
                return false;
            }
        }
        return true;

    }

}

/**
 * Discussion: even if it is a permutation of a string, sorting both the string would result in
 * same result.
 *
 * But we will do it in a different way
 * 1. First find all the element in the string and increase the cout.
 * 2. Second for another string do the same.
 */