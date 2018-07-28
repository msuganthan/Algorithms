package com.suganthan.codilitu;

/**
 * Created by msuganthan on 28/7/18.
 */
public class NextSolution {

    public static void main(String[] args) {
        new NextSolution().solution(123456);
    }

    public int solution(int A) {
        // write your code in Java SE 8
        char[] chars = (""+A).toCharArray();
        int length = chars.length;
        int lengthBy2 = length/2;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0, j = length-1; i <= j; i++, j--) {
            if (i==j)
                stringBuilder.append(chars[j]);
            else
                stringBuilder.append(chars[i])
                        .append(chars[j]);
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}
