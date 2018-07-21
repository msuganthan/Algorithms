package com.suganthan.Practices.tree;

/**
 * Created by msuganthan on 21/7/18.
 */
public class TreeOperations {
    private Tree root;

    public void insert(int data) {
        root = insert(root, data);
    }

    private Tree insert(Tree node, int data) {
        if (node == null) {
            return new Tree(data);
        } else {
            if (data <= node.getValue())
                node.setLeft(insert(node.getLeft(), data));
            else
                node.setRight(insert(node.getRight(), data));
        }
        return node;
    }

    /**
     * Recursive way to check, wh
     * @param node1
     * @param node2
     * @return
     */
    public boolean isIdentical(Tree node1, Tree node2) {
        if (node1 == null && node2 == null)
            return true;

        return (node1.getValue() == node2.getValue()) &&
                isIdentical(node1.getLeft(), node2.getLeft()) &&
                isIdentical(node1.getRight(), node2.getRight());
    }

    public int height() {
        return height(root);
    }

    private int height(Tree node) {
        if (node == null)
            return 0;

        return Math.max(height(node.getLeft()), height(node.getRight())) + 1;
    }

    public Tree getRoot() {
        return root;
    }
}
