package com.suganthan.HackerRank.array;

/**
 * Created by msuganthan on 9/1/18.
 */
public class HourGlass2D {
    public static void main(String[] args) {

        int[][] sampleArray = new int[][]{
                {0, 1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5, 6},
                {2, 3, 4, 5, 6, 7},
                {3, 4, 5, 6, 7, 8},
                {4, 5, 6, 7, 8, 9},
                {5, 6, 7, 8, 9, 20}
        };

        new HourGlass2D().iterate(sampleArray);

    }

    /**
     * It is an 6 * 6 array
     * First increment i and j without any restriction
     */
    public void iterate(int[][] sampleArray) {
        int iterationOneCount = 0;
        for (int i = 0; i < sampleArray.length;i++) {
            for (int j = 0; j < 3;j++) {
                System.out.print(sampleArray[i][j]+ " ");
            }
            if(++iterationOneCount==3 && i != sampleArray.length-1) {
                i -= 2;
                iterationOneCount=0;
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
}
