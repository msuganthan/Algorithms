package com.suganthan.bitwise;

/**
 * Created by msuganthan on 7/7/18.
 */
public class PrintBinary {
    public static void main(String[] args) {
        for (int i = 97; i < 122; i++) {
            System.out.println(Long.toString(i, 2));
        }
    }
}
