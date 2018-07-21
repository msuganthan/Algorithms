package com.suganthan.crckcodingInterviews.bitmanipulation;

/**
 * Created by msuganthan on 21/7/18.
 */
public class Bitwise {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(16));
        System.out.println(gtBit(16, 1));
    }

    static boolean gtBit(int num, int i) {
        System.out.println((num & (1 << i)));
        return ((num & (1 << i)) != 0);
    }
}
