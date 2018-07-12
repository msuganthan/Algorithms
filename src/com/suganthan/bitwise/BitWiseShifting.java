package com.suganthan.bitwise;

/**
 * To understand how the leftwise works.
 * Created by msuganthan on 6/7/18.
 */
public class BitWiseShifting {
    public static void main(String[] args) {
        int numTwo = 2;
        //0010
        //0100 --> 4
        System.out.println(numTwo<<1);
        //0010
        //1000 --> 8
        System.out.println(numTwo<<2);
        //0000 0010
        //0001 0000 --> 16
        System.out.println(numTwo<<3);
        //0010
        //0001 --> 1
        System.out.println(numTwo>>1);
        //0010
        //0000 ?? zero is coming
        System.out.println(numTwo>>2);
        //0010
        //0000 ?? zero is coming
        System.out.println(numTwo>>5);


    }
}
