package com.suganthan.crckcodingInterviews.treesandgraphs.tree;

/**
 * Created by msuganthan on 17/7/18.
 */
public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;
    private int size = 0;

    public TreeNode(int data) {
        this.data = data;
        size = 1;
    }

    private void setLeftChild(TreeNode left) {
        this.left = left;
        if(left != null) {
            left.parent = this;
        }
    }

    private void setRightChild(TreeNode right) {
        this.right = right;
        if (right != null) {
            right.parent = this;
        }
    }

    TreeNode find(int d) {
        if (d == data)
            return this;
        else if (d <= data)
            return left != null ? left.find(d) : null;
        else if (d > data)
            return right != null ? right.find(d) : null;
        return null;
    }

    private static TreeNode createMinimalBST(int arr[], int start, int end) {
        if (end < start)
            return null;

        int mid = (start + end) / 2;
        TreeNode treeNode = new TreeNode(arr[mid]);
        treeNode.setLeftChild(createMinimalBST(arr, start, mid - 1));
        treeNode.setRightChild(createMinimalBST(arr, mid + 1, end));
        return treeNode;
    }

    public static TreeNode createMinimalBST(int array[]) {
        return createMinimalBST(array, 0, array.length-1);
    }
}
