package com.suganthan.bitwise;

/**
 * Created by msuganthan on 23/7/17.
 */
public class SwapBits {
    public static void main(String[] args) {
        //wrong
        byte[] byteArray = {0,0,1,0,1,1,1,1};
        int low = 1;
        int high = 5;
        int n = 3;
        int count = 0;
        while(count<n) {
            byte temp = byteArray[high];
            byteArray[high] = byteArray[low];
            byteArray[low] = temp;
            low++;
            high--;
        }
        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);
        }
    }
}
