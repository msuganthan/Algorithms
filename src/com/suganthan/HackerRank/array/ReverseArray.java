package com.suganthan.HackerRank.array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Created by msuganthan on 1/1/18.
 */
public class ReverseArray {
    public static void main(String[] args) {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        int sizeOfArray = in.nextInt();
        in.nextLine();
        String elements = in.nextLine();
        String[] elementsArray = elements.split(" ");
        String[] stringArray = new String[sizeOfArray];
        for (int i = sizeOfArray-1, j = 0; i >= 0; i--, j++) {
            stringArray[j] = elementsArray[i];
        }
        String joiner = String.join(" ", stringArray);
        System.out.println(joiner);

    }
}
