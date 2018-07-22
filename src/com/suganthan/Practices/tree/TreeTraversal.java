package com.suganthan.Practices.tree;

/**
 * Inorder, Preorder, PostOrder Tree Traversal:
 * Question taken from: techiedelight.com
 * Created by msuganthan on 22/7/18.
 */
public class TreeTraversal {
    public static void main(String[] args) {
        TreeOperations operations = new TreeOperations();
        operations.insert(5);
        operations.insert(3);
        operations.insert(6);
        operations.insert(8);
        operations.insert(2);
        operations.insert(10);
        operations.insert(7);

        System.out.println("****************Inorder traversal**************");
        operations.inorder();

        System.out.println("****************Preorder traversal**************");
        operations.preorder();

        System.out.println("****************Postorder traversal**************");
        operations.postorder();

    }
}
