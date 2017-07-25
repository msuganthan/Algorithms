package com.suganthan.bitwise;

/**
 * Created by msuganthan on 23/7/17.
 */
public class IsBinaryPalindrome {
    public static void main(String[] args) {
        byte[] byteArray = {1, 0, 0, 0, 0, 0, 1};
        int i = 0;
        int j = byteArray.length-1;
        boolean isPalindrome = true;
        while(i<=j) {
            if (byteArray[i] != byteArray[j]) {
                isPalindrome = false;
            }
            i++;
            j--;
        }
        System.out.println("The Palindrome status of the array is "+isPalindrome);
    }
}
