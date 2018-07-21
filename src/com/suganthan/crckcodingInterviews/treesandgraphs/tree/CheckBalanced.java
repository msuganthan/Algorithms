package com.suganthan.crckcodingInterviews.treesandgraphs.tree;

/**
 * Implement a function to check if a binary tree is balanced. For the
 * purpose of this question, a balanced tree is defined to be a tree
 * such that the heights of the two subtrees of any node never differ
 * by more than one.
 * Created by msuganthan on 17/7/18.
 */
public class CheckBalanced {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        System.out.println("Root ?"+ root.data);
        System.out.println("Is Balanced ? "+isBalanced(root));


    }

    static int getHeight(TreeNode root) {
        if (root == null)
            return -1;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    static boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        int heightDiff = getHeight(root.left) - getHeight(root.right);
        if (Math.abs(heightDiff) > 1)
            return false;
        else
            return isBalanced(root.left) && isBalanced(root.right);
    }
}
