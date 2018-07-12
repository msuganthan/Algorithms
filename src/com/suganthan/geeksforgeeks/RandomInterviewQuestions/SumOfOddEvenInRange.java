package com.suganthan.geeksforgeeks.RandomInterviewQuestions;

import java.util.Scanner;

/**
 * Created by msuganthan on 13/5/18.
 */
public class SumOfOddEvenInRange {
    public static void main(String[] args) {
        int numbers = 0;
        int start = 0;
        int end = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        System.out.println("numbers = ");
        numbers = scanner.nextInt();
        System.out.println("Range = ");
        start = scanner.nextInt();
        end = scanner.nextInt();

        int numberOfOdd = 0;
        if (numbers % 2 == 0) {
            numberOfOdd = numbers / 2;
        } else {
            numberOfOdd = (numbers / 2) + 1;
        }

        if (end <= numberOfOdd) {
            sum = end * end;
        } else {
            int numberOfEven = end - numberOfOdd;
            sum = numberOfOdd * numberOfOdd + (numberOfEven * numberOfEven) + numberOfEven;
        }

        System.out.println("Sum : "+sum);
    }
}
