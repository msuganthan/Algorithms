package com.suganthan.tree;

/**
 * Created by msuganthan on 21/7/18.
 */
public class BinaryTree {

    private int value;
    private BinaryTree leftNode;
    private BinaryTree rightNode;

    public BinaryTree(int value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryTree getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTree leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTree getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTree rightNode) {
        this.rightNode = rightNode;
    }
}
