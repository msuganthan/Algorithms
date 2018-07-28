package com.suganthan.codilitu;

/**
 * Created by msuganthan on 28/7/18.
 */
public class Solution {

    public static void main(String[] args ){

    }

    public String solution(String s) {
        char c = s.charAt(0);
        if (Character.isUpperCase(c)) {  // please fix condition
            return "upper";
        } else if(Character.isLowerCase(c)) {  // please fix condition
            return "lower";
        } else if (Character.isDigit(c)){  // please fix condition
            return "digit";
        } else {
            return "other";
        }
    }
}
