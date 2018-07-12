package com.suganthan.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by msuganthan on 5/7/18.
 */
public class ArrayListAddition {

    public static void main(String[] args) {
        String[] arr1 = {"a", "b", "c", "d", "e"};
        String[] arr2 = {"f", "g", "h", "i", "j"};
        combine(arr1, arr2);
    }

    static void combine(String[] arr1, String[] arr2) {
        List<String> combined = new ArrayList<>();
        for (String s: arr1)
            combined.add(s);
        for (String s: arr2)
            combined.add(s);
    }
}
