package com.suganthan.Practices.recursion;

/**
 * Created by msuganthan on 28/7/18.
 */
public class ReverseString {
    public static void main(String[] args) {
        //reverseString(new char[]{'T','e','c','h','i','e',' ','D','e','l','i','g','h','t'}, -1);
        char[] charArray = new char[]{'T','e','c','h','i','e',' ','D','e','l','i','g','h','t'};
        reverse(charArray, 0, charArray.length-1);
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }
    }

    /**
     * This is by printing the data.
     * @param charArray
     * @param i
     */
    static void reverseString(char[] charArray, int i) {
        if(i == charArray.length-1)
            return;
        i = i + 1;
        reverseString(charArray, i);

    }

    /**
     * Swap between array only.
     * @param charArray
     * @param i
     * @param k
     */
    static void reverse(char[] charArray, int i, int k) {
        if(i == charArray.length/2)
            return;
        if (i<=k)
            swap(charArray, i, k);
        i = i + 1;
        k = k - 1;
        reverse(charArray, i, k);
    }

    static void swap(char[] charArray, int src, int dest) {
        char ch = charArray[src];
        charArray[src] = charArray[dest];
        charArray[dest] = ch;
    }
}
