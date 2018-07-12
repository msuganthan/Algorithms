package com.suganthan.crckcodingInterviews.arraysAndString;

/**
 * There are three types of edits can be performed on strings: insert a character,
 * remove a chracter or replace a character. Given two strings, write a function
 * to check if they are one edit away
 *
 * Example:
 *
 * pale    ple    -> true
 * pales   pale   -> true
 * pale    bale   -> true
 * pale    bae    -> false
 *
 * Created by msuganthan on 8/7/18.
 */
public class OneEditAway {
    public static void main(String[] args) {
        System.out.println(oneEditAway("pale", "ple"));
    }

    static boolean oneEditAway(String first, String second) {
        if ((first.length() - second.length()) > 1) {
            return false;
        }
        String s1 = first.length() < second.length() ? first : second;
        String s2 = first.length() < second.length() ? second : first;

        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;
        while (index2 < s2.length() && index1 < s1.length()) {
            if(s1.charAt(index1) != s2.charAt(index2)) {
                if(foundDifference) return false;
                foundDifference = true;
                if (s1.length() == s2.length())
                    index1++;
            } else {
                index1++;
            }
            index2++;

        }
        return true;
    }
}
