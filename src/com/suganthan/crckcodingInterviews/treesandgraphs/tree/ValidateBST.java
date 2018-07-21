package com.suganthan.crckcodingInterviews.treesandgraphs.tree;

/**
 * Implement a function to check if a binary tree is a binary search tree.
 * Created by msuganthan on 18/7/18.
 */
public class ValidateBST {
    private static Integer last_printed = null;
    public static void main(String[] args) {

    }

    static boolean checkBST(TreeNode node) {
        return checkBST(node, true);
    }

    static boolean checkBST(TreeNode node, boolean isLeft) {
        if (node == null)
            return true;

        if (!checkBST(node.left, true))
            return false;

        if (last_printed != null) {
            if (isLeft) {
                if (node.data < last_printed)
                    return false;
            } else {
                if (node.data <= last_printed)
                    return false;
            }
        }
        last_printed = node.data;

        if (!checkBST(node.right, false))
            return false;
        return true;
    }
}
