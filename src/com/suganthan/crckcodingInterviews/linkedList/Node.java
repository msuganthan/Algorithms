package com.suganthan.crckcodingInterviews.linkedList;

/**
 * Created by msuganthan on 11/7/18.
 */
public class Node {
    private int value;
    private Node next;

    Node(int value) {
        this.value = value;
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Node{");
        sb.append("value=").append(value);
        sb.append(", next=").append(next);
        sb.append('}');
        return sb.toString();
    }

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
