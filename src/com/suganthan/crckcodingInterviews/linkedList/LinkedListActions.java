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
        actions.addElement(3);
        actions.addElement(5);
        actions.addElement(8);
        actions.addElement(5);
        actions.addElement(10);
        actions.addElement(2);
        actions.addElement(1);
        //actions.addElement(8);
        //actions.addElement(9);
        actions.display();
        //actions.removeDupsMtd2();
        //System.out.println("\n*************After removing the duplicates************");
        //actions.display();
        //actions.nthToLast(3);
        //actions.deleteNode(null);
        actions.partition(5);
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

    /**
     * This algorithm takes O(n) time and O(1) space.
     * @param k
     * @return
     */
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

    /**
     *
     * @return
     */
    boolean deleteNode(Node node) {
        if (node == null || node.getNext()==null)
            return false;
        Node nextNode = node.getNext();
        node.setValue(nextNode.getValue());
        node.setNext(nextNode.getNext());
        return false;
    }

    /**
     *
     * @return
     */
    Node partition(int x) {
        Node temp = head;
        Node lesserThan = temp;
        Node greaterThan = temp;

        while (temp != null) {
            if (temp.getValue() < x ) {
                temp.setNext(lesserThan);
                lesserThan = temp;
            } else {
                greaterThan.setNext(temp);
                greaterThan = temp;
            }
            Node next = temp.getNext();
            temp = next;
        }
        greaterThan.setNext(null);
        return lesserThan;

    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

}


