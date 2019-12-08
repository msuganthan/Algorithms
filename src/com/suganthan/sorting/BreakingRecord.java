package com.suganthan.sorting;

/**
 * Created by msuganthan on 8/9/19.
 */
public class BreakingRecord {
    public static void main(String[] args) {
        breakingRecords(new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42,});
    }

    static int[] breakingRecords(int[] scores) {

        if (scores.length==0)
            return new int[] {0, 0};

        int min = scores[0];
        int max = scores[0];
        int minCount = 0;
        int maxCount = 0;
        for (int i = 1; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
                maxCount++;
            }
            else if (min > scores[i]) {
                min = scores[i];
                minCount++;
            }
        }
        return new int[] {maxCount, minCount};


    }
}
