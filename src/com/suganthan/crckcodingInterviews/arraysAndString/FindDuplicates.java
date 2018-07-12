package com.suganthan.crckcodingInterviews.arraysAndString;

/**
 * From the book, cracking the coding interview.
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you can't use any additional data-structures.
 * Created by msuganthan on 7/7/18.
 */
public class FindDuplicates {

    public static void main(String[] args) {
        System.out.println(isUniqueChars("abcc"));
    }

    /**
     * We should able to iterate thru each character.
     * Each character should be kept in a corresponding index.
     * @param str
     * @return
     */
    static boolean isUniqueChars(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if((checker & (1<<val)) > 0) {
                return false;
            }
            checker |= 1<<val;
        }
        return true;
    }
}
