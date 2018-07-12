package com.suganthan.sorting;

/**
 * Created by msuganthan on 13/5/18.
 */
public class MergeSortIterative {

    public static void main(String[] args) {
        int[] unsortedArray = {1, 5, 7, 8, 2, 4, 6, 9};
        int[] sortedArray = new int[unsortedArray.length];
        int median = unsortedArray.length / 2;
        int[] firstArray = new int[median+1];
        int[] secondArray = new int[median+1];
        for (int i = 0, j = median; i < median && j < unsortedArray.length; i++, j++) {
            firstArray[i] = unsortedArray[i];
            secondArray[i] = unsortedArray[j];
        }
        firstArray[firstArray.length-1] = Integer.MAX_VALUE;
        secondArray[secondArray.length-1] = Integer.MAX_VALUE;
        System.out.println(firstArray);
        System.out.println(secondArray);

        int i =0, j =0;
        for (int k = 0; k < unsortedArray.length; k++) {
            if (firstArray[i] < secondArray[j]) {
                sortedArray[k] = firstArray[i];
                i++;
            } else {
                sortedArray[k] = secondArray[j];
                j++;
            }
        }
        System.out.println(sortedArray);
    }
}
