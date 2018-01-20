package com.suganthan;

/**
 * Created by msuganthan on 30/12/17.
 */
public class FibonacciWithMemo {

    int calcFibo(int n) {
        if(n<=1) {
            return n;
        }
        if(memo[n] != 0) {
            return memo[n];
        }
        memo[n] = calcFibo(n-1) + calcFibo(n-2);
        return memo[n];
    }
    public static void main(String[] args) {
        System.out.println(new FibonacciWithMemo().calcFibo(40));
    }
    int[] memo = new int[50];
}
