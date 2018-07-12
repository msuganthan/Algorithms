package com.suganthan.HackerRank.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by msuganthan on 22/1/18.
 */
public class SparseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStrings = scanner.nextInt();
        scanner.nextLine();
        Map<String, Integer> inputStrings = new HashMap<>();
        for (int i = 0; i < numberOfStrings; i++) {
            String input = scanner.nextLine();
            Integer count = inputStrings.get(input);
            if (count == null) {
                count = 0;
            }
            count++;
            inputStrings.put(input, count);
        }
        int queryStrings = scanner.nextInt();
        int[] finalCount = new int[queryStrings];
        scanner.nextLine();
        for (int i = 0; i < queryStrings; i++) {
            String query = scanner.nextLine();
            Integer count = inputStrings.get(query);
            if (count==null) {
                finalCount[i] = 0;
            } else {
                finalCount[i] = inputStrings.get(query);
            }
            System.out.println(finalCount[i]);
        }


    }
}
