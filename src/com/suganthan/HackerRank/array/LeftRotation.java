package com.suganthan.HackerRank.array;

import java.util.Scanner;

/**
 * Created by msuganthan on 21/1/18.
 */
public class LeftRotation {
    static int[] leftRotation(int[] a, int d) {
        int originalSize = a.length-1;
        for (int i = 0; i < d; i++) {
            int key = a[0];
            for (int j = 0; j < originalSize; j++) {
                a[j] = a[j+1];
            }
            a[originalSize] = key;

        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfEle = in.nextInt();
        int shift = in.nextInt();
        int[] a = new int[numOfEle];
        for(int a_i = 0; a_i < numOfEle; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, shift);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
