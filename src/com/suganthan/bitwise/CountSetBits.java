package com.suganthan.bitwise;

/**
 * Created by msuganthan on 23/7/17.
 */
public class CountSetBits {
    public static void main(String[] args) {
        int x = 5;
        int bitCount = 0;
        for (int i = 1; i <= 5; i++) {
            bitCount+=countBits(i);
        }
        System.out.println("Total bitCount "+bitCount);
    }

    static int countBits(int x) {
        if(x<=0)
            return 0;
        return ( x % 2 == 0 ? 0 : 1) + countBits(x/2);
    }
}
