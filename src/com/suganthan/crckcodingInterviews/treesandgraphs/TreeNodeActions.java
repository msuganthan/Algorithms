package com.suganthan.crckcodingInterviews.treesandgraphs;

/**
 * Created by msuganthan on 14/7/18.
 */
public class TreeNodeActions {
    private TreeNode root;

    public void addNode(int value) {
        root = addNodeRecursively(root, value);
    }

    public TreeNode addNodeRecursively(TreeNode current, int value) {
        if (current == null)
            return new TreeNode(value);

        if (value < current.getValue())
            current.setLeftNode(addNodeRecursively(current.getLeftNode(), value));
        else if (value > current.getValue())
            current.setRightNode(addNodeRecursively(current.getRightNode(), value));
        return current;
    }

    public void traverseInOrder(TreeNode node) {
        if (node != null) {
            traverseInOrder(node.getLeftNode());
            System.out.print(" "+node.getValue());
            traverseInOrder(node.getRightNode());
        }
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
