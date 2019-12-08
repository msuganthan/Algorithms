package com.suganthan.Practices.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by msuganthan on 29/7/18.
 */
public class Permutation {
    public static void main(String[] args) {
        List<String> output = generatePermutations("ABCD");
        //output.stream().forEach(System.out::println);
    }

    static List<String> generatePermutations(String input) {
        List<String> strList = new ArrayList<>();
        permutations("", input, strList);
        return strList;
    }

    static void permutations(String consChars, String input,
                             List<String> opContainer) {
        if (input.isEmpty()) {
            opContainer.add(consChars + input);
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            System.out.println(" consChars + input.charAt(i)  : "+consChars + input.charAt(i));
            System.out.println(" input.substring(0, i) + input.substring(i + 1) : "+input.substring(0, i) + input.substring(i + 1));
            permutations(consChars + input.charAt(i),
                    input.substring(0, i) + input.substring(i + 1),
                    opContainer);
        }
    }
}
