package com.suganthan.Practices.bitmanipulation;

/**
 * Created by msuganthan on 22/7/18.
 */
public class SwapWithout3Var {
    public static void main(String[] args) {
        int x = 5;
        int y = 4;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x + " "+y);
    }
}
