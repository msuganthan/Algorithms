package com.suganthan.bitwise;

/**
 * Created by msuganthan on 23/7/17.
 */
public class IsOppositeSign {
    public static void main(String[] args) {
        System.out.println(isOppositeSign(5, -3));
    }

    static boolean isOppositeSign(int x, int y) {
        System.out.println(x^y);
        return ((x^y)<0);
    }
}
