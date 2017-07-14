package com.suganthan;

/**
 * Created by msuganthan on 14/7/17.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {9, 7, 6, 15, 16, 5, 10, 11};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >=0 && arr[j] > key) { //for ascending order, < for desending order
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
