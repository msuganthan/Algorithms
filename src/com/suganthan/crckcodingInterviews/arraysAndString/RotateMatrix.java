package com.suganthan.crckcodingInterviews.arraysAndString;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes.
 * Write a method to rotate the image by 90 degrees.
 * Created by msuganthan on 8/7/18.
 */
public class RotateMatrix {
    public static void main(String[] args) {
        rotate(new int[][] {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13, 15, 16}
        });
    }

    static boolean rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for (int layer = 0; layer < n /2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            System.out.println("first ==>"+first);
            System.out.println("last ==>"+last);
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];

                //left -> top
                System.out.println("matrix["+first+"]["+i+"] = matrix["+(last-offset)+"]["+first+"]");
                matrix[first][i] = matrix[last-offset][first];

                //bottom - left
                System.out.println("matrix["+(last-offset)+"]["+first+"] = matrix["+(last)+"]["+(last-offset)+"]");
                matrix[last-offset][first] = matrix[last][last-offset];

                //right -> bottom
                System.out.println("matrix["+(last)+"]["+(last-offset)+"] = matrix["+(i)+"]["+(last)+"]");
                matrix[last][last-offset] = matrix[i][last];

                //top -> right
                System.out.println("matrix["+(i)+"]["+(last)+"] = matrix["+first+"]["+i+"]");
                matrix[i][last] = top;

                System.out.println("\n\n");
            }
        }
        return true;
    }
}

/**
 * Initial thought process is to introduce a temp
 */
