package com.suganthan.leetcode.problems;

import java.util.HashMap;

/**
 * Created by msuganthan on 12/10/19.
 */
public class TwoSum {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{0, 4, 3, 0}, 0));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> storage = new HashMap<>();
        for (int i =0;i<nums.length;i++) {
            int element = nums[i];
            int key = target - nums[i];
            if(storage.containsKey(element)) {
                result[0] = storage.get(element);
                result[1] = i;
            }
            storage.put(key, i);
        }
        return result;
    }
}
