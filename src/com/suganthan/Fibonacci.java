package com.suganthan;

/**
 * Created by msuganthan on 30/12/17.
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(calcFibo(6));
    }

    /*static int calcFibo(int n) {
        if(n<=1) {
            return n;
        }
        return calcFibo(n-1) + calcFibo(n-2);
    }*/

    static int calcFibo(int n) {
        int f0 = 0;
        int f1 = 1;
        int fibo = 0;
        for (int i = 2; i <= n; i++) {
            fibo = f0 + f1;
            f0 = f1;
            f1 = fibo;
        }
        return fibo;
    }
}
