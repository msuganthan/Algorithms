package com.suganthan.techgig;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by msuganthan on 19/5/19.
 */
public class CandidateCode {
    public static void main(String[] args) {
        Scanner input           = new Scanner(System.in);
        int numberOfTestCases   = input.nextInt();
        String[] result         = new String[numberOfTestCases];
        for (int i = 0; i < numberOfTestCases; i++) {
            int numberOfMembers         = input.nextInt();
            int[] villianStrength    = new int[numberOfMembers];
            int[] heroEnergy         = new int[numberOfMembers];

            input.nextLine();
            int j = 0;
            while (input.hasNextInt()) {
                villianStrength[j++] = input.nextInt();
                if (j == numberOfMembers)
                    break;
            }

            input.nextLine();
            j = 0;
            while (input.hasNextInt()) {
                heroEnergy[j++] = input.nextInt();
                if (j == numberOfMembers)
                    break;
            }

            Arrays.sort(villianStrength);
            Arrays.sort(heroEnergy);

            for (int ii = 0; ii < numberOfMembers; ii++) {
                result[i] = "WIN";
                if (villianStrength[ii] > heroEnergy[ii]) {
                    result[i] = "LOSE";
                    break;
                }
            }
        }
        Arrays.stream(result).forEach(System.out::println);
    }
}
