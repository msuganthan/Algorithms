package com.suganthan.Practices.tree;

/**
 * Created by msuganthan on 21/7/18.
 */
public class Tree {
    private int value;
    private Tree left;
    private Tree right;

    public Tree(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }
}
