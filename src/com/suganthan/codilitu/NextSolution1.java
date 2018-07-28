package com.suganthan.codilitu;

/**
 * Created by msuganthan on 28/7/18.
 */
public class NextSolution1 {

    public static void main(String[] args) {
        System.out.println(funt(new int[]{13,9, 8,1,12}));
    }

    static int[] funt(int[] A) {
        for (int i = 0; i < A.length-1; i++) {
            if (A[i] > A[i+1])
                A[i] = A[i+1];
        }
        return A;
    }
}
