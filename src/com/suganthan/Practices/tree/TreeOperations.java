package com.suganthan.Practices.tree;

import com.suganthan.crckcodingInterviews.treesandgraphs.graph.revisedVersion.state.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    public void inorder() {
        inorder(root);
    }

    public void inorder(Tree node) {
        if (node == null)
            return;
        inorder(node.getLeft());
        System.out.println(node.getValue());
        inorder(node.getRight());
    }

    public void preorder() {
        preorder(root);
    }

    public void preorder(Tree node) {
        if (node == null)
            return;
        System.out.println(node.getValue());
        inorder(node.getLeft());
        inorder(node.getRight());
    }

    public void postorder() {
        postorder(root);
    }

    public void postorder(Tree node) {
        if (node == null)
            return;
        inorder(node.getLeft());
        inorder(node.getRight());
        System.out.println(node.getValue());
    }

    public void levelOrder() {
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Tree tempNode = queue.poll();
            System.out.print(tempNode.getValue() + " ");

            if (tempNode.getLeft() != null)
                queue.add(tempNode.getLeft());

            if (tempNode.getRight() != null)
                queue.add(tempNode.getRight());
        }
    }

    public void reverseLevelOrder() {
        Queue<Tree> queue = new LinkedList<>();
        Stack<Tree> stack = new Stack<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Tree tempNode = queue.poll();
            stack.push(tempNode);

            if (tempNode.getLeft() != null)
                queue.add(tempNode.getLeft());

            if (tempNode.getRight() != null)
                queue.add(tempNode.getRight());
        }

        while (stack.empty() == false) {
            Tree temp = stack.peek();
            System.out.print(temp.getValue() + " ");
            stack.pop();
        }
    }

    public void spiralOrderTraversal() {
        Stack<Tree> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Tree temp = stack.peek();
            stack.pop();

            System.out.print(temp.getValue() + " ");

            if (temp.getLeft() != null) {
                stack.push(temp.getLeft());
            }

            if (temp.getRight() != null) {
                stack.push(temp.getRight());
            }
        }
    }

    public Tree getRoot() {
        return root;
    }
}
