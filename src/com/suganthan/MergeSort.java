package com.suganthan;

/**
 * Created by msuganthan on 14/7/17.
 */
public class MergeSort {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int arr[] = {9, 7, 6, 15, 16, 5, 10, 11};
        mergeSort.sort(arr, 0, arr.length-1);
        for (int l = 0; l < arr.length; l++)
            System.out.print(arr[l]+", ");
    }

    public void sort(int[] arr, int l, int r) {
        if(l<r) {
            int m = (l+r)/2;
            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }

    public void merge(int[] arr, int p, int m, int q) {
        //merge(arr, 1, 2, 2)
        int n1, n2;
        n1 = m - p + 1;
        n2 = q - m;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[p+i];
        }

        for (int i = 0; i < n2; i++) {
            right[i] = arr[m+1+i];
        }

        int i = 0, j = 0;
        int k = p;
        while(i < n1 && j < n2) {
            if(left[i]<right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            arr[k] = right[j];
            j++;
            k++;
        }

    }
}