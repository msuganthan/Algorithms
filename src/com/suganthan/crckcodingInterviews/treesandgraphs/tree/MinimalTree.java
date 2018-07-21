package com.suganthan.crckcodingInterviews.treesandgraphs.tree;

/**
 * Given a sorted (increasing order) array with unique integer elements, write
 * an algorithm to create a binary search tree with minimal height.
 * Created by msuganthan on 17/7/18.
 */
public class MinimalTree {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        System.out.println("root data ==> "+root.data);
    }
}
