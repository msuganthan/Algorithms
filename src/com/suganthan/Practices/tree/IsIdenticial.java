package com.suganthan.Practices.tree;

import com.suganthan.crckcodingInterviews.treesandgraphs.TreeNodeActions;

/**
 * Check if two binary tree is identical or not.
 * Question taken from: http://www.techiedelight.com
 *
 * Created by msuganthan on 21/7/18.
 */
public class IsIdenticial {
    public static void main(String[] args) {
        TreeOperations operations = new TreeOperations();
        operations.insert(5);
        operations.insert(3);
        operations.insert(6);
        operations.insert(8);
        operations.insert(2);
        operations.insert(10);
        Tree node1 = operations.getRoot();

        TreeOperations operations1 = new TreeOperations();
        operations1.insert(5);
        operations1.insert(3);
        operations1.insert(6);
        operations1.insert(8);
        operations1.insert(2);
        operations1.insert(10);
        Tree node2 = operations1.getRoot();

        TreeOperations operations2 = new TreeOperations();
        System.out.println(operations2.isIdentical(node1, node2));
    }
}
