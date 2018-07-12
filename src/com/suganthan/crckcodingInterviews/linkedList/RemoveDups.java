package com.suganthan.crckcodingInterviews.linkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * Taken from cracking the coding interview book.
 * Write code to remove the duplicates from an unsorted linked list.
 *
 * Follow up
 *
 *
 * How would you solve this problem if a temporary buffer is not allowed.
 *
 * Created by msuganthan on 9/7/18.
 */
public class RemoveDups {
    public static void main(String[] args) {
        LinkedListActions linkedListActions = new LinkedListActions();
        linkedListActions.setUp();
    }


}
/**
 * Initial thought is to use a hash-map, and if the hash-map already contains the keys.
 * Then there is a duplicate.
 * If we can't use any other data-type then runner with O(N^2) is the only way to solve
 * this problem.
 *
 */