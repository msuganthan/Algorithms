package com.suganthan.Practices.bitmanipulation;

/**
 * Created by msuganthan on 24/7/18.
 */
public class ParityCheck {
    public static void main(String[] args) {
        int n = 20;
        boolean parity = false;
        while (n > 0) {
            if ((n & 1) == 1)
                parity = !parity;
            n = n >> 1;
        }
    }
}
