package com.suganthan.geeksforgeeks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by msuganthan on 25/2/18.
 */
public class SetToList {

    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("Apple");
        s.add("Banana");
        s.add("Cat");
        s.add("Dog");
        s.add("Elephant");

        List<String> stringList = s.stream().collect(Collectors.toList());
    }
}
