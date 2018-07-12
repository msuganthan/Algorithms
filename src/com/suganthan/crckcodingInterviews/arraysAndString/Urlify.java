package com.suganthan.crckcodingInterviews.arraysAndString;

/**
 * Write a method to replace all spaces in a string with %20. You may assume that the
 * string has sufficient space at the end to hold the additional characters and
 * that you are given the true length of the String.
 * Input: "Mr John Smith    ", 13
 * Otput: "Mr%20John%20Smith", 13
 *
 * Created by msuganthan on 7/7/18.
 */
public class Urlify {
    public static void main(String[] args) {
        char[] charsArray = {'M','r',' ','J','o','h','n',' ', 'S','m','i','t','h',' ',' ',' ',' '};
        urlify(charsArray, 13);
    }

    static void urlify(char[] str, int trueLength) {
        int originalLength = str.length;
        for (int i = trueLength-1; i >=0 ; i--) {
            if (str[i] == ' ') {
                str[originalLength-1] = '0';
                str[originalLength-2] = '2';
                str[originalLength-3] = '%';
                originalLength = originalLength-3;
            } else {
                str[originalLength-1] = str[i];
                originalLength--;
            }
        }
    }
}
/**
 * Discussion
 * Normal: String replace won't work, because it will result in "Mr%20John%20Smith%20%20%20%20"
 *
 * We have gotten original string length - 13
 */
