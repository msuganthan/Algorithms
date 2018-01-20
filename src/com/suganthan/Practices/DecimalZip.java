package com.suganthan.Practices;

/**
 * Created by msuganthan on 1/1/18.
 */
public class DecimalZip {
    public static void main(String[] args) {
        new DecimalZip().solution(123, 67890);
    }
    public int solution(int A, int B) {
        // write your code in Java SE 8
        char[] firstNumber = Integer.toString(A).toCharArray();
        char[] secondNumber = Integer.toString(B).toCharArray();
        int largestArray = firstNumber.length > secondNumber.length ? firstNumber.length : secondNumber.length;
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < largestArray; i++ ){
            if(firstNumber.length > i) {
                builder.append(firstNumber[i]);
            }
            if(secondNumber.length > i) {
                builder.append(secondNumber[i]);
            }
        }
        final int result = Integer.parseInt(builder.toString());
        if(result > 100000000) {
            return -1;
        }
        return result;
    }
}
