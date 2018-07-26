package com.suganthan.Practices.bitmanipulation;

/**
 * Created by msuganthan on 24/7/18.
 */
public class ChangeCase {
    public static void main(String[] args) {
        for (int i = 0; i < 10000000; i++) {
            for (char ch='A'; ch <= 'Z'; ch++) {
                System.out.println(Character.toChars(ch | ' '));
            }
        }


        /*for (char ch='a'; ch <= 'z'; ch++) {
            System.out.println(Character.toChars(ch & '_'));
        }*/
    }
}
