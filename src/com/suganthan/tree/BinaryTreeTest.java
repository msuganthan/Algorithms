package com.suganthan.tree;

/**
 * Created by msuganthan on 21/7/18.
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTreeActions actions = new BinaryTreeActions();
        actions.insert(5);
        actions.insert(2);
        actions.insert(6);
        actions.insert(9);
        actions.insert(3);
        actions.insert(10);
        actions.inorder();
    }
}
