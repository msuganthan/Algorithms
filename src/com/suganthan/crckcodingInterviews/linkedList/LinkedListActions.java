package com.suganthan.crckcodingInterviews.linkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by msuganthan on 9/7/18.
 */
public class LinkedListActions {

    private Node head;

    public void setUp() {
        LinkedListActions actions = new LinkedListActions();
        actions.addElement(1);
        actions.addElement(2);
        actions.addElement(3);
        actions.addElement(4);
        actions.addElement(5);
        actions.addElement(6);
        actions.addElement(7);
        actions.addElement(8);
        actions.addElement(9);
        actions.display();
        //actions.removeDupsMtd2();
        //System.out.println("\n*************After removing the duplicates************");
        //actions.display();
        actions.nthToLast(3);
    }
    public void addElement(int elements) {
        Node node = new Node(elements);
        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(node);
    }

    public void display() {
        Node tmp = head;
        while(true){
            if(tmp == null) {
                break;
            }
            System.out.print(tmp.getValue()+ " -> ");
            tmp = tmp.getNext();
        }
     }

    /**
     * This solution takes O(N) time where N is the number of elements in the linked list.
     */

    public void removeDups() {
        Node curr = head;
        Node prev = head;
        Set<Integer> integers = new HashSet<>();
        while (curr != null) {
            if (integers.contains(curr.getValue())) {
                prev.setNext(curr.getNext());
            } else {
                integers.add(curr.getValue());
                prev = curr;
            }
            curr = curr.getNext();
        }
    }

    /**
     * This code runs in O(1) space but O(N^2) time.
     */
    public void removeDupsMtd2() {
        Node curr = head;
        Node prev = head;
        while (curr != null) {
            Node runner = curr.getNext();
            while(runner != null) {
                if (runner.getValue() == curr.getValue()) {
                    curr.setNext(runner.getNext());
                }
                runner = runner.getNext();
            }
            curr = curr.getNext();
        }
    }

    Node nthToLast(int k) {
        Node p1 = head;
        Node p2 = head;
        for (int i = 0; i < k; i++) {
            if (p1 == null) return null;
            p1 = p1.getNext();
        }

        while (p1 != null) {
            p1 = p1.getNext();
            p2 = p2.getNext();
        }
        return p2;
    }


    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

}


