package com.suganthan.Practices.bitmanipulation;

/**
 * Turn off kth bit of an integer.
 * set bit can be achieved thru 1<<i, to turn of do negation ~(1<<i)
 * techiedelight.com
 *
 * Created by msuganthan on 23/7/18.
 */
public class TurnOffKthBit {
    public static void main(String[] args) {
        int n = 20, k = 3;
        System.out.println(n&(~(1<<(k-1))));
    }
}
