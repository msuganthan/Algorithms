package com.suganthan.crckcodingInterviews.treesandgraphs;

/**
 * Created by msuganthan on 14/7/18.
 */
public class TreeNodeActionsTest {
    public static void main(String[] args) {
        TreeNodeActions actions = new TreeNodeActions();
        actions.addNode(5);
        actions.addNode(6);
        actions.addNode(8);
        actions.addNode(9);
        actions.addNode(2);
        actions.addNode(3);
        actions.traverseInOrder(actions.getRoot());
    }
}
