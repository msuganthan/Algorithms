package com.suganthan.geeksforgeeks;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by msuganthan on 25/2/18.
 */
public class SetToArray {

    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("Apple");
        s.add("Banana");
        s.add("Cat");
        s.add("Dog");
        s.add("Elephant");

        String[] arr = s.stream().toArray(String[]::new);

        for (String x : arr)
            System.out.println(x);
    }
}
