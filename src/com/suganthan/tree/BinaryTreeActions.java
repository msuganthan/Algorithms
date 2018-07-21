package com.suganthan.tree;

/**
 * Created by msuganthan on 21/7/18.
 */
public class BinaryTreeActions {
    private BinaryTree root;

    public void insert(int data) {
        root = insert(root, data);
    }

    private BinaryTree insert(BinaryTree node, int data) {
        if (node == null)
            node = new BinaryTree(data);
        else {
            if (node.getRightNode() == null)
                node.setRightNode(insert(node.getRightNode(), data));
            else
                node.setLeftNode(insert(node.getLeftNode(), data));
        }
        return node;
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(BinaryTree root) {
        if (root!=null) {
            inorder(root.getLeftNode());
            System.out.println(root.getValue());
            inorder(root.getRightNode());
        }
    }
}
