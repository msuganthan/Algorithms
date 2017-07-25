package com.suganthan;

/**
 * Created by msuganthan on 16/7/17.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            int j = i + 1;
            while(j < n) {
                if(arr[j]< arr[minIdx]) {
                    minIdx = j;
                }
                j++;
            }
            int keyElement = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = keyElement;

        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
