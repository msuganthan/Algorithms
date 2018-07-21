package com.suganthan.crckcodingInterviews.treesandgraphs.tree;

/**
 * Write an algorithm to find the next node(i.e. in-order successor)
 * of a given node in a binary search tree. You many assume that
 * each node has a link to its parent.
 * Created by msuganthan on 18/7/18.
 */
public class Successor {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        for (int i = 0; i < array.length; i++) {
            TreeNode node = root.find(array[i]);
            TreeNode next = inOrderSucc(node);
            if (next != null) {
                System.out.println(node.data + "->" + next.data);
            } else {
                System.out.println(node.data + "->" + null);
            }
        }
    }

    static TreeNode inOrderSucc(TreeNode node) {
        if (node == null)
            return null;

        if (node.parent == null || node.right != null) {
            return leftMostChild(node.right);
        } else {
            TreeNode q = node;
            TreeNode x = q.parent;
            while (x != null && x.left != q) {
                q = x;
                x = x.parent;
            }
            return x;
        }
    }

    static TreeNode leftMostChild(TreeNode node) {
        if (node == null)
            return null;
        while (node.left != null)
            node = node.left;
        return node;
    }
}
