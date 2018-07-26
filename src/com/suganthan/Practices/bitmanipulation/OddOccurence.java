package com.suganthan.Practices.bitmanipulation;

/**
 * Find all odd occuring elements in an array having
 * limited range of elements.
 * techiedelight.com
 *
 * Given an array having elements b/w 0 to 31, find elements which
 * occurs odd number of times without using extra space.
 * Created by msuganthan on 25/7/18.
 */
public class OddOccurence {
    public static void main(String[] args) {
        //int[] A = {1,2,3,4,1,2,3,4,5};
        //System.out.println(getOddOccurence(A));

        int AA[] = { 5, 8, 2, 5, 8, 2, 8, 5, 1, 8, 2 };
        findRepeating(AA);
    }

    static int getOddOccurence(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }
        return res;
    }

    /**
     * I don't have any idea about this.
     * @param A
     */
    static void findRepeating(int A[])  {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]+ " "+ ((1 << A[i])));
            xor ^= (1 << A[i]);
        }
        System.out.println(" xor "+xor);

        System.out.println("The odd occurring elements are: ");
        for (int i = 0; i < A.length; i++) {
            if ((xor & (1 << A[i])) > 0) {
                System.out.printf("%d ", A[i]);
                xor ^= (1 << A[i]); // to avoid printing duplicates
            }
        }
    }
}
