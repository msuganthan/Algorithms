package com.suganthan.HackerRank.array;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Created by msuganthan on 26/1/18.
 */
public class ArrayManipulation {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] output = new long[n];
        IntStream.range(0,m).forEach(i -> {
            int a = in.nextInt()-1;
            int b = in.nextInt();
            int k = in.nextInt();
            output[a] += k;
            if(b < n) output[b] -= k;
        });
        long max=0;
        long temp=0;

        for(int i=0;i<n;i++){
            temp += output[i];
            if(temp> max) max=temp;
        }
    }
}
