package com.suganthan.sorting;

/**
 * Created by msuganthan on 8/9/19.
 */
public class MinimumSwaps {

    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[]{7, 1, 3, 2, 4, 5, 6}));
    }

    static int minimumSwaps(int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            int key = i+1;
            int j = i;
            if(arr[j]!=key) {
                while(arr[j]!=key)
                    j+=1;
                count++;
                arr[j] = arr[i];
                arr[i] = key;
            }
        }
        return count;
    }
}
