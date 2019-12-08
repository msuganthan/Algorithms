package com.suganthan.techgig;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by msuganthan on 19/5/19.
 */
public class NeighbhorHood {
    public static void main(String[] args) {
        Scanner input                = new Scanner(System.in);
        int numberOfTestCases        = input.nextInt();

        for (int i = 0; i < numberOfTestCases; i++) {
            int numberOfElements    = input.nextInt();
            int[] tokens            = new int[numberOfElements];
            int[] stringBuilder1 = new int[numberOfElements/2 + 1];
            int[] stringBuilder2 = new int[numberOfElements/2 + 1];

            input.nextLine();
            int j = 0;
            int s1 = 0;
            int s2 = 0;
            int k = 0;
            int l = 0;
            while (input.hasNextInt()) {
                tokens[j] = input.nextInt();
                if (j%2 == 0 && tokens[j] > 0) {
                    s2 += tokens[j];
                    stringBuilder2[k++] = tokens[j];
                } else if (tokens[j] > 0) {
                    s1 += tokens[j];
                    stringBuilder1[l++] = tokens[j];
                }
                j++;
                if (j == numberOfElements) {
                    stringBuilder2[k] = 0;
                    stringBuilder1[l] = 0;
                    break;
                }
            }
            if (s1 > s2)
                for (int m = 0; m < stringBuilder1.length; m++) {
                    if (stringBuilder1[m] == 0)
                        continue;
                    System.out.print(stringBuilder1[m]);
                }
            else
                for (int m = stringBuilder2.length-1; m >= 0; m--) {
                    if (stringBuilder2[m] == 0)
                        continue;
                    System.out.print(stringBuilder2[m]);
                }
            System.out.println();
        }
    }
}
