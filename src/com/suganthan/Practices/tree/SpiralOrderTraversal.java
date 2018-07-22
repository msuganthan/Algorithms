package com.suganthan.Practices.tree;

/**
 * Implement Spiral order traversal.
 *
 * Incompleted:
 * Created by msuganthan on 22/7/18.
 */
public class SpiralOrderTraversal {

    public static void main(String[] args) {
        TreeOperations operations = new TreeOperations();
        operations.insert(5);
        operations.insert(3);
        operations.insert(7);
        operations.insert(8);
        operations.insert(2);
        operations.insert(4);
        operations.insert(6);
        operations.spiralOrderTraversal();
    }
}
