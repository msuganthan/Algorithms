package com.suganthan.crckcodingInterviews.linkedList;

/**
 * Implement an algorithm to delete a node in the middle(i.e. any node but the
 * first and last node not necessaryily the exact middle) of a singly linked
 * list, given only access to that node.
 * Created by msuganthan on 12/7/18.
 */
public class DeleteMiddleNode {

    public static void main(String[] args) {

    }
}

/**
 * We don't know the size, so what should we don have two pointer,
 * one is faster and another is slower. When the faster one reaches the end,
 * sure the slower one is going to stay in the middle.
 *
 * The issue with the above approach is you are not given with the head of the list.
 * You are given only the node to be deleted.
 */
