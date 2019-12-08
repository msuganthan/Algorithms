package com.suganthan.HackerRank.sorting;

/**
 * Created by msuganthan on 1/9/19.
 */
public class MinimumBribes {
    public static void main(String[] args) {
        minimumBribes(new int[]{ 1, 2, 5, 3, 7, 8, 6, 4 });
    }

    static void minimumBribes(int[] arr) {
        int move = 0;
        boolean tooChaotic = false;
        for (int i = 0; i < arr.length; i++) {
            /**
             * if any number is in more than 2 in advance position mark it is
             * too chaotic.
             */
            if (arr[i] - (i+1) > 2){
                System.out.println("Too chaotic");
                tooChaotic = true;
                break;
            }
            int calculateMove = (arr[i] - (i+1));
            if (calculateMove > 0)
                move += calculateMove;
        }
        if (!tooChaotic)
        System.out.println(move);
    }
}


//Real solution
//int temp = 0, count = 0, check =0;
//    int[] bribe = new int[1000000];
//    boolean isSorted = false;
//    boolean isGreaterbyTwo = false;
//        while(isSorted != true){
//                isSorted = true;
//                for(int i=q.length-1; i>0 ; --i){
//                if(q[i] < q[i-1]){
//        temp = q[i-1];
//        q[i-1] = q[i];
//        q[i] = temp;
//        bribe[q[i]]++;
//        count++;
//        if(bribe[q[i]] > 2) {
//        System.out.println("Too chaotic");
//        check++;
//        break;
//        }
//        isSorted = false;
//        }
//        }
//        }
//        if(check == 0)
//        System.out.println(count);
