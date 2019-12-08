package com.suganthan.HackerRank.algos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by msuganthan on 1/6/19.
 */
public class BetweenTwoSets {
    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int a, int b) {
        /*
         * Write your code here.
         */
        int i = 1;
        int count = 0;
        int res = 0;
        while(res <= b) {
            res = a * i;
            if (b % res == 0)
                count++;
            i++;
        }
        return count;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));*/

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int aa = lcm(a, a.length);
        int bb = findGCDForArray(b);


        int total = getTotalX(aa, bb);
        System.out.println(total);

        /*bw.write(String.valueOf(total));
        bw.newLine();

        bw.close();*/
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static int findGCDForArray(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(arr[i], result);
        }
        return result;
    }

    // Returns LCM of array elements
    static int lcm(int arr[], int n) {
        int ans = arr[0];
        for (int i = 1; i < n; i++) {
            ans = (((arr[i] * ans)) / (gcd(arr[i], ans)));
        }
        return ans;
    }
}
