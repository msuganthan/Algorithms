// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
package com.suganthan.Practices;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Solution {
    public int solution(String originalMessage, int K) {
        String[] s = originalMessage.split(" ");
        List<String> messages = new ArrayList<>();
        int allowedLength = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            int builderLength = builder.length();
            if (builderLength > 1) {
                StringJoiner joiner = new StringJoiner(" ")
                        .add(builder.toString())
                        .add(s[i]);
                builder = new StringBuilder();
                builder.append(joiner.toString());
            } else {
                builder.append(s[i]);
            }
            if (builder.length() > K) {
                int index = builder.lastIndexOf(" ");
                StringBuilder sb = new StringBuilder();
                sb.append(builder.substring(0, index));
                messages.add(sb.toString());
                StringBuilder newBuilder = new StringBuilder();
                newBuilder.append(builder.substring(index + 1, builder.length()));
                builder = newBuilder;
                if ((builder.length() > 1) && (i == s.length - 1)) {
                    messages.add(builder.toString());
                }
            }
        }
        return 0;
    }
}