package com.suganthan.crckcodingInterviews.arraysAndString;

/**
 *
 * Implement a method to perform basic string compression using the counts of repeated chracters.
 * For examle the String aabcccccaaa would become a2b1c5a3.
 * If the compressed string would not become smaller than the original string, your method
 * should return the original string. You can assume you string has only uppercase and lwercase.
 * Created by msuganthan on 8/7/18.
 */
public class StringCompression {

    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa"));
    }

    static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;
            if (i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}
